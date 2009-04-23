//
//
//  Generated by StarUML(tm) C# Add-In
//
//  @ Project : Design Document
//  @ File Name : WFElement.cs
//  @ Date : 4/19/2009
//  @ Author : 
//
//
using System;
using System.Collections.Generic;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine
{
    public abstract class WFElement : IActivity
    {

        private bool outcome = false;
        
        // In case of Call and End boundaries, it's possible to have multiple previous elements
        private List<WFElement> previousElements = new List<WFElement>();
        
        public bool Outcome
        {
            get { return outcome; }
            set { outcome = value; }
        }

        public List<WFElement> PreviousElements
        {
          get { return previousElements; }
          set { previousElements = value; }
        }

      #region Implementation of IActivity

        public abstract bool processActivity();
        public abstract string getActivityID();
        public abstract string nextActivityID();
        public abstract Type TypeOfActivity();

        #endregion
    }
}
