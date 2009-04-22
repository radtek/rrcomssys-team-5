using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.Controller
{
    public interface IExecutionView
    {
        string getFilePath();
        System.Text.StringBuilder Log { get; set; }
        RRComSSys.Controller.IMissingInfoView MissingInfoView { get; set; }
    }
}
