using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.Controller
{
    public interface IExecutionView
    {
        string getFilePath();
        string Log { get; set; }
        string ShowMissingAttrForm(string attr);
    }
}
