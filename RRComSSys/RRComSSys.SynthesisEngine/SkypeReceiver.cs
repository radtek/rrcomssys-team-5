using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections.Specialized;
using SKYPE4COMLib;

namespace RRComSSys.SynthesisEngine
{
    public class SkypeReceiver : IReceiver
    {
        private static Skype skype = new Skype();

        public SkypeReceiver()
        {
            skype.CallStatus += new _ISkypeEvents_CallStatusEventHandler(skype_CallStatus);
            skype.MessageStatus += new _ISkypeEvents_MessageStatusEventHandler(skype_MessageStatus);
            
        }

        void skype_MessageStatus(ChatMessage pMessage, TChatMessageStatus Status)
        {
            
        }

        void skype_CallStatus(Call pCall, TCallStatus Status)
        {
            System.Console.WriteLine("Call ID" + pCall.Id + " Call Status" + Status.ToString());
        }

        #region IReceiver Members

        public void MakeAVideoCall(string[] users)
        {
            Call call = placeCall(users);

            if(call.VideoReceiveStatus == TCallVideoSendStatus.vssAvailable)
                call.StartVideoReceive();

            if(call.VideoSendStatus == TCallVideoSendStatus.vssAvailable)
                call.StartVideoSend();
        }

        public void MakeAVoiceCall(string[] users)
        {
            Call call = placeCall(users);
        }

        private Call placeCall(string[] users)
        {
            Call call;

            // If the user status is not "online", change user status to "online":
            if (skype.CurrentUserStatus == TUserStatus.cusOffline)
            {  
                skype.ChangeUserStatus(TUserStatus.cusOnline);
            }

            foreach (string user in users)
            {
                User skypeUser = skype.get_User(user);

                //if any of the users don't exist
                if (skypeUser == null)
                    throw new UserDoesNotExistException("The user " + user + " does not exist.");

                //if any of the users is offline
                if (skypeUser.OnlineStatus == TOnlineStatus.olsOffline)
                    throw new UserIsOfflineException("The user " + user + " is offline.");
            }

            switch (users.Length)
            {
                case 1:
                    call = skype.PlaceCall(users[0], "", "", "");
                    break;
                case 2:
                    call = skype.PlaceCall(users[0], users[1], "", "");
                    break;
                case 3:
                    call = skype.PlaceCall(users[0], users[1], users[2], "");
                    break;
                case 4:
                    call = skype.PlaceCall(users[0], users[1], users[2], users[3]);
                    break;
                default:
                    throw new NoOfUsersOutOfBoundsException("A call should be placed with up to 4 Participants");
            }      
      
            return call;
        }

        public void SendFile(string[] filePaths)
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
