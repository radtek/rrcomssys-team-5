using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.TransformationEngine
{
    public class SchemaInstantiator
    {
        public Workflow Document { get; private set; }


        public SchemaInstantiator(Workflow doc)
        {
            Document = doc;
            instantiate();
        }

        private void instantiate()
        {
            
        }
    }
}
