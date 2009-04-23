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
        
        [Test]
        public void TestWorkflowWithAlternate()
        {
            string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.WorkflowEngine.Tests\TestResources\AlternateWithWorkflow2.gcml";
            Workflow doc = SchemaTransformer.GetObjectModel(GCML_FILE_PATH);
            WFRunner runner = new WorkflowFactory().CreateWorkflowRuntime(doc);
            Assert.AreEqual(runner.WorkflowElements.Count, 5);
            Assert.AreEqual(runner.WorkflowElements[0].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Boundary");
            Assert.AreEqual(runner.WorkflowElements[1].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Call");
            Assert.AreEqual(runner.WorkflowElements[2].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Decision");
            Assert.AreEqual(runner.WorkflowElements[3].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Call");
            Assert.AreEqual(runner.WorkflowElements[4].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Boundary");
        }

        [Test]
        public void TestWorkflowWithRetry()
        {
            string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.WorkflowEngine.Tests\TestResources\WorkflowWithRetry.gcml";
            Workflow doc = SchemaTransformer.GetObjectModel(GCML_FILE_PATH);
            WFRunner runner = new WorkflowFactory().CreateWorkflowRuntime(doc);
            Assert.AreEqual(runner.WorkflowElements.Count, 4);
            Assert.AreEqual(runner.WorkflowElements[0].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Boundary");
            Assert.AreEqual(runner.WorkflowElements[1].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Call");
            Assert.AreEqual(runner.WorkflowElements[2].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Decision");
            Assert.AreEqual(runner.WorkflowElements[3].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Boundary");
        }

        [Test]
        public void TestSimpleWorkflow()
        {
            string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.WorkflowEngine.Tests\TestResources\simpleWorkflow.gcml";
            Workflow doc = SchemaTransformer.GetObjectModel(GCML_FILE_PATH);
            WFRunner runner = new WorkflowFactory().CreateWorkflowRuntime(doc);
            Assert.AreEqual(runner.WorkflowElements.Count, 3);
            Assert.AreEqual(runner.WorkflowElements[0].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Boundary");
            Assert.AreEqual(runner.WorkflowElements[1].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Call");
            Assert.AreEqual(runner.WorkflowElements[2].TypeOfActivity().ToString(), "RRComSSys.WorkflowEngine.Boundary");
        }
    }
}
