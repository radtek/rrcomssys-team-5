using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.SynthesisEngine
{
    public class NoOfUsersOutOfBoundsException : Exception
    {
        public NoOfUsersOutOfBoundsException(string message) :
            base(message)
        { }        
    }

    public class UserDoesNotExistException : Exception
    {
        public UserDoesNotExistException(string message) :
            base(message)
        { }
    }

    public class UserIsOfflineException : Exception
    {
        public UserIsOfflineException(string message) :
            base(message)
        { }
    }

    public class CallIsAlreadyInProgressException : Exception
    {
        public CallIsAlreadyInProgressException(string message) :
            base(message)
        { }
    }
}
