using System;
using System.Collections.Generic;
using RRComSSys.WorkflowEngine;

namespace RRComSSys.WorkflowEngine
{
  public class WFRunner : IReturnEvent
    {
        private List<WFElement> elements = null;

        private WFElement currentElement = null;
        
        public List<WFElement> WorkflowElements
        {
            get
            {
                if (null == elements)
                  WorkflowElements = new List<WFElement>();

                return elements;
            }
            private set
            {
                elements = value;
            }
        }

        public WFRunner()
        {
        }

        public EventNotifier eventNotifier;

        /// <summary>
        /// Executes the workflow.
        /// </summary>
        /// <returns></returns>
        public bool ExecuteWorkflow()
        {
            Boundary start = Start();
            WFElement element = elements.Find(x => x.getActivityID().Equals(start.nextActivityID()));
            processElement(element);
            return true;
        }

        /// <summary>
        /// Processes the element.
        /// </summary>
        /// <param name="currentElem">The current elem.</param>
        private void processElement(WFElement currentElem)
        {
          // Simple workflow loop
          do
          {
              currentElem.processActivity();
              currentElem = DetermineNextActivity();
              
          } while (null != currentElem);
        }

        /// <summary>
        /// Determines the next activity.
        /// </summary>
        /// <returns></returns>
        private WFElement DetermineNextActivity()
        {
          WFElement nextElement = null;
          
          Boundary end = (Boundary)elements.Find(x => ((x.TypeOfActivity() == typeof(Boundary)) && ((Boundary)x).Ends()));          
          if (currentElement.nextActivityID().Equals(end.getActivityID()))
          {
            // Hit the end element.....exit the workflow
            currentElement = null;
            return currentElement;
          }
          
          if ( currentElement.TypeOfActivity().Equals(typeof(Decision)))
          {
              Decision decisionElement = (Decision) currentElement;
              WFElement callElement = decisionElement.PreviousElements[0];
              if (callElement.Outcome)
              {
                nextElement = elements.Find(x => x.getActivityID().Equals(decisionElement.DecisionModel.successPathID));
                if (null != nextElement)
                {
                  currentElement = nextElement;
                }
                else
                  currentElement = null; // THIS SHOULD NOT HAPPEN
              }
              else
              {
                nextElement = elements.Find(x => x.getActivityID().Equals(decisionElement.DecisionModel.successPathID));
                if (null != nextElement)
                {
                  currentElement = nextElement;
                }
                else
                  currentElement = null; // THIS SHOULD NOT HAPPEN
              }
          }
          else
          {
            nextElement = elements.Find(x => x.getActivityID().Equals(currentElement.nextActivityID()));
            if (null != nextElement)
              currentElement = nextElement;
            else
            {
              currentElement = null; // THIS SHOULD NOT HAPPEN
            }
          }

          return currentElement;
        }

        /// <summary>
        /// Starts this instance.
        /// </summary>
        /// <returns></returns>
        private Boundary Start()
        {
            Boundary start = (Boundary) elements.Find(x=> ((x.TypeOfActivity() == typeof(Boundary)) && ((Boundary)x).Starts()));
            return start;
        }

        public void sendICall()
        {
        }

        public void returnValueHandler(int result)
        {

        }
    }

  public class EventNotifier
    {
    }
}