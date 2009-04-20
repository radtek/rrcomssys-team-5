using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.TransformationEngine
{
    public class GCMLFileNotFoundException : Exception
    {
        public GCMLFileNotFoundException(string message) :
            base(message)
        {}

    }

    public class XSLTFileNotFoundException : Exception
    {
        public XSLTFileNotFoundException(string message) :
            base(message)
        { }
    }

    public class ValidationException : Exception
    {
        public ValidationException(string message) :
            base(message)
        { }
    }


}
