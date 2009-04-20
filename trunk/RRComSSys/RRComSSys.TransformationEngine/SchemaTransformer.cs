using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Xsl;
using System.IO;
using System.Xml;
using System.Xml.XPath;

namespace RRComSSys.TransformationEngine
{    
    public class SchemaTransformer
    {
        private const string XSLT_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.TransformationEngine\MappingMapToWXCML.xslt";
        StringBuilder _sb = new StringBuilder();

        public SchemaTransformer()
        {
        }

        public void Transform(string gcmlPath)
        {
            if(File.Exists(gcmlPath) && File.Exists(XSLT_FILE_PATH))
            {   
                XmlTextReader xmlSource = new XmlTextReader(gcmlPath);
                XPathDocument xpathDoc = new XPathDocument(xmlSource);
                XslCompiledTransform xsltDoc = new XslCompiledTransform();

                xsltDoc.Load(XSLT_FILE_PATH);

                
                StringWriter sw = new StringWriter(_sb);

                xsltDoc.Transform(xpathDoc, null, sw);
            }
        }

        public Workflow GetObjectModel(string xcmlPath)
        {
            Workflow doc;
            Exception exc;

            Workflow.Deserialize(_sb.ToString(), out doc, out exc);

            if (exc == null)
            {
            }

            return doc;
        }
    }
}
