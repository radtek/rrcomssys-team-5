using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml;
using System.Xml.Xsl;
using System.Xml.Serialization;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine
{
    class WorkflowFactory
    {
        public static WFRunner CreateWorkflowInstance(string strWXCML)
        {
            WFRunner runner = null;
            try
            {
                Workflow wf;
                Exception except;
                
                if ( Workflow.Deserialize(strWXCML,out wf, out except) )
                {
                    TransformationEngine.Boundary start =
                        wf.Boundary.Find(x => x.Type.Equals(BoundaryType.Start));

                    TransformationEngine.Boundary end =
                        wf.Boundary.Find(x => x.Type.Equals(BoundaryType.End));
                }
                else
                {
                    throw except;
                }
            }
            catch (Exception)
            {
                
                throw new ApplicationException("Error Deserializing WXCML : "+strWXCML);
            }
            return runner;
        }
    }
}
