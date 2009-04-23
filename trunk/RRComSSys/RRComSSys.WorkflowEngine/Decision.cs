//
//
//  Generated by StarUML(tm) C# Add-In
//
//  @ Project : Design Document
//  @ File Name : Decision.cs
//  @ Date : 4/19/2009
//  @ Author : 
//
//
using System;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine
{
    public class Decision : WFElement , IDecision
    {
        private TransformationEngine.Decision decision = null;

        public Decision( TransformationEngine.Decision aDecision, Workflow wfInstance)
        {
            decision = aDecision;
        }

      public TransformationEngine.Decision DecisionModel
      {
        get { return decision; }
      }

      #region Implementation of IDecision

        public string NextActivity(bool previousActivityOutcome)
        {
            return previousActivityOutcome ? DecisionModel.successPathID : DecisionModel.failPathID;
        }

        #endregion

        #region Overrides of WFElement

        public override bool ProcessActivity()
        {
            return true; // simply an empty operation
        }

        public override string GetActivityID()
        {
            return DecisionModel.activityID;
        }

        public override string NextActivityID()
        {
            return DecisionModel.successPathID;
        }

        public override Type TypeOfActivity()
        {
            return typeof (Decision);        
        }
        #endregion
    }
}

