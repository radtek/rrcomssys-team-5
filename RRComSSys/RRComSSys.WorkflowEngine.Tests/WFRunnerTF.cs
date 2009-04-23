using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine.Tests
{
    [TestFixture]
    public class WFRunnerTF
    {
        [Test]
        public void TestWorkflowWithAlternate()
        {
            string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.WorkflowEngine.Tests\TestResources\AlternateWithWorkflow2.gcml";
            Workflow doc = SchemaTransformer.GetObjectModel(GCML_FILE_PATH);
            WFRunner runner = new WorkflowFactory().CreateWorkflowRuntime(doc);
            runner.ExecuteWorkflow();
        }

        [Test]
        public void TestWorkflowWithRetry()
        {
            string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.WorkflowEngine.Tests\TestResources\WorkflowWithRetry.gcml";
            Workflow doc = SchemaTransformer.GetObjectModel(GCML_FILE_PATH);
            WFRunner runner = new WorkflowFactory().CreateWorkflowRuntime(doc);
            runner.ExecuteWorkflow();
        }

        [Test]
        public void TestSimpleWorkflow()
        {
            string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.WorkflowEngine.Tests\TestResources\simpleWorkflow.gcml";
            Workflow doc = SchemaTransformer.GetObjectModel(GCML_FILE_PATH);
            WFRunner runner = new WorkflowFactory().CreateWorkflowRuntime(doc);
            runner.ExecuteWorkflow();
        }
    }
}
