using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Xsl;
using System.IO;
using System.Xml;
using System.Xml.XPath;
using System.Reflection;

namespace RRComSSys.TransformationEngine
{    
    public class SchemaTransformer
    {
        private string xsltFilePath = Path.Combine((Path.GetDirectoryName(
            Assembly.GetExecutingAssembly().GetName().CodeBase)).Replace(@"file:\", ""), "MappingMapToWXCML.xslt");

        
        public SchemaTransformer()
        {
        }

        public Workflow GetObjectModel(string gcmlPath)
        {
            StringBuilder sw = Transform(gcmlPath);
            Workflow doc;
            Exception exc;

            Workflow.Deserialize(sw.ToString(), out doc, out exc);

            if (exc != null)
            {
                throw new ValidationException("Validation Error: " + exc.Message);
            }

            return doc;
        }

        private StringBuilder Transform(string gcmlPath)
        {
            if(!File.Exists(gcmlPath))
            {
                throw new GCMLFileNotFoundException("The GCML File" + gcmlPath + " does not exist.");
            }

            if(!File.Exists(xsltFilePath))
            {
                throw new XSLTFileNotFoundException("The XSLT File" + xsltFilePath + " does not exist.");
            }
        
            StringBuilder sb = new StringBuilder();
            XmlTextReader xmlSource = new XmlTextReader(gcmlPath);
            XPathDocument xpathDoc = new XPathDocument(xmlSource);
            XslCompiledTransform xsltDoc = new XslCompiledTransform();

            xsltDoc.Load(xsltFilePath);

            
            StringWriter sw = new StringWriter(sb);

            xsltDoc.Transform(xpathDoc, null, sw);

            return sb;
                    
        }        
    }
}
