//
//
//  Generated by StarUML(tm) C# Add-In
//
//  @ Project : Design Document
//  @ File Name : Call.cs
//  @ Date : 4/19/2009
//  @ Author : 
//
//
using System;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine
{
    public class Call : WFElement
    {
        private TransformationEngine.Call myActivity = null;
        private WorkflowEngine.Connection myConnection = null;

        /// <summary>
        /// Gets or sets the call connection.
        /// </summary>
        /// <value>The call connection.</value>
        public Connection CallConnection
        {
            get { return myConnection; }
            set { myConnection = value; }
        }


        /// <summary>
        /// Initializes a new instance of the <see cref="Call"/> class.
        /// </summary>
        /// <param name="aCall">A call.</param>
        /// <param name="wfInstance">The wf instance.</param>
        public Call( TransformationEngine.Call aCall, Workflow wfInstance )
        {
            myActivity = aCall;
            BuildConnection(wfInstance);
        }

        /// <summary>
        /// Builds the connection.
        /// </summary>
        /// <param name="instance">The instance.</param>
        private void BuildConnection(Workflow instance)
        {
            try
            {
                TransformationEngine.Connection aConnection = instance.Connection.Find(x => (x.ConnectionID == myActivity.CallToConnection));
                CallConnection = new Connection(aConnection, instance);
            }
            catch (Exception)
            {
                throw;
            }
        }

        #region Implementation of IActivity

        /// <summary>
        /// Processes the activity.
        /// </summary>
        /// <returns></returns>
        public override bool processActivity()
        {
            return true;
        }

        /// <summary>
        /// Gets the activity ID.
        /// </summary>
        /// <returns></returns>
        public override string getActivityID()
        {
            return myActivity.activityID;
        }

        /// <summary>
        /// Nexts the activity ID.
        /// </summary>
        /// <returns></returns>
        public override string nextActivityID()
        {
            if (string.IsNullOrEmpty(myActivity.CallToDecision) && (!string.IsNullOrEmpty(myActivity.CallToBoundary)))
                return myActivity.CallToBoundary;
            if (string.IsNullOrEmpty(myActivity.CallToBoundary) && (!string.IsNullOrEmpty(myActivity.CallToDecision)))
                return myActivity.CallToDecision;
            return string.Empty;
        }

        public override Type TypeOfActivity()
        {
            return typeof (Call);
        }

        #endregion
    }

} 


