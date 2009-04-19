using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.WorkflowEngine
{
    interface IActivityCreator
    {
        IActivity createActvity();
    }
}
