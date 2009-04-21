using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections.Specialized;

namespace RRComSSys.SynthesisEngine
{
    public class Command
    {
        delegate void Invoker(List<string> users);
        static Invoker 
        VoiceCall, VideoCall, Chat; //Add more commands here

        delegate void Invoker2(List<string> users, string filePath);
        static Invoker2
        SendFile;

        public Command(SkypeReceiver receiver)
        {
            VoiceCall = receiver.MakeAVoiceCall;
            VideoCall = receiver.MakeAVideoCall;
            Chat = receiver.StartChat;
            SendFile = receiver.SendFile;
        }       
    }
}
