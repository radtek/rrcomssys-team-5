using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine.Tests
{
    [TestFixture]
    public class WorkflowFactoryTF
    {
        private const string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.TransformationEngine.Tests\TestResources\AlternateWithWorkflow2.gcml";
        [Test]
        public void Test()
        {
            Workflow doc = SchemaTransformer.GetObjectModel(GCML_FILE_PATH);
            WFRunner runner = WorkflowFactory.CreateWorkflowRuntime(doc);
        }
    }
}
