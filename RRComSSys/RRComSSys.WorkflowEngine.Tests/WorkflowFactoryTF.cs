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
        private const string GCML_FILE_PATH = @"F:\RRComSSys_Team5\RRComSSys\RRComSSys.TransformationEngine.Tests\TestResources\AlternateWithWorkflow2.gcml";
        [Test]
        public void Test()
        {
            //SchemaTransformer 

            Workflow doc = SchemaTransformer.GetObjectModel(GCML_FILE_PATH);
            WFRunner runner = new WorkflowFactory().CreateWorkflowRuntime(doc);

        }
    }
}
