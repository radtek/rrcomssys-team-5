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
        public  WFRunner CreateWorkflowRuntime(Workflow wfObj)
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

        private  void ConnectTheLines(Workflow wfObj, TransformationEngine.Boundary start, TransformationEngine.Boundary end, out WFRunner runner)
        {
            runner = new WFRunner();
            WFElement currentElement = new Boundary(start,wfObj);
            WFElement endElement = new Boundary(end,wfObj);
            
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
        private  void BuildNextElement(WFRunner runner, WFElement currentElement,WFElement endElement, Workflow wfInstance)
        {
          WFElement outElement = null;

          if (currentElement.GetType() == typeof (Boundary))
          {
              // This should only be entered into during the top level invocation
              // i.e. for the "Start" boundary itself.

              string nextActivity = currentElement.NextActivityID();
              //TransformationEngine.Call aCall =
              // wfInstance.Call.Find(x => x.activityID.Equals(nextActivity));
              TransformationEngine.Call aCall = wfInstance.Call.Find(x=>x.activityID.Equals(nextActivity));//[WorkflowFactory.IndexOfActivity(nextActivity)];
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
                if (currentElement.NextActivityID().Equals(endElement.GetActivityID()))
                {
                  // Empty workflow...just add the start as a previous element to the end.
                  endElement.PreviousElements.Add(currentElement);
                }
              }
          }
          else if (currentElement.GetType() == typeof(Call))
          {
             ConstructCall(runner, currentElement, endElement, wfInstance);
          }
          else if (currentElement.GetType() == typeof(Decision))
          {
            TransformationEngine.Decision decision = ((Decision) currentElement).DecisionModel;
            string successID = decision.successPathID;
            string failID = decision.failPathID;

            currentElement.DefaultNextActivityID = successID;

            if (null == runner.WorkflowElements.Find(x => (x.GetActivityID().Equals(successID))))
            {
              // Find the item that this is  
              // Construct the Success Branch
              ConstructDecisionBranch(runner,currentElement,successID,endElement,wfInstance);
            }
            if (null == runner.WorkflowElements.Find(x => x.GetActivityID().Equals(failID)))
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
        private void ConstructDecisionBranch(WFRunner runner, WFElement currentElement, string elementActivityID, WFElement endElement, Workflow wfInstance)
        {
            TransformationEngine.Call possibleCall = wfInstance.Call.Find(x => x.activityID.Equals(elementActivityID));
            if (null != possibleCall)
            {
              // We know it's a call
              // See if it's already within the workflow
              WFElement possibleElement = ElementExistsInWorkflow(runner,possibleCall.activityID);
              if (null == possibleElement)
              {
                // If it isn't, add it, and keep recursing.   
                WFElement outElement = new Call(possibleCall, wfInstance);
                outElement.PreviousElements.Add(currentElement);
                currentElement.DefaultNextActivityID = outElement.GetActivityID();
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
        private WFElement ElementExistsInWorkflow(WFRunner runner, string activityID)
        {
          return runner.WorkflowElements.Find(x => x.GetActivityID().Equals(activityID));
        }

        /// <summary>
        /// Constructs the call.
        /// </summary>
        /// <param name="runner">The runner.</param>
        /// <param name="currentElement">The current element.</param>
        /// <param name="endElement">The end element.</param>
        /// <param name="wfInstance">The wf instance.</param>
        private void ConstructCall(WFRunner runner, WFElement currentElement, WFElement endElement, Workflow wfInstance)
        {
          WFElement outElement = null;
          Call theCall = (Call) currentElement;
          string callToDecision = theCall.CallModel().CallToDecision;
          string callToBoundary = theCall.CallModel().CallToBoundary;

          TransformationEngine.Boundary calledBoundary = (!string.IsNullOrEmpty(callToBoundary)) ? wfInstance.Boundary[WorkflowFactory.IndexOfActivity(callToBoundary)] 
                                                                                                : null;

          TransformationEngine.Decision calledDecision = (!string.IsNullOrEmpty(callToDecision)) ? wfInstance.Decision[WorkflowFactory.IndexOfActivity(callToDecision)]
                                                                                                : null;

          if (null != calledBoundary )
          {
              if (calledBoundary.Type.Equals(TransformationEngine.BoundaryType.End))
              {
                  if( (null != calledDecision ) && (null == currentElement.PreviousElements.Find(x=>x.GetActivityID().Equals(calledDecision.activityID))))
                  {
                      throw new Exception(
                          "Call Cannot be Connected to a Decision and End Elements without having parsed the Decision");
                  }
                  currentElement.DefaultNextActivityID = endElement.GetActivityID();
                  endElement.PreviousElements.Add(currentElement);
                  return; // If I've hit an END Boundary node, no need to look at the Decision node
              }
          }
           
          if (null != calledDecision)
          {
              if (null !=
                  currentElement.PreviousElements.Find(x => x.GetActivityID().Equals(calledDecision.activityID)))
              {
                  throw new Exception("Decision was already connected to this Call"); 

              }
              else
              {
                    outElement = new Decision(calledDecision, wfInstance);
            
                    // Add the Call to the Decision's PreviousElements
                    outElement.PreviousElements.Add(currentElement);
                    // Set Default Next Activity ID
                    currentElement.DefaultNextActivityID = outElement.GetActivityID();
                    // Add the Decision to the Workflow 
                    runner.WorkflowElements.Add(outElement);
            
                    // Try to build next Element
                    BuildNextElement(runner, outElement, endElement, wfInstance);
              }
          }
        }
        /// <summary>
        /// Indexes the of activity.
        /// </summary>
        /// <param name="activityId">The activity id.</param>
        /// <returns></returns>
        public static int IndexOfActivity(string activityId)
        {
            return int.Parse(activityId.Substring(activityId.LastIndexOf('.') + 1));
        }

    }
    
}
