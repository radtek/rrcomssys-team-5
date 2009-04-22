using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.TransformationEngine
{
    public interface IMissingAttributeHandler
    {
        string GetMissingAttribute(string attrInfo);
    }
}
