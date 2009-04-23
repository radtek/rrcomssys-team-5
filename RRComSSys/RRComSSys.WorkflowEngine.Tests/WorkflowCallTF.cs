using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine.Tests
{
    [TestFixture]
    public class WorkflowCallTF
    {
        Workflow _doc;

        [SetUp]
        public void SetUp()
        {
            _doc = SchemaTransformer.GetObjectModel(@"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.WorkflowEngine.Tests\TestResources\AlternateWithWorkflow2.gcml");
        }

        [Test]
        public void TestCall1ProcessActivity()
        {
            SetUp();
            Call tCall = new Call(_doc.Call[0], _doc);
            tCall.ProcessActivity();            
        }

        [Test]
        public void TestCall2ProcessActivity()
        {
            SetUp();
            Call tCall = new Call(_doc.Call[1], _doc);
            tCall.ProcessActivity();
        }
    }
}
