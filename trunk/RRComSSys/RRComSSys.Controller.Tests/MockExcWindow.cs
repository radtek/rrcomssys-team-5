using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.Controller;

namespace RRComSSys.Controller.Tests
{
    public class MockExcWindow : IExecutionView
    {

        #region IExecutionView Members

        public string getFilePath()
        {
            return @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\GCML Scenarios\AlternateWithWorkflow2.gcml";
        }

        public StringBuilder Log
        {
            get
            {
                if (Log == null)
                    return new StringBuilder("");
                else
                    return Log;
            }
            set
            {
                Log = value;
            }
        }

        public IMissingInfoView MissingInfoView
        {
            get
            {
                throw new NotImplementedException();
            }
            set
            {
                throw new NotImplementedException();
            }
        }

        #endregion
    }
}
