using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.SynthesisEngine.Tests
{
    public class MockReceiver : IReceiver
    {
        #region IReceiver Members

        public void MakeAVideoCall(string[] users)
        {
            throw new NotImplementedException();
        }

        public void MakeAVoiceCall(string[] users)
        {
            throw new NotImplementedException();
        }

        public void SendFile(string[] users, string filePath)
        {
            throw new NotImplementedException();
        }

        public void StartChat(string[] users)
        {
            throw new NotImplementedException();
        }

        #endregion
    }
}
