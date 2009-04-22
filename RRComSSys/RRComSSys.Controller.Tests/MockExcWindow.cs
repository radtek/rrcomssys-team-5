using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.Controller;

namespace RRComSSys.Controller.Tests
{
    public class MockExcWindow : IExecutionView
    {
        private MainController _controller;

        public MockExcWindow()
        {
            _controller = new MainController(this);
            Log = "";
        }

        #region IExecutionView Members

        public string getFilePath()
        {
            return @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\GCML Scenarios\AlternateWithWorkflow2.gcml";
        }

        public string Log { get; set; }

        public string ShowMissingAttrForm(string attr)
        {
            throw new NotImplementedException();
        }

        #endregion
    }
}
