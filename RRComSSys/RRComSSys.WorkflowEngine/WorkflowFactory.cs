using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.Xsl;
using System.Xml.Serialization;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine
{
    public class WorkflowFactory
    {
        /// <summary>
        /// Creates the workflow runtime.
        /// </summary>
        /// <param name="wfObj">The wf obj.</param>
        /// <returns></returns>
        public static WFRunner CreateWorkflowRuntime(Workflow wfObj)
        {
            WFRunner runner = null;
            Exception except;
                
            try
            {
                TransformationEngine.Boundary start =
                    wfObj.Boundary.Find(x => x.Type.Equals(BoundaryType.Start));

                TransformationEngine.Boundary end =
                    wfObj.Boundary.Find(x => x.Type.Equals(BoundaryType.End));

                ConnectTheLines(wfObj, start, end, out runner);

            }
            catch(Exception innerExcept)
            {
                throw innerExcept;
            }            
            return runner;
        }

        private static void ConnectTheLines(Workflow wfObj, TransformationEngine.Boundary start, TransformationEngine.Boundary end, out WFRunner runner)
        {
            runner = new WFRunner();
            WFElement currentElement = new Boundary(start);
            WFElement endElement = new Boundary(end);
            
            runner.WorkflowElements.Add(currentElement);
            // Recurse into the edges between the nodes....
            BuildNextElement(runner, currentElement, endElement, wfObj);
            // 
            runner.WorkflowElements.Add(endElement);
        }

        /// <summary>
        /// Builds the next element.
        /// </summary>
        /// <param name="runner">The runner.</param>
        /// <param name="currentElement">The current element.</param>
        /// <param name="endElement">The end element.</param>
        /// <param name="wfInstance">The wf instance.</param>
        private static void BuildNextElement(WFRunner runner, WFElement currentElement,WFElement endElement, Workflow wfInstance)
        {
          WFElement outElement = null;

          if (currentElement.GetType() == typeof (Boundary))
          {
              // This should only be entered into during the top level invocation
              // i.e. for the "Start" boundary itself.
              
              TransformationEngine.Call aCall =
                wfInstance.Call.Find(x => x.activityID.Equals(currentElement.nextActivityID()));
              if ( null != aCall )
              {
                // Create and add the new call...set this boundary as one of it's predecessors  
                outElement = new Call(aCall, wfInstance);
                outElement.PreviousElements.Add(currentElement);
                runner.WorkflowElements.Add(outElement);
                BuildNextElement(runner, outElement, endElement, wfInstance);  
              }
              else
              {
                if (currentElement.nextActivityID().Equals(endElement.getActivityID()))
                {
                  // Empty workflow...just add the start as a previous element to the end.
                  endElement.PreviousElements.Add(currentElement);
                }
              }
          }
          else if (currentElement.GetType() == typeof (Call))
          {
            TransformationEngine.Decision isDecision =
              wfInstance.Decision.Find(x => x.activityID.Equals(currentElement.nextActivityID()));
            if (null != isDecision)
            {
              // If the next item is a DECISION
              WFElement possibleElement = ElementExistsInWorkflow(runner, isDecision.activityID);
              if (null == possibleElement)
              {
                // Add this call as a previous Element of this Element, and unroll
                if (!possibleElement.PreviousElements.Contains(currentElement))
                  possibleElement.PreviousElements.Add(currentElement);
              }
              else
              {
                outElement = new Decision(isDecision, wfInstance);
                
                // Add the Call to the Decision's PreviousElements
                outElement.PreviousElements.Add(currentElement);
                
                // Add the Decision to the Workflow 
                runner.WorkflowElements.Add(outElement);
                
                // Try to build next Element
                BuildNextElement(runner, outElement, endElement, wfInstance);  
              }
            }
            else
            {
              // Otherwise we've hit a boundary ( which should be the end boundary, but let's make sure
              TransformationEngine.Boundary isBoundary =
                wfInstance.Boundary.Find(x => x.activityID.Equals(currentElement.nextActivityID()));
              
              if (isBoundary.Type.Equals("End"))
              {
                endElement.PreviousElements.Add(currentElement);
                // unroll 
              }
              else
              {
                throw new Exception("Boundary that isn't an end boundary encountered immediately after a Call activity");
              }
            }
          }
          else if (currentElement.GetType() == typeof (Decision))
          {
            TransformationEngine.Decision decision = ((Decision) currentElement).DecisionModel;
            string successID = decision.successPathID;
            string failID = decision.failPathID;
            if (null != runner.WorkflowElements.Find(x => (x.getActivityID().Equals(successID))))
            {
              // Find the item that this is  
              // Construct the Success Branch
              ConstructDecisionBranch(runner,currentElement,successID,endElement,wfInstance);
            }
            else if (null != runner.WorkflowElements.Find(x => x.getActivityID().Equals(failID)))
            {
              // Find the item that this is  
              // Construct the Fail Branch
              ConstructDecisionBranch(runner, currentElement, failID, endElement, wfInstance);
            }
          }
        }

        /// <summary>
        /// Constructs the decision branch.
        /// </summary>
        /// <param name="runner">The runner.</param>
        /// <param name="currentElement">The current element.</param>
        /// <param name="elementActivityID">The element activity ID.</param>
        /// <param name="endElement">The end element.</param>
        /// <param name="wfInstance">The wf instance.</param>
        private static void ConstructDecisionBranch(WFRunner runner, WFElement currentElement, string elementActivityID, WFElement endElement, Workflow wfInstance)
        {
            TransformationEngine.Call possibleCall = wfInstance.Call.Find(x => x.activityID.Equals(elementActivityID));
            if (null != possibleCall)
            {
              // We know it's a call
              // See if it's already within the workflow
              WFElement possibleElement = ElementExistsInWorkflow(runner,possibleCall.activityID);
              if (null != possibleElement)
              {
                // If it isn't, add it, and keep recursing.   
                WFElement outElement = new Call(possibleCall, wfInstance);
                outElement.PreviousElements.Add(currentElement);
                runner.WorkflowElements.Add(outElement);
                BuildNextElement(runner, outElement, endElement, wfInstance);
              }
            }
            else
            {
              // MUST be the "End" boundary
              // Add this Decision to the "End" boundaries previousElements
              endElement.PreviousElements.Add(currentElement);
              // return
            }
        }

        /// <summary>
        /// Elements the exists in workflow.
        /// </summary>
        /// <param name="runner">The runner.</param>
        /// <param name="activityID">The activity ID.</param>
        /// <returns></returns>
        private static WFElement ElementExistsInWorkflow(WFRunner runner, string activityID)
        {
          return runner.WorkflowElements.Find(x => x.getActivityID().Equals(activityID));
        }
      
    }
    
}
