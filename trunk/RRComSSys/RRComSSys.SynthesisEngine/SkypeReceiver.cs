using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections.Specialized;
using SKYPE4COMLib;
using System.Threading;

namespace RRComSSys.SynthesisEngine
{
    public class SkypeReceiver : IReceiver
    {
        private static Skype skype = new Skype();

        public SkypeReceiver()
        {
            skype.CallStatus += new _ISkypeEvents_CallStatusEventHandler(skype_CallStatus);            
        }

        void skype_CallStatus(Call pCall, TCallStatus Status)
        {
            switch (Status)
            {
                case TCallStatus.clsBusy:                    
                case TCallStatus.clsCancelled:
                case TCallStatus.clsFailed:
                case TCallStatus.clsRefused:
                    string msg = "Call between ";
                    foreach(Participant participant in pCall.Participants)
                    {
                        msg += participant.Handle + ", ";
                    }
                    throw new CallWasUnsuccessfulException(msg + ".  Call " + Status.ToString() + ".");               
                default:
                    break;
            }
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

        private bool isUserInContactList(string user)
        {
            foreach (Group group in skype.Groups)
            {
                foreach (User skypeUser in group.Users)
                    if (skypeUser.Handle.Equals(user, StringComparison.OrdinalIgnoreCase))
                        return true;
            }

            return false;
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

                if (!isUserInContactList(user))
                    throw new UserIsNotInContactList(user + " is not in your contact list");

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

        public void SendFile(string[] users, string filePath)
        {
            IntPtr handle = IntPtr.Zero;

            foreach(string user in users)
            {
                /*System.Threading.Thread t = new System.Threading.Thread(new System.Threading.ParameterizedThreadStart(openFileDialog));
                t.SetApartmentState(System.Threading.ApartmentState.STA);

                t.Start(new OpenFileArguments(user, filePath));

                Thread.Sleep(2000);
                PressKeys.sendString("TextConfig.txt");

                t.Join(30000); */
                User skypeUser = skype.get_User(user);

                //if any of the users don't exist
                if (skypeUser == null)
                    throw new UserDoesNotExistException("The user " + user + " does not exist.");
                
                //If any of the users is not in Contact List
                if (!isUserInContactList(user))
                    throw new UserIsNotInContactList(user + " is not in your contact list");

                //if any of the users is offline
                if (skypeUser.OnlineStatus == TOnlineStatus.olsOffline)
                    throw new UserIsOfflineException("The user " + user + " is offline.");

                skype.Client.OpenFileTransferDialog(user, System.IO.Path.GetDirectoryName(filePath)); 
            }
        }

        /*private void openFileDialog(object args)
        {
            OpenFileArguments fargs = (OpenFileArguments)args;
                       
        }*/


        public void StartChat(string[] users)
        {
            
            foreach (string user in users)
            {
                if (string.IsNullOrEmpty(user))
                    continue;



                User skypeUser = skype.get_User(user);

                if (skypeUser == null)
                    throw new UserDoesNotExistException("Unable to find user " + user + ".");

                if (skypeUser.OnlineStatus == TOnlineStatus.olsOffline)
                {
                    throw new UserIsOfflineException("User " + skypeUser.FullName + "is offline.");
                }
            }            

            // Create channel
            Chat chat;
            
            if (users.Length == 1)
                chat = skype.CreateChatWith(users[0]);
            else
            {
                UserCollectionClass skypeUsers = new UserCollectionClass();

                foreach (string user in users)
                {
                    skypeUsers.Add(skype.get_User(user));
                }

                chat = skype.CreateChatMultiple(skypeUsers);
            }

            if (chat == null)
                throw new ChatUnsuccessfulException("Couldn't establish Chat Connection");

            chat.SendMessage("Welcome to skype through CVM");
        }

        #endregion

        /*public class OpenFileArguments
        {
            public OpenFileArguments(string user, string filePath)
            {
                User = user;
                FilePath = filePath;
            }

            public string User { get; private set; }
            public string FilePath { get; private set; }
        }*/
        
    }
}
