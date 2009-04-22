using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.SynthesisEngine;
using System.Threading;

namespace RRComSSys.SynthesisEngine.Tests
{   
    [TestFixture(ApartmentState = ApartmentState.STA)]
    public class CommandPatternTF
    {
        private Command _command;
        string[] _filePath = new string[] {@"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.SynthesisEngine.Tests\TestResources\AlternateWithWorkflow2.gcml"};
        string[] _oneUser = new string[1] { "marcelo.lopezjr" };
        string[] _twoUsers = new string[2] {"danto005", "marcelo.lopezjr"};

        [Test]
        public void MakeAVoiceCallTest()
        {
            _command = new Command(new SkypeReceiver(), CommandType.VoiceCall);
            _command.Users = _oneUser;
            _command.Execute();
        }

        [Test]
        public void MakeAVideoCallTest()
        {
            _command = new Command(new SkypeReceiver(), CommandType.VideoCall);
            _command.Users = _oneUser;
            _command.Execute();
        }

        [Test]
        public void StartChatTest()
        {
            _command = new Command(new SkypeReceiver(), CommandType.Chat);
            _command.Users = _oneUser;
            _command.Execute();
        }

        [Test]
        public void SendFile()
        {
            _command = new Command(new SkypeReceiver(), CommandType.SendFile);
            _command.Type = CommandType.SendFile;
            _command.FilePaths = _filePath;
            _command.Execute();
        }

        [Test]
        public void PlaceCallWithUnknownUserTest()
        {
            _command = new Command(new SkypeReceiver(), CommandType.VoiceCall);
            _command.Users = new string[] {"Unknown"};
            _command.Execute();
        }

        [Test]
        public void ReceiveVideoTest()
        {
            
        }
    }
}
