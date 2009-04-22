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
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine
{
    public abstract class WFElement : IActivity
    {
        private TransformationEngine.Activity myActivity = null;
        private bool outcome = false;

        public Activity MyActivity
        {
            get { return myActivity; }
            set { myActivity = value; }
        }

        public bool Outcome
        {
            get { return outcome; }
            set { outcome = value; }
        }

        #region Implementation of IActivity

        public abstract bool processActivity();
        public abstract string getActivityID();
        public abstract string nextActivityID();
        public abstract Type TypeOfActivity();

        #endregion
    }
}
