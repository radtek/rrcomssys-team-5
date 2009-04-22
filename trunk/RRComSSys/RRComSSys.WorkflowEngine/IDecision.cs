using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.WorkflowEngine
{
    interface IDecision
    {
        string NextActivity(bool previousActivityOutcome);
    }
}
