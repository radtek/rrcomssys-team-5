using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections.Specialized;
using SKYPE4COMLib;

namespace RRComSSys.SynthesisEngine
{
    public class SkypeReceiver
    {
        private static Skype skype = new Skype();

        public SkypeReceiver()
        {       
            skype.CallStatus +=new _ISkypeEvents_CallStatusEventHandler(skype_CallStatus);
            
        }

        void  skype_CallStatus(Call pCall, TCallStatus Status)
        {
 	        throw new NotImplementedException();
        }

        public void MakeAVoiceCall(List<string> users)
        {
            throw new NotImplementedException();
        }

        public void MakeAVideoCall(List<string> users)
        {
            throw new NotImplementedException();
        }

        public void StartChat(List<string> users)
        {
            throw new NotImplementedException();
        }

        public void SendFile(List<string> users, string filePath)
        {
            throw new NotImplementedException();
        }


    }
}
