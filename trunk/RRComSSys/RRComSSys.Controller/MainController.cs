using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.TransformationEngine;
using RRComSSys.WorkflowEngine;
using System.IO;

namespace RRComSSys.Controller
{    

    public class MainController : IMissingAttributeHandler
    {
        public MainController(IExecutionView view)
        {
            View = view;            
        }

        public IExecutionView View { get; set; }
        public string FilePath { get; set; }
        public Workflow Document { get; set; }

        public void LoadFile()
        {
            string filePath = View.getFilePath();

            if (string.IsNullOrEmpty(filePath))
                addToLog("File Error : Please specify a file.");
            else if (!File.Exists(filePath))
                addToLog("File Error : The File you specified does not exist.");
            else
            {
                FilePath = filePath;
                addToLog("File found.");
            }
        }

        public void TransformGCML()
        {
            Document = null;            

            try
            {
                addToLog("Attempting to load Object model from" + FilePath + "......");
                Document = SchemaTransformer.GetObjectModel(FilePath);
                addToLog("File" + FilePath + "Loaded...");
            }
            catch (Exception exc)
            {
                addToLog("SchemaTransformer Error: " + exc.Message);
            }
            
            try
            {
                addToLog("Instatiating Schema");
                SchemaInstantiator sm = new SchemaInstantiator(Document, this);
                addToLog("Instance Complete and Validated");
            }
            catch (Exception exc)
            {
                addToLog("SchemaTransformer Error: " + exc.Message);
            }
        }

        private void addToLog(string message)
        {
            View.Log += message + Environment.NewLine;
            System.Diagnostics.Debug.WriteLine(message);
        }

        #region IMissingAttributeHandler Members

        public string GetMissingAttribute(string attrInfo)
        {
            return View.ShowMissingAttrForm(attrInfo);
        }

        #endregion

        public void ExecuteXCML()
        {
            try
            {
                WFRunner runner = WorkflowFactory.CreateWorkflowRuntime(Document);
                runner.ExecuteWorkflow();
            }
            catch( Exception exc)
            {
                addToLog(exc.Message);
            }
        }
    }    
}
