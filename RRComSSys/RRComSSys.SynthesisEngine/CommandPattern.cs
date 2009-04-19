using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections.Specialized;

namespace RRComSSys.SynthesisEngine
{
    public class Command
    {
        delegate string Invoker(StringCollection parameters);
        static Invoker VoiceCall; //Add more commands here
        
        public Command(SkypeReceiver receiver)
        {
            VoiceCall = receiver.MakeAVoiceCall;
        }        
    }
}
