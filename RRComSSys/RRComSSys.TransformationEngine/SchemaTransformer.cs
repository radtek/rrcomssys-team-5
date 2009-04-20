using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Xsl;

namespace RRComSSys.TransformationEngine
{
    public class SchemaTransformer
    {
        public SchemaTransformer()
        {
        }

        public void Transform(string gcmlPath)
        {
            if(
            XslCompiledTransform transform = new XslCompiledTransform();
            transform.Load("MappingMapToWXCML.xslt");
            transform. 
        }

        public void GetObjectModel(string xcmlPath)
        {
            Workflow.d
        }
    }
}
