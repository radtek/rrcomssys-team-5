using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.TransformationEngine;
using System.IO;

namespace RRComSSys.Controller
{    

    public class MainController
    {
        private MissingInfoFormController _infoFormController;

        public MainController(IExecutionView view)
        {
            View = view;
            _infoFormController = new MissingInfoFormController(view.MissingInfoView);
        }

        public IExecutionView View { get; set; }

        public void LoadFile()
        {
            string filePath = View.getFilePath();

            if (string.IsNullOrEmpty(filePath))
                addToLog("Please specify a file.");
            else if (!File.Exists(filePath))
                addToLog("The File you specified does not exist.");
            else
                addToLog("File found.");
        }

        public void TransformGCML()
        {

        }

        private void addToLog(string message)
        {
            
        }
    }
    

}
