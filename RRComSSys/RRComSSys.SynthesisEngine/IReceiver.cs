using System;
namespace RRComSSys.SynthesisEngine
{
    public interface IReceiver
    {
        void MakeAVideoCall(string[] users);
        void MakeAVoiceCall(string[] users);
        void SendFile(string[] filePaths);
        void StartChat(string[] users);
    }
}
