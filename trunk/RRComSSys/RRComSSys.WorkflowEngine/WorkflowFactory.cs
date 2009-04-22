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
    class WorkflowFactory
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
            WFElement nextElement = BuildNextElement(currentElement, wfObj);
            runner.WorkflowElements.Add(currentElement);

            while ( nextElement.getActivityID() != endElement.getActivityID() )
            {
               runner.WorkflowElements.Add(nextElement);
               nextElement = BuildNextElement(nextElement,wfObj);  
            }

            runner.WorkflowElements.Add(endElement);
        }

        private static WFElement BuildNextElement(WFElement element, Workflow wfInstance)
        {
            WFElement outElement = null;

            if (element.GetType() == typeof(Boundary))
            {
                TransformationEngine.Call aCall =
                    wfInstance.Call.Find(x => x.activityID.Equals(element.nextActivityID()));
                outElement = new Call(aCall, wfInstance);
            }
            else if (element.GetType() == typeof(Call))
            {
                TransformationEngine.Decision isDecision =
                    wfInstance.Decision.Find(x => x.activityID.Equals(element.nextActivityID()));
                if (null != isDecision)
                {
                    outElement = new Decision(isDecision, wfInstance);
                }
                else
                {
                    TransformationEngine.Boundary isBoundary =
                        wfInstance.Boundary.Find(x => x.activityID.Equals(element.nextActivityID()));
                    outElement = new Boundary(isBoundary);
                }
            }
            return outElement;
        }
    }
}
