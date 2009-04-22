using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections.Specialized;

namespace RRComSSys.SynthesisEngine
{
    public class Command
    {
        delegate void Invoker(string[] users);
        static Invoker 
        VoiceCall, VideoCall, Chat, SendFile; //Add more commands here        

        public Command(IReceiver receiver, CommandType type)
        {
            VoiceCall = receiver.MakeAVoiceCall;
            VideoCall = receiver.MakeAVideoCall;
            Chat = receiver.StartChat;
            SendFile = receiver.SendFile;
            Type = type;
        }

        public CommandType Type { get; set; }
        public string[] Users { get; set; }
        public string[] FilePaths { get; set; }

        public void Execute()
        {
            switch (Type)
            {
                case CommandType.VoiceCall:
                    VoiceCall(Users);
                    break;
                case CommandType.VideoCall:
                    VideoCall(Users);
                    break;
                case CommandType.Chat:
                    Chat(Users);
                    break;
                case CommandType.SendFile:
                    SendFile(FilePaths);
                    break;
                default:
                    break;
            }
        }        
    }

    public enum CommandType
    {
        VoiceCall,
        VideoCall,
        Chat,
        SendFile
    }
}
