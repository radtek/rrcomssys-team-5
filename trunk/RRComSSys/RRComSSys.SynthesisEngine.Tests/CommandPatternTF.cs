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
        string _filePath = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.SynthesisEngine.Tests\TestResources\AlternateWithWorkflow2.gcml";
        string[] _oneUser = new string[1] { "danto005" };
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
            _command.FilePath = _filePath;
            _command.Users = _oneUser;
            _command.Execute();
        }

        [Test]
        public void PlaceCallWithOfflineUserTest()
        {
            try
            {
                _command = new Command(new SkypeReceiver(), CommandType.VoiceCall);
                _command.Users = new string[] { "Unknown" };
                _command.Execute();
            }
            catch (Exception exc)
            {
                Assert.AreEqual(exc.Message, "The user Unknown is offline.");
            }
        }

        [Test]
        public void PlaceCallWithMyself()
        {
            try
            {
                _command = new Command(new SkypeReceiver(), CommandType.VoiceCall);
                _command.Users = new string[] { "jmrodriguez24" };
                _command.Execute();
            }
            catch (Exception exc)
            {
                Assert.AreEqual(exc.Message, "The user Unknown is offline.");
            }
        }
    }
}
