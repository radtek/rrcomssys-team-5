using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.WorkflowEngine
{
    class Medium
    {
        private TransformationEngine.Medium medium = null;
        public Medium(TransformationEngine.Medium aMedium)
        {
            MediumType = aMedium;
        }


        public TransformationEngine.Medium MediumType
        {
            get { return medium; }
            set { medium = value; }
        }
    }
}
