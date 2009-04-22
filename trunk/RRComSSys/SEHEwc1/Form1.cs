using System;
using System.Reflection;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using SKYPE4COMLib;

// Copyright by TheUberOverLord aka Don Kennedy 2008, Version 1.0.31.0 Skype4COM Library
// C# Example of Skype4COM Initialization And status messages ("Event Message Handling")

// **** Do NOT Modify, or Distribute and/or Copy                  ****
// **** Without written permission from TheUberOverLord@gmail.com ****

// Any Link here can be clicked on by holding down the CTRL key while using the editor
// for Microsoft Visual C# 2008 Express Edition, which is FREE.

// If you do not already have a version of Microsoft Visual C# 2008 installed on your system
// you will need to install the Microsoft Visual C# 2008 Express edition which is FREE
// and can be downloaded and installed from here:

// http://www.microsoft.com/express/vcsharp/Default.aspx

// Using your installed C# 2008 edition, click File -> Open Project -> SEHEwc1.sln from the
// SEHEwc1.zip file attachment located in the Skype forum post below to add this project.

// To build the project, without errors, you may need to create a test key if you receive
// an error at build time about no key. To do this, click on Project -> SEHEwc1 Properties ->
// Signing -> Create Test Key ("Enter Password of your choice") and re-build the project. 
// If your current registered version of Skype4COM is less than 1.0.31.0 you can click the
// unregister.bat file and then the register.bat file ("Both included in the SEHEwc1 Folder")
// to register the copy of Skype4COM 1.0.31.0 included in the .zip project files.

// The reason why you need to have a Skype4COM .dll registered to re-compile this is because
// Visual C# needs Skype4COM to be registered to add it to the project as an Isolated .dll.

// The Skype4COM lib .dll was added as a reference and selected from COM, after Skype4COM was
// added as a reference, it was selected and the Isolated property was set to "True" so that
// the current registered Skype4COM .dll would be included in the project and not require
// registration. This can be disabled by setting Isolated to "False" and re-compiling which
// will then NOT include the Skype4COM .dll in the project and it will need to be already
// installed and registered in this case prior to installing and using this program on the
// that system. NOTE: The business versions of Skype currently do NOT include Skype4COM in
// their installs.

// There can be 2-3 warnings normally when this code is re-built and the Skype4COM .dll
// is initially copied to the debug/release folders, they are Insertable, Icon, and MiscStatus
// are not imported from the registry, these warnings are from the Skype4COM dll being
// isolated and there is nothing that you or I can do about that, because it is a Skype
// problem. But this concept still works fine, and as you see has many advantages:

// 1. Allows you to avoid replacing an already registered Skype4COM.dll
// 2. Avoids having to register Skype4COM on a system that does not have it installed.
// 3. Allows you to use the Skype4COM dll version of your choice with no impact to others.
// 4. Allows you to have your application never abend due to Skype4COM missing.
// 5. Test new Skype4COM Lib along side an old one using the same Skype client.

// Here are some of the things this example shows or can do:

//    Debugging tool alongside your application
//    Easily modify text output for testing events or situations
//    Captures ALL events as of Skype4COM 1.0.31.0
//    Works With both 32 and 64 bit versions of Windows
//    Dealing with Skype4COM ambiguity issues
//    How to include Skype4COM in your project
//    How to use the version of your choice of Skype4COM
//    How to use multiple versions of Skype4COM at same time
//    How to use Skype4COM without registering it
//    How to open a web browser to Download Skype Client when needed
//    Supports ALL event handler interfaces as of Skype4COM 1.0.31.0
//    List of known issues found with 1.0.31.0 API/Skype4COM
//    Displays many Skype properties at Skype User logon
//    Shows use of waited attachment logic
//    Shows use of non-waited attachment logic
//    Shows how to start Skype from an application
//    Shows how to deal with program authorization
//    Shows how to deal with Program authorizations for multiple Skype users
//    Shows use of Silent Mode
//    Shows how to go away at Skype user logoff
//    Shows how to go away at Skype program exit
//    Shows how to Survive/Recover from mutiple Skype logoffs/logons
//    Shows how to Survive/Recover from Skype program stops/starts
//    Shows how to deal with Skype user change and program authorization prompts
//    Shows how to deal with having your application denied by the Skype user
//    Shows proper recovery and error logic with Skype4COM
//    Auto-Debug and invoke the debugger dynamically and automatically for testing
//    How to send API commands
//    How to use Blocking/Non-Blocking API commands
//    How to use the API Expected Text option
//    How to use API command Id option
//    Shows how to use Windows System Timer logic
//    Shows how to deploy applications using Microsoft ClickOnce technology
//    Shows application deployment and Installer methods
//    Shows how to have your program listed in Add/Remove programs in control panel
//    Shows how to open default browser window for help from your application
//    Shows how to use the FREE Microsoft Visual C# 2008 Express
//    Shows how to avoid using the registry using .NET User properties for saving values
//    Shows use of .NET 3.5 and C# 2008 both the latest versions from Microsoft
//    Shows use of NotifyIcon, Taskbar, Context Menu Driven By Project User Settings
//    Learn interfacing to Skype4COM FAST!
//    Learn C# FAST!

// Don't let the size of this program scare you. It maybe 4,984+ lines long but it covers
// all Event Handlers and Events and supports sending API commands from Skype4COM as well.

// The Goal here is to show you how to quickly use the parts you need for your program.

// Extensive comments were used in case the reader was new to C# or Skype4COM.

// Here is an easy Breakdown of this programs layout to help you easily look at sections:

// 1. Comment Section.
// 2. Event Handler linkage to our Custom Event Handlers.
// 3. Our Custom Event Handlers.
// 4. Our Custom Code - General Procedures.
// 5. Our Custom Code - Check Box and Web Link Procedures.
// 6. Our Custom Code - Main Procedure at load time.

// Procedures in each section are in Alphabetic Order. Our custom event handlers have the same
// names as Skype4COM with the word "Our" in front of them. Our variable names for Skype4COM
// variable names are the same but in lower case. Call is call, User is user and so on.

// Skype Forum Support as well as more detail about this version and to check for newer
// versions can be found here:

// http://forum.skype.com/index.php?showtopic=142821

// More here about using the isolated property:

// http://msdn.microsoft.com/en-us/magazine/cc188708.aspx

// Here is a Link to the Skype Developer page:

// http://developer.skype.com/

// Here is a link to the latest Skype4COM Lib Beta zip file:

// https://developer.skype.com/Download

// Here is the direct link to the Skype4COM Library 1.0.31.0 .dll and help file:

// https://developer.skype.com/Download?action=AttachFile&do=get&target=Skype4COM-1.0.31.0.zip

// This example project uses Skype4COM.dll version 1.0.31.0 for this program only when this
// program is installed, using ClickOnce methods. So there is NO need to register the
// Skype4COM .dll during deployment, there is a need to register Skype4COM to re-compile
// this program, and it must be Skype4COM version 1.0.31.0 or greater.

// This example shows proper Skype Client Attachment in ALL cases, and helps show some
// techniques to deal with the Skype Client authorization issues and also shows how to deal 
// with ambiguity issues with both declaring event handlers and variables such as Mute.

// Additional logic was added to show how to start Skype when needed via your application
// as well as how to stop your application when the Skype User logs off or the Skype Client
// is stopped. This example allows you to use this software to test new versions of 
// Skype4COM libraries with this program along side of other Skype4COM libraries and
// at the same time. ALL Event handlers are here as of Skype4COM Lib version 1.0.31.0
// they can be very easily modified for testing and displaying results, if needed.

// A folder included called Publish contains the ClickOnce install files produced from
// publishing this from the Project -> Properties -> Publish area. The files in this folder
// were zipped and placed in the Published File WinZIP Extractor folder and
// WinZip Self-Extractor was used to create a file Called WinZipFilesPublised.exe that will
// Install the ClickOnce files from the Publish folder.
// Here is the link for WinZip Self-Extractor:

// http://www.winzip.com/downse.htm It can be used for 30 days FREE

// Many variables are displayed when they have no data or zero so that you can see when these variables
// contain data and when they do not. A good example of this is "User.FullName" which is from the Skype
// users profile and can be empty. Normally, before displaying Skype4COM properties that can be
// be empty, or when zero can mean other strings are empty check the length of the string
// property like: 

// if (user.FullName.Length > 0) this.textBox1.AppendText("User Fullname: " + user.FullName);

// if (call.Rate > 0) this.textBox1.AppendText("Call Rate Currency: " + call.RateCurrency +
//                                             + " - Call Rate Precision: " + call.RatePrecision);

// In both of the above cases, if the "If test" was false the item(s) being displayed would
// be empty or zero.

// There is NO need for check boxes. Check boxes were only used as an example. You can simply
// toggle or store values in your project settings and have these values hidden from your
// end users but always available to you for testing or easy modification without the need
// to store ANYTHING in the system registry to support your application during install, runtime
// or removal.

// Now you say "But what do all these check boxes and links do?"

// "Exit on User Logoff" and "Exit On Skype Stop" check boxes when checked will cause this
// application to exit when the Skype user logs off or the Skype Client is stopped.

// "Start Skype if Needed" when checked will cause this application when started to start
// the Skype client if it is not already running. If the "Start Skype if Needed" check box
// is started after this application has started and the Skype client is not started, it will
// be started as well.

// "Enable Silent Mode" if checked when this application is started, and the Skype client is
// already running a set silent mode request will be sent right away. If the Skype client is
// not running when this check box is checked a set silent mode will be queued and take place
// once this application successfully attaches to the Skype client. Setting Silent Mode causes
// the Skype client to NOT open any windows. Silent mode will remain set until the Skype icon
// on the toolbar has been clicked.

// "Use Auto Debug" if checked will offer you a choice to Abort, Continue or invoke the debugger
// automatically debugging this code. This is an excellent method to drop into debug and view
// variables to see what went wrong automatically. This logic can also remain in place and
// simply be set to false when the same code is released to the public so that it can be used
// for testing of future versions. When "Use Auto Debug" is not checked, there will only be a
// message placed in the text box that an error has occurred.

// "Start Minimized" when checked and this application starts the Skype client by using the
// "Start Skype if Needed" check box, will start the Skype client minimized. The Skype client
// will only start minimized if auto-logon is being done, otherwise the Skype client window
// needs to display so that a Skype user name and password can be entered.

// "Start No Splash" when checked and this application starts the Skype client by using the
// "Start Skype if Needed" check box, will start the Skype client without the Skype Splash box
// that normally appears when Skype is started.

// "Hide API Window" when checked does not display API commands, API error messages, or API
// reply messages. There are things that go on in the background with Skype4COM which use API
// messages. If you are only using Skype4COM methods and not sending RAW API commands, you may
// not have a need to see these messages, so these messages are contained in their own window
// so that you can decide if you need to view them. All of the API check boxes and command and
// expected text boxes are hidden or appear based on this check box.

// "Logging On" when checked will log messages to both the Skype4COM message window and the
// API message window. When not checked, message logging does NOT take place. This is so you
// can scroll back and look at older messages if needed. This is the only check box that is
// not saved at program exit. If it was, you would start this application with logging
// disabled, and might not realize it.

// "Always Start as FirstTime = True" when checked will reset the FirstTime switch and this
// program will act as if this is the first time this Windows User has run this application.
// There is some first time application logic that is only done when this application senses
// it is the first time that this Windows user has run this application, such as prompting right
// away that they need to approve the use of this application using the Skype Client. 
// Normally, once one successful attach request has completed for this Windows user
// ("This Windows User might have MANY Skype names") the FirstTime switch is set to false,
// and a 30 second timer is set to warn the user vs warning the user right away that they
// may need to approve this application. This check box can be checked, then by deleting any
// Skype user authorization for this program for the Skype user you are testing with and then
// stopping this application and re-starting it will has reset FirstTime as true again so you
// can test how inital program authorization by the Skype client is handled, many times and
// many ways. Also, once FirstTime is set to True, which you can see is the case in the logged
// messages at this program initialization, you can uncheck this check box if needed to see the
// FirstTime switch set to false again. You can make sure that you delete ANY authorization
// for this program for this Skype use is deleted and removed by going to the Skype client and
// doing: Tools -> Options -> Advanced -> Manage Other Programs Access To Skype and then remove
// any authorization for this program and click Save. You can now do testing as if this is the
// first time this program attempted to use the Skype Client for this Windows User.

// "Always Use Non-Waited Attach Request" when checked will never set a Skype attach request
// to wait for a response. In most cases, this is the best method to use to attach to the Skype
// client, however your application may want to use a waited attachment request that is based
// on the timeout value of Skype4COM which is normally 30 seconds. If this check box is not
// checked, it shows how to wait for a response from the Skype client on a attachmenr request
// ("Once the API is available") and shows how to extend that time 
// ("in this case to 60 seconds" and try again, if the initial attach request times out.
// By removing any authorization record for this program from the Skype client for a Skype user,
// and then starting the Skype client, without logging on, and having this check box unchecked,
// and then starting this application, this will show and invoke this timeout logic, if you do
// not approve this program from the Skype client. It is a way to see the difference between a
// waited and non-waited attachment request. You can even see the difference in using a waited
// attachment request vs a non-waited attachment request and how the waited attachment request
// hangs both the GUI and the program while waiting for the waited attachment to complete,
// because this program is single threaded.

// "Use Blocking" When checked sends API commands using Blocking.

// "Use Command Id" When checked sends commands with a unique number of 10,000 or greater
// so that you can track commands generated by this program vs the Skype client or Skype4COM.

// "Save Text" When checked leaves text after command is sent otherwise text is cleared.
// Commands are sent when the ENTER key is pressed in the Command or Expected Text text box
// and a command is present in the Command Text Box. Whem checked the last text entered in
// both the Command and Expected text boxes will be saved and used the next time the program
// is started by the same Windows User.

// "Retry Command Timeouts" When checked will attempt one more time to send a command. 
// No logic was added to check if this program was attached or if the Skype client was logged
// in, or started so that you can see what will happen in these situations.

// "Command Text" ANY...API command can be entered here and will not be sent until the
// ENTER key is pressed while the cursor is in the Command or Expected text box and the Command
// Text box contains text.

// "Expected Text" will be attached to the command and be received with the Reply. This helps
// to carry any data in your program that you may need to match with when a Reply is received.
// The API command will not be sent until the ENTER key is pressed while the cursor is in the
// Command or Expected text box and the Command Text box contains text.

// Check Box values are saved prior to program exit ("Minus the "Logging On" Check Box")
// by using the .NET user settings, they do not use the registry, however they are based
// on a per Windows user id, not on a per Skype name id. So there is additional program
// logic used besides the FirstTime switch, when a attachment response of
// "Pending Authorization" takes more than 30 seconds before a successful attachment
// response is received, the Skype user is prompted to check the Skype client to see if this
// application needs to be approved. This warning, message box currently will then be
// displayed every 60 seconds, using a Windows system timer until the application is approved
// or stopped.

// "Click For Help With This Program" will open a browser window ("Your Default Browser")
// to the forum, where a thread that contains the entire project can be downloaded and you
// can post messages about questions or any help you may need with using this application.

// "Click For DevZone Help" will open the DevZone Home page in your default brower when clicked.

// "Click For Skype4COM Help" will open the DevZone Skype4COM Help Home page in your default
// brower when clicked.

// "Click For API Help" will open the DevZone API Help Home page in your default browser when
// clicked.

// Any of these user settings can be set to true or false, to that they become the default
// check box settings by changing the Project -> Properties -> Settings associated with
// the check box in question and then clicking the Synchronize button.

// This application can help you emulate, gather, view and test almost all features of the
// API/Skype4COM. It can be modified very quickly and easily to provide any detail you may
// requre and it can validate if your application is in fact processing Skype events properly. 

// Even IF you do not have any desire to use the C# language or .NET, this is a "Must Have"
// tool that can save you many hours of trouble-shooting and development time for your
// 3rd party Skype application. 

// It can show you techniques that will help make your 3rd party applicaton work for ALL
// Skype for Windows clients and versions and will help make your application "Rock Solid"
// for your end users.

// Added NotifyIconExample Logic so that NotifyIcon, Taskbar, Exit Logic can be controlled
// by Visual Studio Project User Settings.
//
// NotifyIconExample - Copyright By TheUberOverLord AKA Don Kennedy TheUberOverLord@gmail.com
// Do Not Remove Copyright.
//
// More About TheNotifyIconExample can be found here:
//
// http://saveontelephoneservices.com/modules.php?name=News&file=article&sid=8
//
// http://www.codeproject.com/KB/cs/NotifyIconExample.aspx 

// Enjoy, I hope this helped show how to interface to the Skype client as well as how easy
// C# is to code in and that you can create applications for FREE using the Microsoft Visual
// C# Express Edition.

// If you have any questions please post them in the forum at http://forum.skype.com/index.php?showtopic=142821
// or email me at mailto:TheUberOverLord@gmail.com

// Thanks Don Kennedy - Please do Not Modify and/or Copy, and Distribute this application

namespace SEHEwc1
{
    public partial class Form1 : Form
    {
        // Used to determine if we Honor ALL Exit requests. 
        // Used by TheNotifyIconExample Logic inserted here.
        private bool TheNotifyIconExample_TimeToExit = Properties.Settings.Default.TheNotifyIconExample_ExitAlways;

        // These are the only global variables we use, we do store some variables in
        // project settings for saving the last settings of Check Boxes to be used next
        // time this program is started.

        public bool Attached = false;
        public bool WasAttached = false;

        // We will set our Skype Class and locals with the same names but just using 
        // lower case. This makes it easier to use this logic for the entire program.

        public static Skype skype = new Skype();

        // We will set our Skype Command object here.

        public static Command command = new Command();

        // Here we assign a System Timer for our use when we are waiting on a pending
        // authorization attachment status, that most likely means that the Skype
        // user needs to authorize the Skype client to allow us to connect.

        // Internally we can only store Windows data like FirstTime on a per Windows user basis,
        // so this is how we deal with multiple Skype User names being used with the same
        // Windows User name. When this timer fires it will create an event which will fire
        // the OurTimerPromptUser event, located in our custom code area and also see the
        // event OurTimerPromptUser being defined below.

        // When FirstTime equals true, the initial timer to expire is set to one Millisecond.

        // When FirstTime equals false, the initial timer is set to expire 30 seconds after
        // a PendingAuthorization Attachment response has been received. The timer will 
        // continue to fire every 60 seconds after the OK has been clicked on the Message
        // Box until the program authorization issue has been resolved.

        // The same Windows user could have already used this program, but they maybe using
        // a different Skype User name with the same Windows User name and they may need to be
        // re-minded that they also must approve this program for this Skype Name. 

        // Also, the Skype user that did authorize this program to be used with Skype could have
        // deleted that approval or even changed it by doing:

        // Tools -> Options -> Advanced -> Manage Other Programs Access to Skype

        public System.Windows.Forms.Timer OurPendingAuthTimer = new System.Windows.Forms.Timer();

        public Form1()
        {
            InitializeComponent();

            // We need to save some things before we go away when we close this will
            // call ByeBye before we close. Used by TheNotifyIconExample Logic inserted here.

            FormClosing += ByeBye;

            // This is the Event Handler that will be called when the Timer OurPendingAuthTimer
            // expires, see OurPendingAuthTimer defined above.

            OurPendingAuthTimer.Tick += new EventHandler(OurTimerPromptUser);

            // We set all possible Event Handlers as of Skype4COM Lib version 1.0.31.0
            // In case of Older Skye4COM Lib versions use Try/catch
            // to Avoid abending due to Event Handler being too new for that Skype4COM
            // Lib version. This allows Older Skype4COM versions to also use this
            // Program as well if needed. Simply place the version of Skype4COM Lib
            // in the same folder as this .exe and rename the 1.0.31.0 Skype4COM Lib
            // there is NO need to register the Skype4COM .dll being used unless you
            // are going to use debug and/or re-compile. 

            // These examples also show how to solve ambiguity problems as well using the
            // syntax below, which is also used for MUTE later in this example, during this
            // program initialization.

            // Any known issues found are also listed below as of 1.0.31.0 Skype4COM.

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).ApplicationConnecting += OurApplicationConnecting;
            }
            catch (Exception e)
            {
                // Write Application Connecting Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Connecting Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).ApplicationDatagram += OurApplicationDatagram;
            }
            catch (Exception e)
            {
                // Write Application Datagram Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Datagram Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).ApplicationReceiving += OurApplicationReceiving;
            }
            catch (Exception e)
            {
                // Write Application Receiving Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Receiving Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).ApplicationSending += OurApplicationSending;
            }
            catch (Exception e)
            {
                // Write Application Sending Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Sending Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).ApplicationStreams += OurApplicationStreams;
            }
            catch (Exception e)
            {
                // Write Application Streams Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Streams Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).AsyncSearchUsersFinished += OurAsyncSearchUsersFinished;
            }
            catch (Exception e)
            {
                // Write Async Search Users Finished Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Async Search Users Finished Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).AttachmentStatus += OurAttachmentStatus;
            }
            catch (Exception e)
            {
                // Write Attachment Status Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Attachment Status Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).AutoAway += OurAutoAway;
            }
            catch (Exception e)
            {
                // Write Auto Away Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Auto Away Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).CallDtmfReceived += OurCallDtmfReceived;
            }
            catch (Exception e)
            {
                // Write Call DTMF Received Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call DTMF Received Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // **** This does not seem to fire, could be a bug in the API/Skype4COM ****

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).CallHistory += OurCallHistory;
            }
            catch (Exception e)
            {
                // Write Call History Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call History Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).CallInputStatusChanged += OurCallInputStatusChanged;
            }
            catch (Exception e)
            {
                // Write Call Input Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Input Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).CallSeenStatusChanged += OurCallSeenStatusChanged;
            }
            catch (Exception e)
            {
                // Write Call Seen Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Seen Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).CallStatus += OurCallStatus;
            }
            catch (Exception e)
            {
                // Write Call Status Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Status Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).CallTransferStatusChanged += OurCallTransferStatusChanged;
            }
            catch (Exception e)
            {
                // Write Call Transfer Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Transfer Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).CallVideoReceiveStatusChanged += OurCallVideoReceiveStatusChanged;
            }
            catch (Exception e)
            {
                // Write Call Video Receive Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Video Receive Status Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).CallVideoSendStatusChanged += OurCallVideoSendStatusChanged;
            }
            catch (Exception e)
            {
                // Write Call Video Send Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Video Send Status Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).CallVideoStatusChanged += OurCallVideoStatusChanged;
            }
            catch (Exception e)
            {
                // Write Call Video Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Video Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).ChatMembersChanged += OurChatMembersChanged;
            }
            catch (Exception e)
            {
                // Write Chat Members Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Chat Members Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).ChatMemberRoleChanged += OurChatMemberRoleChanged;
            }
            catch (Exception e)
            {
                // Write Chat Member Role Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Chat Member Role Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).Command += OurCommand;
            }
            catch (Exception e)
            {
                // Write Command Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Command Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).ConnectionStatus += OurConnectionStatus;
            }
            catch (Exception e)
            {
                // Write Connection Status Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Connection Status Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).ContactsFocused += OurContactsFocused;
            }
            catch (Exception e)
            {
                // Write Contacts Focused Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Contacts Focused Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).Error += OurError;
            }
            catch (Exception e)
            {
                // Write Error Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Error Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).FileTransferStatusChanged += OurFileTransferStatusChanged;
            }
            catch (Exception e)
            {
                // Write File Transfer Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "File Transfer Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).GroupDeleted += OurGroupDeleted;
            }
            catch (Exception e)
            {
                // Write Group Deleted Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Deleted Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).GroupExpanded += OurGroupExpanded;
            }
            catch (Exception e)
            {
                // Write Group Expanded Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Expanded Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).GroupUsers += OurGroupUsers;
            }
            catch (Exception e)
            {
                // Write Group Users Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Users Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).GroupVisible += OurGroupVisible;
            }
            catch (Exception e)
            {
                // Write Group Visible Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Visible Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).MessageHistory += OurMessageHistory;
            }
            catch (Exception e)
            {
                // Write Message History Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Message History Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).MessageStatus += OurMessageStatus;
            }
            catch (Exception e)
            {
                // Write Message Status Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Message Status Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).Mute += OurMute;
            }
            catch (Exception e)
            {
                // Write Mute Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Mute Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).OnlineStatus += OurOnlineStatus;
            }
            catch (Exception e)
            {
                // Write Online Status Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Online Status Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).PluginEventClicked += OurPluginEventClicked;
            }
            catch (Exception e)
            {
                // Write Plugin Event Clicked Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Plugin Event Clicked Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).PluginMenuItemClicked += OurPluginMenuItemClicked;
            }
            catch (Exception e)
            {
                // Write Plugin Menu Item Clicked Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Plugin Menu Item Clicked Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).Reply += OurReply;
            }
            catch (Exception e)
            {
                // Write Reply Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Reply Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).SilentModeStatusChanged += OurSilentModeStatusChanged;
            }
            catch (Exception e)
            {
                // Write Silent Mode Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Silent Mode Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).SmsMessageStatusChanged += OurSmsMessageStatusChanged;
            }
            catch (Exception e)
            {
                // Write SMS Message Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "SMS Message Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).SmsTargetStatusChanged += OurSmsTargetStatusChanged;
            }
            catch (Exception e)
            {
                // Write SMS Target Status Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "SMS Target Status Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).UILanguageChanged += OurUILanguageChanged;
            }
            catch (Exception e)
            {
                // Write UI Language Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "UI Language Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).UserAuthorizationRequestReceived += OurUserAuthorizationRequestReceived;
            }
            catch (Exception e)
            {
                // Write User Authorization Request Received Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "User Authorization Request Received Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).UserMood += OurUserMood;
            }
            catch (Exception e)
            {
                // Write User Mood Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "User Mood Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).UserStatus += OurUserStatus;
            }
            catch (Exception e)
            {
                // Write User Status Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "User Status Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity.
                ((_ISkypeEvents_Event)skype).VoicemailStatus += OurVoicemailStatus;
            }
            catch (Exception e)
            {
                // Write Voicemail Status Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Voicemail Status Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Try setting our custom event handler while avoiding any ambiguity. 
                ((_ISkypeEvents_Event)skype).WallpaperChanged += OurWallpaperChanged;
            }
            catch (Exception e)
            {
                // Write Wallpaper Changed Event Handler Failed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Wallpaper Changed Event Handler Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // You can customize for your own personal use the actual event handlers below
        // as stated above, do NOT modify, copy and distibute this software without
        // written permission from TheUberOverLord@gmail.com aka Don Kennedy.

        // In most cases "\r\n" for was kept on a separate line to make it easier to
        // add lines for display output when or if needed to event handler log output.

        // Some events fire so quickly and from multiple event handlers such as UserStatus
        // and OnlineStatus ("When it is your own Skype User Name for example") that most of
        // the text output when event handlers fire was passed as one line when being
        // logged to event handler output from Skype4COM event handlers.

        // This syntax can be used to remove ambiguity which would occur if we used just Application
        // vs SKYPE4COMLib.Application.

        public void OurApplicationConnecting(SKYPE4COMLib.Application application, UserCollection usercollection)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Application Connecting to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Connecting: " + application.Name +
                 " - User Collection Count: " + usercollection.Count +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Connecting Event Fired - Bad Text " +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // This syntax can be used to remove ambiguity which would occur if we used just Application
        // vs SKYPE4COMLib.Application.

        public void OurApplicationDatagram(SKYPE4COMLib.Application application, ApplicationStream applicationstream, String itext)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Application Datagram to Window
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Datagram: " + application.Name +
                 " - Application Stream Handle: " + applicationstream.Handle +
                 " - itext: " + itext +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Datagram Event Fired - Bad Text " +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // This syntax can be used to remove ambiguity which would occur if we used just Application
        // vs SKYPE4COMLib.Application.

        public void OurApplicationReceiving(SKYPE4COMLib.Application application, ApplicationStreamCollection applicationstreamcollection)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Application Receiving to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Receiving: " + application.Name +
                 " - Application Stream Collection Count: " + applicationstreamcollection.Count +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Receiving Event Fired - Bad Text " +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // This syntax can be used to remove ambiguity which would occur if we used just Application
        // vs SKYPE4COMLib.Application.

        public void OurApplicationSending(SKYPE4COMLib.Application application, ApplicationStreamCollection applicationstreamcollection)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Application Sending to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Sending: " + application.Name +
                 " - Application Stream Collection Count: " + applicationstreamcollection.Count +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Sending Event Fired - Bad Text " +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // This syntax can be used to remove ambiguity which would occur if we used just Application
        // vs SKYPE4COMLib.Application.

        public void OurApplicationStreams(SKYPE4COMLib.Application application, ApplicationStreamCollection applicationstreamcollection)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Applcation Streams to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Streams: " + application.Name +
                 " - Application Stream Collection Count: " + applicationstreamcollection.Count +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Application Streams Event Fired - Bad Text " +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurAsyncSearchUsersFinished(int cookie, UserCollection usercollection)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Async Search Users Finished to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Async Search User Finished - Cookie: " + cookie +
                 " - User Collection Count : " + usercollection.Count +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Async Search User Finished Event Fired - Bad Text " +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurAttachmentStatus(TAttachmentStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Attachment Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Attachment Status - Converted Status: " + skype.Convert.AttachmentStatusToText(status) +
                 " - TAttachmentStatus: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Attachment Status Event Fired - Bad Text " +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Reset our flag that were are NOT attached in case we were.
            Attached = false;

            // Always use try/catch with ANY Skype calls.
            try
            {
                // If we received a API available attachment response from Skype4COM
                if (status == TAttachmentStatus.apiAttachAvailable)
                {
                    // Always use try/catch with ANY Skype calls.
                    try
                    {
                        // NOTE: Currently we also need to do a second Attach Request even after
                        //       we already sent a non-waited Attach request in our intialization
                        //       logic. 

                        //       This is because if the Skype Client is running but nobody is
                        //       logged into the Skype client yet, and this is also the very 
                        //       first time this program has been run with this Skype User then
                        //       there would be NO Authorization event created in the upper right
                        //       of the Skype Client window for "New Events" to authorize this
                        //       program to run with Skype.

                        //       So in this case the second attach actually creates an authorization
                        //       event in the upper right of the Skype client window under new
                        //       events, once the Skype User has logged in. Since a new event
                        //       can't be created for a user who you don't event know the user
                        //       id yet, because no user is logged on to create an new event
                        //       for them yet with the any Attach request issued prior to
                        //       login because the API is not available yet.

                        // Please remember that your NEW authorization event request is only
                        // present while the Skype client is running, if you were to stop
                        // your program and then logoff/logon to the same Skype User you would
                        // see that your Authorizaton Event, in NEW events at the upper right
                        // of the Skype Client window is now GONE!

                        // You can reset Properties.Settings.Default.FirstTime by checking the
                        // "Always Start as First Time" Check Box, then stop/start this program
                        // and then uncheck the "Always Start as First Time" check box. Please
                        // make sure you have removed any authorization for this program first
                        // in the Skype client and then test these conditions listed below.

                        // Here is a list of tests to try:

                        // 1. Skype starts with no user logged in - This program is started.
                        // 2. Skype Auto-Logons On - This program Starts.
                        // 3. This Program starts Skype - Skype Auto Logs On.
                        // 4. This program is started - Skype is started later.
                        // 5. Skype is Started - This Program is started later.
                        // 6. This Program is started - Skype is started - stoped - started.
                        // 7. This Program is started - Skype is started - change Skype users.

                        // If check box not checked, we are supposed to send a waited attachment request.
                        if (!this.NonWaitedAttachRequests.Checked)
                        {
                            // Write Sending Waited Attachment Request to Skype to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Code - Waited Attachment Sent" +
                             "\r\n");

                            // Send waited attachment request.
                            // Bug Current Protocol is 8 Not 7 so we will force 8 instead of getting it from Skype4COM.
                            // skype.Attach(skype.Protocol, true);
                            skype.Attach(9, true);
                        }
                        else
                        // Otherwise, If we are are supposed to send a non-waited attachment request, do so.
                        {
                            // Write Sending Non-Waited Attachment Request to Skype to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Code - Non-Waited Attachment Sent" +
                             "\r\n");

                            // Send non-waited attachment request.
                            // Bug Current Protocol is 8 Not 7 so we will force 8 instead of getting it from Skype4COM.
                            // skype.Attach(skype.Protocol, false);
                            skype.Attach(9, false);
                        }
                    }
                    catch (Exception e)
                    {
                        // Write Attachment Failed to Window, drop into debug if wanted.
                        AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                         " Our Code - Attachment Failed - Converted Status: " + skype.Convert.AttachmentStatusToText(status) +
                         " - TAttachmentStatus: " + status +
                         " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                         "\r\n");

                        // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                        Debug.Assert(!this.UseAutoDebug.Checked);

                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // This is just one example, of what you can do for attachment retry logic
                            // in case the Windows system is slow try waiting twice as long for a
                            // response.

                            // Write our current timeout value in Milliseconds to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Code - Doubling Timeout from : " + skype.Timeout);

                            // Get our current timeout in Milliseconds and double it.
                            skype.Timeout = (skype.Timeout * 2);

                            // Write to Window our new timeout value in Milliseconds and that we are trying again.
                            AddTextToTextBox1(" to " + skype.Timeout + " - Trying Again" +
                             "\r\n");

                            // If check box not checked, we are supposed to send a waited attachment request.
                            if (!this.NonWaitedAttachRequests.Checked)
                            {
                                // Write that second attachment request sent as waited to Window.
                                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                                 " Our Code - Second Skype Attachment Request Waited Sent" +
                                 "\r\n");
                            }
                            else
                            {
                                // Write that second attachment request sent as non-waited to Window.
                                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                                 " Our Code - Second Skype Attachment Request Non-Waited Sent" +
                                 "\r\n");
                            }

                            try
                            {
                                // We could have set this timer when we receive a pending attachment status
                                // and depending on the message mix may NOT need to do it here, but we
                                // need to check to see if the timer is already set, if it is, let it be, not, set it.
                                if ((!OurPendingAuthTimer.Enabled) && (Properties.Settings.Default.FirstTime))
                                {
                                    OurPendingAuthTimer.Interval = 1;              // Set Timer to Expire right away.
                                    OurPendingAuthTimer.Start();                   // To Prompt User To Approve this program.
                                    System.Threading.Thread.Sleep(300);            // We are a single thread.
                                    System.Windows.Forms.Application.DoEvents();   // Let's make sure this fires now.
                                }
                            }
                            catch (Exception ee)
                            {
                                // Possibly program not authorized, drop into debug if wanted.
                                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                                 " Our Code - Not Able To Set Second Attempt Waited Timer" +
                                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                                 "\r\n");

                                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                                Debug.Assert(!this.UseAutoDebug.Checked);
                            }

                            // If check box not checked, we are supposed to send a waited attachment request.
                            if (!this.NonWaitedAttachRequests.Checked)
                            {
                                // Send waited attachment request.
                                // Bug Current Protocol is 8 Not 7 so we will force 8 instead of getting it from Skype4COM.
                                // skype.Attach(skype.Protocol, true);
                                skype.Attach(9, true);
                            }
                            else
                                // Send non-waited attachment request.
                                // Bug Current Protocol is 8 Not 7 so we will force 8 instead of getting it from Skype4COM.
                                skype.Attach(9, false);
                        }
                        catch (Exception eee)
                        {
                            // Technically, we can still attach at anytime as long as the Skype
                            // Client is NOT stopped. The New Event will remain in the New
                            // Events located in the upper right of the Skype client window
                            // but we don't want to loop forever here. If the Skype User by
                            // this time can't figure out how to authorize this, well then there
                            // are big problems, so let's stop retrying.

                            // Possibly program not authorized, drop into debug if wanted.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Code - Not Able To Attach - Please Restart This Program" +
                             " - Exception Source: " + eee.Source + " - Exception Message: " + eee.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }
                    }
                }
                else
                    // If we received an attachment response from Skype4COM of success.
                    if (status == TAttachmentStatus.apiAttachSuccess)
                    {
                        // Reset our flag that we are now attached to the Skype client.
                        Attached = true;

                        // If we were pending authorization and set our timer, stop it.
                        if (OurPendingAuthTimer.Enabled) OurPendingAuthTimer.Stop();

                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // If the check box is for Set Silent Mode is check, and Silent Mode is false, set Silent Mode to true.
                            if ((this.EnableSilentMode.Checked) && (!skype.SilentMode))
                            {
                                // Always use try/catch with ANY Skype calls.
                                try
                                {
                                    // Set Silent Mode to true.
                                    skype.SilentMode = true;

                                    // Write that Silent Mode has been set to true to Window.
                                    AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                                     " Our Code - Skype Silent Mode Set To: " + skype.SilentMode +
                                     "\r\n");
                                }
                                catch (Exception e)
                                {
                                    // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                                    AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                                     " Our Code - Skype Silent Mode Set Failed" +
                                     " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                                     "\r\n");

                                    // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                                    Debug.Assert(!this.UseAutoDebug.Checked);
                                }
                            }
                        }
                        catch (Exception e)
                        {
                            // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Code - Unable to Check Skype Silent Mode" +
                             " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }

                        // If we were never attached since we started this time.
                        if (!WasAttached)
                        {
                            // Set Our flag that since we started we at least once were attached to Skype.
                            WasAttached = true;

                            // If this was our first time running and the check box is not set to always run as if it was
                            // our first time, save the fact that next time will not be our first time running and that we
                            // in fact were approved by this Skype User. Note: This Windows user could have many Skype
                            // names, so we will still prompt for Program approval if we wait more than 30 seconds after
                            // we receive a pending authorization attachment response without receving a successful 
                            // attachment response.
                            if ((Properties.Settings.Default.FirstTime) && (!this.FirstTimeAlwaysTrue.Checked))
                                Properties.Settings.Default.FirstTime = false;

                            // **** After the initial successful attach one time logic goes here if needed. ****
                            // **** Then event logic will drive the program afterwards. ****
                            // **** In our case we have no code to add here besides the above. ****

                            // **** But...be careful because you could stick around after a ****
                            // **** Skype user logs off and then logs in again or with a ****
                            // **** different Skype name depending on the check box settings ****
                            // **** to false if this program exits on Skype user logoff or stop. ****
                        }

                        // Write that this is our start of Initializaton logic to Window.
                        AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                         " Our Initialization Logic - Begin" +
                         "\r\n");

                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // Write some Skype general information to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  Skype Ver: " + skype.Version +
                             " - Skype4COM Ver: " + skype.ApiWrapperVersion +
                             " - Protocol: " + skype.Protocol +
                             " - Timeout: " + skype.Timeout +
                             "\r\n");
                        }
                        catch (Exception e)
                        {
                            // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Initialization Logic - Bad Skype4COM version Should be at least 1.0.31.0" +
                             " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }

                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // Write some Skype privilage information to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  User: " + skype.CurrentUserHandle +
                             " - SkypeOut: " + skype.get_Privilege("SKYPEOUT") +
                             " - SkypeIn: " + skype.get_Privilege("SKYPEIN") +
                             " - Voicemail: " + skype.get_Privilege("VOICEMAIL") +
                             "\r\n");
                        }
                        catch (Exception e)
                        {
                            // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Initialization Logic - Bad Skype4COM version Should be at least 1.0.31.0" +
                             " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }

                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // Write some Skype profile information to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  PSTN Balance Currency: " + skype.get_Profile("PSTN_BALANCE_CURRENCY") +
                             " - PSTN Balance: " + skype.get_Profile("PSTN_BALANCE") +
                             "\r\n");
                        }
                        catch (Exception e)
                        {
                            // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Initialization Logic - Bad Skype4COM version Should be at least 1.0.31.0" +
                             " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }

                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // Write some Skype profile information to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  Calls Go To Voicemail: " + skype.get_Profile("CALL_SEND_TO_VM") +
                             " - Calls Go To Call Forwarding: " + skype.get_Profile("CALL_APPLY_CF") +
                             " - Call Forward Rules: " + skype.get_Profile("CALL_FORWARD_RULES") +
                             " - SMS Validated Numbers: " + skype.get_Profile("SMS_VALIDATED_NUMBERS") +
                             "\r\n");
                        }
                        catch (Exception e)
                        {
                            // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Initialization Logic - Bad Skype4COM version Should be at least 1.0.31.0" +
                             " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }

                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // Write some Skype general settings and profile information to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  Language: " + skype.Settings.Language +
                             " - Predictive Dialer Country: " + skype.PredictiveDialerCountry +
                             " - IP Country:  " + skype.get_Profile("IPCOUNTRY") +
                             "\r\n");
                        }
                        catch (Exception e)
                        {
                            // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Initialization Logic - Bad Skype4COM version Should be at least 1.0.31.0" +
                             " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }

                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // Write some Skype settings information to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  Audio In: " + skype.Settings.AudioIn +
                             " - Audio Out: " + skype.Settings.AudioOut +
                             "\r\n");
                        }
                        catch (Exception e)
                        {
                            // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Initialization Logic - Bad Skype4COM version Should be at least 1.0.31.0" +
                             " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }

                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // **** API/Skype4COM Bug with VideoIn when Default Device is selected has no value ****

                            // Write some Skype settings and general information to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": ");

                            // Check for Length on This, and warn about changing.
                            if (skype.Settings.VideoIn.Length == 0) AddTextToTextBox1("  Video In: Change Skype Video Options to Specific CAM to see value, API/Skype4COM Bug");
                            else
                                AddTextToTextBox1("  Video In: " + skype.Settings.VideoIn);

                            // Write end of line and new line.
                            AddTextToTextBox1("\r\n");

                            // Write some Skype settings to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  Auto Away: " + skype.Settings.AutoAway +
                             " - PC Speaker: " + skype.Settings.PCSpeaker +
                             " - Ringer: " + skype.Settings.Ringer +
                             " - Users waiting for authorization: " + skype.UsersWaitingAuthorization.Count +
                             "\r\n");

                            // Write some Skype settings to Window.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  AEC: " + skype.Settings.AEC +
                             " - AGC: " + skype.Settings.AGC +
                             " - Voicemails: " + skype.Voicemails.Count +

                             // This syntax can be used to remove ambiguity which would occur if we used
                                // skype.Mute because there is also a Mute Event. So this syntax
                                // solves the problem.

                             // Write Skype General information to Window.
                             "  - Mute: " + (((ISkype)skype).Mute) +
                             "\r\n");
                        }
                        catch (Exception e)
                        {
                            // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Initialization Logic - Bad Skype4COM version Should be at least 1.0.31.0" +
                             " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }
                        // Write end of our initialization to Window.
                        AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                         " Our Initialization Logic - End" +
                         "\r\n");
                    }
                    else
                        // If we received a API not available attachment response from Skype4COM and we were attached.
                        if ((status == TAttachmentStatus.apiAttachNotAvailable) && (WasAttached))
                        {
                            // If Exit On Skype Stop Check Box is Checked quit.
                            if (this.SkypeStop.Checked)
                            {
                                TheNotifyIconExample_TimeToExit = true;
                                this.Close();
                            }
                        }
                        else
                            // If we received a pending authorization attachment response from Skype4COM.
                            if (status == TAttachmentStatus.apiAttachPendingAuthorization)
                            {
                                // Is this the first time this Windows User used this program? If so, do this.
                                if (Properties.Settings.Default.FirstTime)
                                {
                                    try
                                    {
                                        // We could have set this timer in our attachment request and depending
                                        // on the message mix need to possbibly do it here, but we need to check
                                        // to see if the timer is already set, if it is, let it be, if not, set it.
                                        if (!OurPendingAuthTimer.Enabled)
                                        {
                                            OurPendingAuthTimer.Interval = 1;              // Set Timer to Expire right away.
                                            OurPendingAuthTimer.Start();                   // To Prompt User To Approve this program.
                                            System.Threading.Thread.Sleep(300);            // We are a single thread.
                                            System.Windows.Forms.Application.DoEvents();   // Let's make sure this fires now.
                                        }
                                    }
                                    catch (Exception e)
                                    {
                                        // System Timer start problem, log an error, drop into debug if wanted.
                                        AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                                         " Our Code - Unable To Set OurPendingAuthTimer FirstTime" +
                                         " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                                         "\r\n");

                                        // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                                        Debug.Assert(!this.UseAutoDebug.Checked);
                                    }
                                }
                                else

                                // This is NOT the first time this Windows User used this program, could be another Skype Name 
                                // being used by the SAME Windows user, or the original approval for this program
                                // was deleted so, let's wait 30 seconds for the attachment request to complete
                                // before we display this warning message. If we receive a attachment success message
                                // before 30 seconds passes, we will cancel the timer and the warning message will not appear.
                                {
                                    try
                                    {
                                        // We could have set this timer in our waited attachment request and depending
                                        // on the message mix need to possbibly do it here, but we need to check
                                        // to see if the timer is already set, if it is, let it be, if not, set it.
                                        if (!OurPendingAuthTimer.Enabled)
                                        {
                                            OurPendingAuthTimer.Interval = 30000; // Set Timer to Expire in 30 seconds.
                                            OurPendingAuthTimer.Start();          // To Prompt User To Approve this program.
                                        }
                                    }
                                    catch (Exception e)
                                    {
                                        // System Timer start problem, log an error, drop into debug if wanted.
                                        AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                                         " Our Code - Unable To Set OurPendingAuthTimer" +
                                         " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                                         "\r\n");

                                        // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                                        Debug.Assert(!this.UseAutoDebug.Checked);
                                    }
                                }
                            }
                            else

                                // When you change the authorization record in the Skype client
                                // from deny to approved, a Status event of Language changed
                                // is received. This is a API/Skype4COM bug.

                                // If we received a refused attachment response from Skype4COM.
                                if (status == TAttachmentStatus.apiAttachRefused)
                                {
                                    // The User has Denied the Program.
                                    // Let's make sure they know how to fix this.
                                    AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                                     " Our Code - You have denied this program." +
                                     " - To undo this On the Skype Client window" +
                                     " - Click Tools -> Options -> Advanced ->" +
                                     " Manage other programs access to Skype and" +
                                     " delete or change the entry for this program" +
                                     "\r\n");

                                    // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                                    Debug.Assert(!this.UseAutoDebug.Checked);
                                }
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Attachment Event Fired - Unable to Query Attachment Status" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurAutoAway(bool automatic)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write AutoAway Status to Window
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "AutoAway - User Status Changed to: " + automatic +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "AutoAway Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurCallDtmfReceived(Call call, string code)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Call DTMF Received to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call DTMF Received - Call Id: " + call.Id +
                 " - Type Converted: " + skype.Convert.CallTypeToText(call.Type) +
                 " - Type: " + call.Type +
                 " - PartnerHandle: " + call.PartnerHandle +
                 " - Code: " + code +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call DTMF Received Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // **** This does not seem to fire, is a bug in API/Skype4COM ****

        public void OurCallHistory()
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Call History Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call History - Changed" +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call History Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurCallInputStatusChanged(Call call, bool status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Our Call Input Status Changed Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Input Status Changed - Call Id: " + call.Id +
                 " - Type Converted: " + skype.Convert.CallTypeToText(call.Type) +
                 " - Type: " + call.Type +
                 " - PartnerHandle: " + call.PartnerHandle +
                 " - Status: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Input Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurCallSeenStatusChanged(Call call, bool status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Our Call Seen Status Changed Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Seen Status Changed - Call Id: " + call.Id +
                 " - Type Converted: " + skype.Convert.CallTypeToText(call.Type) +
                 " - Type: " + call.Type +
                 " - PartnerHandle: " + call.PartnerHandle +
                 " - Status: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Seen Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // **** TCallStatus: clsTransferred shows as "Unknown" when passed to skype.Convert.CallStatusToText ****

        public void OurCallStatus(Call call, TCallStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Call Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Status - Call Id: " + call.Id +
                 " - Type Converted: " + skype.Convert.CallTypeToText(call.Type) +
                 " - Type: " + call.Type +
                 " - PartnerHandle: " + call.PartnerHandle +
                 " - TCallStatus - Converted Status: " + skype.Convert.CallStatusToText(status) +
                 " - TCallStatus: " + status +
                 " - Duration: " + call.Duration +
                 " - Rate: " + call.Rate +
                 " - Rate Currency: " + call.RateCurrency +
                 " - Rate Precision: " + call.RatePrecision +
                 " - Conference Id: " + call.ConferenceId);

                // If this call is from a SkypeIn/Online number, show which one.
                if (call.Type == TCallType.cltIncomingPSTN) AddTextToTextBox1(" - From Online Number: " + call.TargetIdentity);

                // Write end of line, new line to Window.
                AddTextToTextBox1("\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Status Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // **** TransferredBy seems to always be empty here. ****

        public void OurCallTransferStatusChanged(Call call, TCallStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Call Transfer Status Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Transfer Status Changed - Call Id: " + call.Id +
                 " - Type Converted: " + skype.Convert.CallTypeToText(call.Type) +
                 " - Type: " + call.Type +
                 " - PartnerHandle: " + call.PartnerHandle +
                 " - TargetIdentity: " + call.TargetIdentity +
                 " - Transferred To: " + call.TransferredTo +
                 " - Transferred By: " + call.TransferredBy +
                 " - Transfer Active: " + call.TransferActive +
                 " - Call Transfer Status Changed - TCallStatus Converted Status: " + skype.Convert.CallStatusToText(status) +
                 " - TCallStatus: " + status +
                 " - Duration: " + call.Duration +
                 " - Rate: " + call.Rate +
                 " - Rate Currency: " + call.RateCurrency +
                 " - Rate Precision: " + call.RatePrecision);

                // If this call is from a SkypeIn/Online number, show which one.
                if (call.Type == TCallType.cltIncomingPSTN) AddTextToTextBox1(" - From Online Number: " + call.TargetIdentity);

                // Write end of line, new line to Window.
                AddTextToTextBox1("\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Transfer Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurCallVideoReceiveStatusChanged(Call call, TCallVideoSendStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Call Video Receive Status Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Video Receive Status Changed - Call Id: " + call.Id +
                 " - Type Converted: " + skype.Convert.CallTypeToText(call.Type) +
                 " - Type: " + call.Type +
                 " - PartnerHandle: " + call.PartnerHandle +
                 " - TCallVideoSendStatus Converted Status: " + skype.Convert.CallVideoSendStatusToText(status) +
                 " - TCallVideoSendStatus: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Video Receive Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurCallVideoSendStatusChanged(Call call, TCallVideoSendStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Call Video Send Status Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Video Send Status Changed - Call Id: " + call.Id +
                 " - Type Converted: " + skype.Convert.CallTypeToText(call.Type) +
                 " - Type: " + call.Type +
                 " - PartnerHandle: " + call.PartnerHandle +
                 " - Converted TCallVideoSendStatus Status: " + skype.Convert.CallVideoSendStatusToText(status) +
                 " - TCallVideoSendStatus: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Video Send Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurCallVideoStatusChanged(Call call, TCallVideoStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Call Video Status Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Video Status Changed - Call Id: " + call.Id +
                 " - Type Converted: " + skype.Convert.CallTypeToText(call.Type) +
                 " - Type: " + call.Type +
                 " - PartnerHandle: " + call.PartnerHandle +
                 " - TCallVideoStatus Converted Status: " + skype.Convert.CallVideoStatusToText(status) +
                 " - TCallVideoStatus: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Call Video Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurChatMembersChanged(Chat chat, UserCollection usercollection)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Chat Memebers Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Chat Members Changed - Chat Friendly Name: " + chat.FriendlyName +
                 " - Chat User Count : " + usercollection.Count +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Chat Members Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // **** There is no TChatMemberRole to text conversion supplied by Skype4COM. ****

        public void OurChatMemberRoleChanged(IChatMember ichatmember, TChatMemberRole role)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Chat Memeber Role Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Chat Member Role Changed - ChatMember Handle: " + ichatmember.Handle +
                 " - Chat Role : " + role +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Chat Member Role Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurCommand(Command command)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Command to Window.
                AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                 "Command - Command Id: " + command.Id +
                 " - Command: " + command.Command +
                 " - Expected: " + command.Expected +
                 " - Blocking: " + command.Blocking +
                 " - Timeout: " + command.Timeout +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                 "Command Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurConnectionStatus(TConnectionStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Connection Status to Window
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Connection Status - Converted TConnectionStatus Status: " + skype.Convert.ConnectionStatusToText(status) +
                 " - TConnectionStatus: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Connection Status Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // **** This Does Fire Sometimes With No Contact Name. ****

        public void OurContactsFocused(string contacts)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Contacts Focused to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Contacts Focused - Contacts: " + contacts +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Contacts Focused Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurError(Command command, int number, string description)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Error to Window.
                AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                 "Error - Number: " + number +
                 " - Command Id: " + command.Id +
                 " - Command: " + command.Command +
                 " - Description: " + description +
                 " - Expected: " + command.Expected +
                 " - Reply: " + command.Reply +
                 " - Blocking: " + command.Blocking +
                 " - Timeout: " + command.Timeout +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                 "Error Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // **** There is no TFileTransferStatus to text conversion supplied. ****

        public void OurFileTransferStatusChanged(IFileTransfer ifiletransfer, TFileTransferStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write File Transfer Status Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "File Transfer Status Changed - File Transfer Filename: " + ifiletransfer.Filename +
                 " - TFileTransferStatus Status: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "File Transfer Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurGroupDeleted(int group)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Group Deleted to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Deleted - Group: " + group +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Deleted Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurGroupExpanded(Group group, bool expanded)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Group Expanded to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Expanded - Group Id: " + group.Id +
                 " - Group Type Converted: " + skype.Convert.GroupTypeToText(group.Type) +
                 " - Group Type: " + group.Type);

                // Example of checking length before adding to log Window.
                if (group.DisplayName.Length > 0) AddTextToTextBox1(" - Group Display Name: " + group.DisplayName);

                // Continue to write Group Expanded to Window.
                AddTextToTextBox1(" - Expanded: " + expanded +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Expanded Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurGroupUsers(Group group, UserCollection usercollection)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Group Users to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Users - Group Id: " + group.Id +
                 " - Group Type Converted: " + skype.Convert.GroupTypeToText(group.Type) +
                 " - Group Type: " + group.Type);

                // Example of checking length before adding to log Window.
                if (group.DisplayName.Length > 0) AddTextToTextBox1(" - Group Display Name: " + group.DisplayName);

                // Continue to write Group Users to Window.
                AddTextToTextBox1(" - User Collection Count: " + usercollection.Count +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Users Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurGroupVisible(Group group, bool visible)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Group Visible to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Visible - Group Id: " + group.Id +
                 " - Group Type Converted: " + skype.Convert.GroupTypeToText(group.Type) +
                 " - Group Type: " + group.Type);

                // Example of checking length before adding to log Window.
                if (group.DisplayName.Length > 0) AddTextToTextBox1(" - Group Display Name: " + group.DisplayName);

                // Continue to write Group Visible to Window. 
                AddTextToTextBox1(" - Visible: " + visible +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Group Visible Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurMessageHistory(string user)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Message History to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Message History - User: " + user +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Message History Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurMessageStatus(ChatMessage chatmessage, TChatMessageStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Message Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Message Status - Message Id: " + chatmessage.Id +
                 " - Chat Friendly Name: " + chatmessage.Chat.FriendlyName +
                 " - Chat Name: " + chatmessage.Chat.Name +
                 " - Converted Message Type: " + skype.Convert.ChatMessageTypeToText(chatmessage.Type) +
                 " - Message Type: " + chatmessage.Type +
                 " - Converted TChatMessageStatus Status: " + skype.Convert.ChatMessageStatusToText(status) +
                 " - TChatMessageStatus Status: " + status +
                 " - From Display Name: " + chatmessage.FromDisplayName +
                 " - From Handle: " + chatmessage.FromHandle);

                // Examples of checking lengths before adding to Window.
                if (chatmessage.Chat.Topic.Length > 0) AddTextToTextBox1(" - Topic: " + chatmessage.Chat.Topic);
                if (chatmessage.Body.Length > 0) AddTextToTextBox1(" - Body: " + chatmessage.Body);

                // Write end of line, new line to Window.
                AddTextToTextBox1("\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Message Status Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurMute(bool mute)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Message Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Mute - Changed To: " + mute +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Mute Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurOnlineStatus(User user, TOnlineStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Online Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Online Status - User FullName: " + user.FullName +
                 " - User DisplayName: " + user.DisplayName +
                 " - User Handle: " + user.Handle +
                 " - Converted TOnlineStatus Status: " + skype.Convert.OnlineStatusToText(status) +
                 " - TOnlineStatus Status: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Online Status Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurPluginEventClicked(PluginEvent pluginevent)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Plugin Event Clicked to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Plugin Event Clicked - Id: " + pluginevent.Id +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Plugin Event Clicked Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurPluginMenuItemClicked(PluginMenuItem pluginmenuitem, UserCollection usercollection, TPluginContext plugincontext, string contextid)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Plugin Menu Item Clicked to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Plugin Menu Item Clicked - Id: " + pluginmenuitem.Id +
                 " - User Count: " + usercollection.Count +
                 " - Context: " + plugincontext +
                 " - Context Id: " + contextid +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Plugin Menu Item Clicked Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurReply(Command command)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Reply to Window.
                AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                 "Reply - Command Id: " + command.Id);

                //Example of checking length before adding to Window.
                if (command.Command.Length > 0) AddTextToTextBox2(" - Command: " + command.Command);

                // Continue to write Reply to Window.
                AddTextToTextBox2(" - Reply: " + command.Reply +
                 " - Expected: " + command.Expected +
                 " - Blocking: " + command.Blocking +
                 " - Timeout: " + command.Timeout +
                 "\r\n");

                // Check Reply and if exit on user logoff check box checked, stop this program.
                if ((command.Reply == "USERSTATUS LOGGEDOUT") && (this.UserLogoff.Checked))
                {
                    TheNotifyIconExample_TimeToExit = true;
                    this.Close();
                }
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                 "Reply Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // **** Does NOT fire when going from false to true, fires only from true to false. ****

        public void OurSilentModeStatusChanged(bool silent)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Silent Mode Status Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Silent Mode Status Changed - Silent Mode: " + silent +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Silent Mode Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurSmsMessageStatusChanged(SmsMessage smsmessage, TSmsMessageStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write SMS Message Status Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "SMS Message Status Changed - SMS Id: " + smsmessage.Id +
                 " - SMS Body: " + smsmessage.Body +
                 " - SMS Price: " + smsmessage.Price +
                 " - SMS Converted Message Type: " + skype.Convert.SmsMessageTypeToText(smsmessage.Type) +
                 " - SMS Message Type: " + smsmessage.Type +
                 " - SMS Converted TSmsMessageStatus Status: " + skype.Convert.SmsMessageStatusToText(status) +
                 " - SMS TSmsMessageStatus: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "SMS Message Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurSmsTargetStatusChanged(SmsTarget smstarget, TSmsTargetStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write SMS Target Status Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "SMS Target Status Changed - SMS Target Number: " + smstarget.Number +
                 " - SMS Target Message Id: " + smstarget.Message.Id +
                 " - SMS arget Message Body: " + smstarget.Message.Body +
                 " - TSmsTargetStatus Converted Status: " + skype.Convert.SmsTargetStatusToText(status) +
                 " - SMS Target Status: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "SMS Target Status Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurUILanguageChanged(string code)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write UI Language Changed Status Changed to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "UI Language Changed - UI Code: " + code +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "UI Language Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurUserAuthorizationRequestReceived(User user)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write User Authorization Request Received to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "User Authorization Request Received - User Fullname: " + user.FullName +
                 " - User Handle: " + user.Handle +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "User Authorization Request Received Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // **** Mood Text is blank sometimes. ****

        public void OurUserMood(User user, string moodtext)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write User Mood to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "User Mood - User FullName: " + user.FullName +
                 " - User DisplayName: " + user.DisplayName +
                 " - User Handle: " + user.Handle +
                 " - Mood Text: " + moodtext +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "User Mood Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurUserStatus(TUserStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write User Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "User Status - TUserStatus Converted Status: " + skype.Convert.UserStatusToText(status) +
                 " - TUserStatus: " + status +
                 "\r\n");

                // If our user status is logged out.
                if (status == TUserStatus.cusLoggedOut)
                {
                    // If Exit on Skype User Logoff Check Box is Checked quit.
                    if (this.UserLogoff.Checked)
                    {
                        TheNotifyIconExample_TimeToExit = true;
                        this.Close();
                    }
                }
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "User Status Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurVoicemailStatus(Voicemail voicemail, TVoicemailStatus status)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write Voicemail Status to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Voicemail Status - Partner Handle: " + voicemail.PartnerHandle);

                // Example of checking length before adding to Window.
                if (voicemail.PartnerDisplayName.Length > 0) AddTextToTextBox1(" - Partner Display Name: " + voicemail.PartnerDisplayName);

                // Continue to write Voicemail Status to Window.
                AddTextToTextBox1(" - Converted TVoicemailStatus Status: " + skype.Convert.VoicemailStatusToText(status) +
                 " - TVoicemailStatus: " + status +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Voicemail Status Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        public void OurWallpaperChanged(string path)
        {
            // Always use try/catch with ANY Skype calls.
            try
            {
                // Write WallpaperChanged to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Wallpaper Changed - Path: " + path +
                 "\r\n");
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 "Wallpaper Changed Event Fired - Bad Text" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // **** Our Custom Code Starts Here ****


        // Skype4COM top window text box.

        public void AddTextToTextBox1(String thetext)
        {
            // Used for ALL Event Handlers except API command Event Handlers like Command, Reply, Error.

            // Currently if AutoScrollOn.Checked/Logging On Check Box is checked
            // we load text into the buffer if not we throw the text away so that
            // the text can be scrolled to view older messages in the window.
            // When the Logging On Check Box is re-checked logging will continue.

            // Write the text to the Window if needed.
            if (this.AutoScrollOn.Checked) this.textBox1.AppendText(thetext);

            // Automatically scroll to the last line if needed.
            if ((this.AutoScrollOn.Checked) && (thetext.Contains("\r\n")))
                this.textBox1.ScrollToCaret();
        }

        // Skype4COM/API commands bottom window text box.

        public void AddTextToTextBox2(String thetext)
        {
            // Used for API command Event Handlers like Command, Reply, Error.

            // Currently if AutoScrollOn.Checked/Logging On Check Box is checked
            // we load text into the buffer if not we throw the text away so that
            // the text can be scrolled to view older messages in the window.
            // When the Logging On Check Box is re-checked logging will continue.

            // Write the text to the Window if needed.
            if (this.AutoScrollOn.Checked) this.textBox2.AppendText(thetext);

            // Automatically scroll to the last line if needed.
            if ((this.AutoScrollOn.Checked) && (thetext.Contains("\r\n")))
                this.textBox2.ScrollToCaret();

            // Let other threads and programs get some CPU time here, we can get busy sometimes.
            // System.Windows.Forms.Application.DoEvents();
        }

        // TheNotifyIconExample Template Logic was added to SEHEwc1 after SEHEwc1 was already created
        // For Startup Logic of NotifyIcon, Taskbar, Exit Logic and many other things as well
        // for information on how you can use TheNotifyIconExample for your projects like here
        // see this http://saveontelephoneservices.com/modules.php?name=News&file=article&sid=8

        // ***** Begin TheNotifyIconExample Logic *****

        // Startup logic for SEHEwc1 is located in: 
        // SEHEwc1_TheNotifyIconExample_Initialize();
        // Any Visual Studio Project User Settings used here can be changed by using Visual Studio:

        // File -> Project -> SEHEwc1 Properties -> Settings

        // NOTES: 1. Click on name at the top to sort Settings by name.
        //        2. Use your Mouse to expand and contract the settings columns drag the columns.
        //        3. You do NOT need to re-build after changing settings.

        // Some Microsoft ClickOnce Settings are Pre-Set and can be changed by using Visual Studio:

        // File -> Project -> SEHEwc1 Properties -> Publish

        // This (SEHEwc1_TheNotifyIconExample_Template) supports the following:

        //  1. Visual Studio Project Template driven, create all future projects with this template.  
        //  2. Startup normal or minimized using.
        //  3. Supports single instance per system only setting.
        //  4. All possible combinations of NotifyIcon and Taskbar logic.
        //  5. All combinations of single/double left/right MouseClick assignments for Form1.
        //  6. All combinations of single/double left/right MouseClick assignments for NotifyIcon.
        //  7. Share ContextMenuStrips with Form1 and NotifyIcon.
        //  8. Use different ContextMenuStrip with Form1 single left MouseClick.
        //  9. Use different ContextMenuStrip with NotifyIcon single left MouseClick.
        // 10. Restricted Exit logic, Exit only from ContextMenuStrip, not Form1.
        // 11. Restricted Exit Warning Message via MessageBox.
        // 12. Restricted Exit Warning Message via NotifyIcon BalloonTip, for vaiable time.
        // 13. Totally Restricted Exit, NotifyIcon only, Initial Form then restrict or No Exit via GUI.
        // 14. Total GUI Invisibility. Of course still stoppable by TaskManager and other programs.
        // 15. Easy to use Visual Studio Project Templates, versions with and without comments.
        // 16. 28 different Visual Studio Project User Settings, over 784+ different possible settings.
        // 17. Change ANY of these settings without the need to re-build.
        // 18. Completly tested, no focus problems, no event loops, no bugs. No Test or Debugging time.
        // 19. Use this template to build an even more customized template for your future projects.
        // 20. Includes Microsoft ClickOnce Deployment and Update Settings from Web Servers.

        // Support for conflicting and/or overlapping project user setting logic is included in this
        // template, by not setting anything that would make you accidentally invisible, an also by
        // making some generic default choices when setting conflicts are encountered.

        // The Visual Studio Project User Settings do what they say they do, when they are true or
        // false. Change the settings, play with them. After changing any setting, simply use Visual
        // Studio: Debug -> Start Debugging to see the differences using the new settings.

        // *** Do NOT Remove the Copyright information below. For Questions: TheUberOverLord@gmail.com
        // (TheNotifyIconExamplewc With Comments) Copyright By TheUberOverLord AKA Don Kennedy
        // Template was built using Microsoft Visual C# 3.0 - 2008 Express Edition .NET 3.5(SP1).
        // SEHEwc1 was built 4/19/2009 6:16:01 PM by TheNotifyIconExamplewc using 799 lines of Code.
        // Project Name: SEHEwc1
        // Safe Project name: SEHEwc1
        // The GUID for SEHEwc1 is: 89eb71e2-37e8-490a-b953-15b173159719 
        // Domain: USGROUP Machine: JRODRIGUEZXPD83 User: JeanR
        // CLR Version: 2.0.50727.3082 
        // Install Path: c:\Program Files\Microsoft Visual Studio 9.0\Common7\IDE\
        // Destination Directory: C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\SEHEwc1
        // Exclusive Project: False
        // More about TheNotifyIconExamplewc can be found here, click the CTRL key
        // in Visual Studio Editor while you MouseOver the link below:
        // http://saveontelephoneservices.com/modules.php?name=News&file=article&sid=8
        // *** Do NOT Remove this Copyright information above. For Questions: TheUberOverLord@gmail.com

        // We do this before we exit and go away.

        public void ByeBye(object sender, FormClosingEventArgs e)
        {
            // If we don't want to honor this Exit request do this
            if ((!TheNotifyIconExample_TimeToExit)
                && (e.CloseReason == CloseReason.UserClosing))
            {
                // If our NotifyIcon is not already in the System Tray, then make it
                // visible there now.
                if (!this.TheNotifyIconExample_NotifyIcon.Visible)
                    this.TheNotifyIconExample_NotifyIcon.Visible = true;

                // Should we display a NotifyIcon BalloonTip?
                if (Properties.Settings.Default.TheNotifyIconExample_ExitWarningBalloonTipIsDisplayed)
                    this.TheNotifyIconExample_NotifyIcon.ShowBalloonTip
                        (Properties.Settings.Default.TheNotifyIconExample_ExitWarningBalloonTipIsDisplayedForThisManyMilliseconds,
                         "SEHEwc1",
                         "SEHEwc1 has minimized here, to the System Tray as an Icon."
                          + " Please right-click this SEHEwc1 Icon on the System Tray"
                          + " and choose Exit to exit.",
                         ToolTipIcon.Info);

                // Should we display a MessageBox?
                if (Properties.Settings.Default.TheNotifyIconExample_ExitWarningMessageBoxIsDisplayed)
                    MessageBox.Show("SEHEwc1 has minimized to the System Tray as an Icon."
                        + "\r\n" +
                          "Please right-click the SEHEwc1 Icon on the System Tray"
                        + "\r\n" +
                          "and choose Exit to exit.");

                // Change our WindowState to be minimized.
                this.WindowState = FormWindowState.Minimized;

                // If we are visible then Hide(); this.Visible = false 
                // equals the same thing.
                if (this.Visible)
                    this.Hide();

                // This will Cancel this Close(); request, don't honor it.
                e.Cancel = true;
            }
            else
            {
                // See Project Properties Settings - Saves All Settings.

                // If we are supposed to save our Command Text do it, otherwise clear it.
                if (this.SaveText.Checked)
                {
                    // Load these setting on a per Windows User for next time we run. ByeBye will save them.
                    Properties.Settings.Default.SavedCommandText = this.CommandText.Text;
                    Properties.Settings.Default.SavedExpectedText = this.ExpectedText.Text;
                }
                else
                {
                    // Load these setting on a per Windows User for next time we run. ByeBye will save them.
                    Properties.Settings.Default.SavedCommandText = "";
                    Properties.Settings.Default.SavedExpectedText = "";
                }

                // Save ALL our loaded settings so that they will be there for next time.
                Properties.Settings.Default.Save();

                // Make Our NotifyIcon go Away before we leave not like some other
                // Programs don't do, that require you to mouse over the NotifyIcon
                // before it goes away well after the program stops, that's sloppy coding.
                if (this.TheNotifyIconExample_NotifyIcon.Visible)
                    this.TheNotifyIconExample_NotifyIcon.Visible = false;
            }
        }

        // This is redundant code , so we share it here, it is used by:
        // TheNotifyIconExample_Form1_Resize(); 
        // TheNotifyIconExample_Handle_Form1_Display();
        private void TheNotifyIconExample_ShowInTaskbar()
        {
            // If we show a Taskbar when minimized or normal and we are in that
            // WindowState now, then show us in the Taskbar.
            if (((this.WindowState == FormWindowState.Minimized)
                && (Properties.Settings.Default.TheNotifyIconExample_ShowUsInTaskbarWhenMinimized))
                || ((this.WindowState == FormWindowState.Normal)
                    && (Properties.Settings.Default.TheNotifyIconExample_ShowUsInTaskbarWhenNormal)))
                this.ShowInTaskbar = true;
        }

        // This event handler is fired by changes caused in WindowState by the "-" to
        // minimize on Form1, as well as the display and minimize menu items in the
        // ContextMenuStrips.
        private void TheNotifyIconExample_Form1_Resize(object sender, System.EventArgs e)
        {
            // Flip our contextMenuStrip1 text for this menu item. This menu item could
            // be in more than one ContextMenuStrip, but if we change it using the menu
            // item text for this.minimizeToolStripMenuItem.Text; it will be changed for the
            // ContextMenuStrips shared by Form1 or NotifyIcon.
            if (this.WindowState == FormWindowState.Minimized)
                this.minimizeToolStripMenuItem.Text = "Display SEHEwc1";
            else
                this.minimizeToolStripMenuItem.Text = "Minimize";

            // Change our visibility if needed. Before we do, make sure we have a NotifyIcon
            // visible.
            if ((this.TheNotifyIconExample_NotifyIcon.Visible)
                && (this.Visible)
                && (this.WindowState == FormWindowState.Minimized)
                && (!Properties.Settings.Default.TheNotifyIconExample_ShowUsInTaskbarWhenMinimized))
                this.Hide();

            // Remove our Taskbar item if needed and also if needed make sure
            // that Form1 is now in focus. Before we do, make sure we have a NotifyIcon
            // visible.
            if ((this.TheNotifyIconExample_NotifyIcon.Visible)
                && (this.ShowInTaskbar)
                && (this.WindowState == FormWindowState.Normal)
                && (!Properties.Settings.Default.TheNotifyIconExample_ShowUsInTaskbarWhenNormal))
            {
                // Remove us from the Taskbar.
                this.ShowInTaskbar = false;

                // Check If we are in Focus and if not
                // Activate the form.
                if (!this.Focused)
                    this.Activate();
            }

            // Add our Taskbar item if needed.
            if (!this.ShowInTaskbar)
                this.TheNotifyIconExample_ShowInTaskbar();
        }

        // This handles any WindowState request changes we get from both MouseClicks on 
        // NotifyIcon as well as our shared or not shared ContextMenuStrip Items from 
        // NotifyIcon and Form1.
        private void TheNotifyIconExample_Handle_Form1_Display()
        {
            // Toggle our WindowState to the opposite of what it is now.
            // If we are going from a minimized to normal display state, make sure we can be
            // seen and that Form1 is also now in Focus as well.
            if (this.WindowState == FormWindowState.Minimized)
            {
                // If we started minimized with only a NotifyIcon located in the System Tray,
                // then we never invoked TheNotifyIconExample_Form1_Resize(); yet, because we
                // set it as a event handler after TheNotifyIconExample_Initial_Display_Logic();
                // was invoked, to avoid TheNotifyIconExample_Form1_Resize(); getting involved
                // at startup, because TheNotifyIconExample_Form1_Resize(); will change the
                // Form1 display to the opposite of what it was, when invoked, so we delay
                // making it an event handler until the initial starup display logic is in
                // place, because of that, we need to set our ContextMenuStrip text to minimize
                // the first time we are displayed as normal here, if needed.

                // Flip our contextMenuStrip1 text for this menu item. This menu item could
                // be in more than one ContextMenuStrip, but if we change it using the menu
                // item text for this.minimizeToolStripMenuItem.Text, it will be changed for
                // the ContextMenuStrips shared by Form1 or NotifyIcon.
                if (this.minimizeToolStripMenuItem.Text != "Minimize")
                    this.minimizeToolStripMenuItem.Text = "Minimize";

                // If we were hidden then make us visible, Show(); is equal to               
                // this.visible = true. 
                if (!this.Visible)
                    this.Show();
                // Check If we are in Focus as well if not
                // Activate the form.
                if (!this.Focused)
                    this.Activate();

                // Change our WindowState to normal display.
                this.WindowState = FormWindowState.Normal;

                // Add our Taskbar item if needed. Form Resize is not called
                // first time so we do it here for that reason as well.
                if (!this.ShowInTaskbar)
                    this.TheNotifyIconExample_ShowInTaskbar();
            }
            else
                // Change our WindowState to display minimized.
                this.WindowState = FormWindowState.Minimized;
        }

        // This sets our initial starup use of NotifyIcon and Taskbar at program startup.
        private void TheNotifyIconExample_Initial_Display_Logic()
        {
            // If we are going to be invisible do this.
            if (Properties.Settings.Default.TheNotifyIconExample_StartUsTotallyInvisible)
            {
                // Hide us.
                this.Visible = false;
                // Remove us from the Taskbar.
                this.ShowInTaskbar = false;
                // Hide our NotifyIcon.
                this.TheNotifyIconExample_NotifyIcon.Visible = false;
                // Change our WindowState to Minimized.
                this.WindowState = FormWindowState.Minimized;
            }
            else
            {
                // Check for settings that could accidentally make us invisible
                // If we find them then make sure we don't let that happen.
                if ((Properties.Settings.Default.TheNotifyIconExample_ShowUsInTaskbarWhenMinimized)
                    && (Properties.Settings.Default.TheNotifyIconExample_ShowUsInTaskbarWhenNormal)
                    && (!Properties.Settings.Default.TheNotifyIconExample_ShowSystemTrayNotifyIcon))
                    this.TheNotifyIconExample_NotifyIcon.Visible = false;
                else
                    this.TheNotifyIconExample_NotifyIcon.Visible = true;

                // If we are starting minimized or normal and have a NotifyIcon
                // but want no Taskbar then remove our Taskbar Item and make us invisible
                // for the moment. But, make sure our settings are set to show a NotifyIcon.
                if ((Properties.Settings.Default.TheNotifyIconExample_ShowSystemTrayNotifyIcon)
                    && (((Properties.Settings.Default.TheNotifyIconExample_StartUsMinimized)
                        && (!Properties.Settings.Default.TheNotifyIconExample_ShowUsInTaskbarWhenMinimized))
                        || ((!Properties.Settings.Default.TheNotifyIconExample_StartUsMinimized)
                            && (!Properties.Settings.Default.TheNotifyIconExample_ShowUsInTaskbarWhenNormal))))
                {
                    // Hide us.
                    this.Visible = false;
                    // Remove us from the Taskbar.
                    this.ShowInTaskbar = false;
                }

                // If we start minimized, then set our WindowState to Minimized now.
                if (Properties.Settings.Default.TheNotifyIconExample_StartUsMinimized)
                    this.WindowState = FormWindowState.Minimized;
                else
                {
                    // We are going to start as normal display. Change our ContextMenuStrip
                    // item text so that when we are being displayed normal we show minimize
                    // as the Context Menu Item text. 
                    this.minimizeToolStripMenuItem.Text = "Minimize";

                    // Display Form1 as normal display Show(); is equal to this.Visible = true;
                    this.Show();
                    // Bring Form1 into focus.
                    this.Activate();
                }

                // If we are supposed to have a NotifyIcon in the System Tray
                // turn it on now.
                if (Properties.Settings.Default.TheNotifyIconExample_ShowSystemTrayNotifyIcon)
                    this.TheNotifyIconExample_NotifyIcon.Visible = true;
            }
        }

        // **** End - Form1 NotifiyIcon, Taskbar, Startup and minimized or normal logic ****

        // **** Begin - Form1 and NotifyIcon MouseClicks and ContextMenuStrip display logic ****

        // Was our last MouseClick a left MouseClick?
        private bool TheNotifyIconExample_LastMouseClickWasLeft = false;

        // Did our last MouseClick come from NotifyIcon?
        private bool TheNotifyIconExample_LastMouseClickFromNotifyIcon = false;

        // Was this a single or double MouseClick and were they from NotifyIcon?
        private bool TheNotifyIconExample_LastMouseClicksWereNotifyIconDoubleClicks = false;

        // This is redundant code, so we share it here, it is used by:
        // TheNotifyIconExample_contextMenuStrip1_Opening(); 
        // TheNotifyIconExample__MouseClick(); 
        // TheNotifyIconExample__MouseDoubleClick();
        private void TheNotifyIconExample_ActivateAndShow()
        {
            // When using NotifyIcon and dealing with MouseClicks
            // we need to always make sure Form1 is in Focus
            // after MouseClicks on NotifyIcon.
            if ((this.Visible == true)
            && (!this.Focused))
                this.Activate();
        }

        // This event handler can disable NotifyIcon single right MouseClicks for NotifyIcon
        // here, which means the normal ContextMenuStrip will not display when we right single
        // MouseClick NotifyIcon.

        // This can be also used to disable all MouseClicks on NotifyIcon if all other click
        // logic is false for NotifyIcon, which can be used for a monitoring program
        // that you may want the user to know is running, but not allow them to stop, using
        // the GUI, of course, if they have permission, they can still stop the process
        // using programs like the TaskManager.

        // Double right MouseClick logic remains active even when a single right MouseClick
        // is disabled for both NotifyIcon as well as Form1. So you can still select a
        // right double MouseClick project user setting for NotifyIcon and Form1 even when
        // single right MouseClick have been disabled.

        // We don't want to stop ALL displays of the ContextMenuStrip from say a left 
        // MouseClick or left/right double MouseClick, which is a selectable project user
        // setting in this example. We also do not want to limit the ability of Form1 to use a
        // single right MouseClick to display the ContextMenuStrip if or when needed.

        // We use some MouseClick information obtained from TheNotifyIconExample_MouseDown();
        // which is fired for both single and double MouseDown events for NotifyIcon and 
        // is used to help us determine where the MouseClick came from, Form1 or the NotifyIcon
        // as well as which mouse button was clicked, left or right, and was it a single
        // or a double MouseClick.
        private void TheNotifyIconExample_contextMenuStrip1_Opening(object sender, System.ComponentModel.CancelEventArgs e)
        {
            // Make sure this was a single or double right MouseClick.
            // Was the last MouseClick on NotifyIcon? It could have been on Form1.
            // Are single right MouseClicks disabled?
            // Are single double right MouseClicks for ContextMenuStrips enabled?
            if ((!this.TheNotifyIconExample_LastMouseClickWasLeft)
                 && (this.TheNotifyIconExample_LastMouseClickFromNotifyIcon)
                 && (Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseSingleRightClickDisabled)
                 && ((!this.TheNotifyIconExample_LastMouseClicksWereNotifyIconDoubleClicks)
                     || ((this.TheNotifyIconExample_LastMouseClicksWereNotifyIconDoubleClicks)
                         && (!Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseDoubleRightClickShowsContextMenuStrip))))
            {
                // Stop the ContextMenuStrip from being visible.
                this.TheNotifyIconExample_contextMenuStrip1.Visible = false;

                // Don't honor this ContextMenuStrip display request.
                e.Cancel = true;

                // When using NotifyIcon and dealing with MouseClicks
                // we need to always make sure Form1 is in Focus
                // after MouseClicks on NotifyIcon.
                if (this.WindowState == FormWindowState.Normal)
                    this.TheNotifyIconExample_ActivateAndShow();
            }
        }

        // This is redundant code, so it is shared here, and used by:
        // TheNotifyIconExample_MouseClick();
        // TheNotifyIconExample_MouseDoubleClick();
        // To dislay a NotifyIcon ContextMenuStrip for MouseClicks other than single right
        // MouseClicks on NotifyIcon.
        private void TheNotifyIconExample_DisplayNotifyIconContextMenu(object sender)
        {
            // This is a very neat way for displaying a ContextMenuStrip from
            // NotifyIcon MouseClicks other than single right MouseClicks, it uses
            // System Reflection. Positioning is automatic as well this way.

            // Declare locals.
            NotifyIcon eventSource = null;
            Type niHandle = null;

            // Cast the event sender back to a NotifyIcon
            // for the sake of convienience.
            eventSource = (NotifyIcon)sender;

            // Get the type instance from the NotifyIcon.
            niHandle = eventSource.GetType();

            // Invoke the private ShowContextMenu method.
            niHandle.InvokeMember(
                    "ShowContextMenu",
                    BindingFlags.Instance |
                    BindingFlags.NonPublic |
                    BindingFlags.InvokeMethod,
                    null,
                    eventSource,
                    null
                    );
        }

        // This event handler handles our MouseDown events for both Form1 and NotifyIcon.

        // We use this event handler to help us keep track of where the MouseClick came from,
        // Form1 or NotifyIcon as well as what Mouse Button was pressed, Left or Right,
        // and was this a double or single MouseDown event, which is only important
        // if we have single right MouseClicks disabled for NotifyIcon but have double right
        // MouseClicks enabled for NotifyIcon to display the ContextMenuStrip.
        private void TheNotifyIconExample_MouseDown(object sender, System.Windows.Forms.MouseEventArgs e)
        {
            // If this event was fired from NotifyIcon then do this.
            if (sender == this.TheNotifyIconExample_NotifyIcon)
            {
                // Our Last Mouse Clicks came from NotifyIcon.
                this.TheNotifyIconExample_LastMouseClickFromNotifyIcon = true;

                // Was this a single MouseClick or a double MouseClick for ContextMenuStrip
                // display purposes? We come here twice on double MouseClicks once as 
                // Clicks = 1 and once as Clicks = 2. 

                // TheNotifyIconExample_contextMenuStrip1_Opening(); is also called twice
                // for double right MouseClicks, but always after this event fires, so the
                // second time if Clicks = 2 and double right MouseClicks on NotifyIcon are
                // set to display the TheNotifyIconExample_contextMenuStrip1; we need to set
                // this before TheNotifyIconExample_contextMenuStrip1_Opening(); fires to
                // allow double right MouseClicks on NotifyIcon to display the 
                // TheNotifyIconExample_ContextMenuStrip1; if needed. If you wish to use this
                // Clicks count for other things, you will need to verify the order in
                // which other Mouse events fire, which was also tested in this case.
                if (e.Clicks == 2)
                    this.TheNotifyIconExample_LastMouseClicksWereNotifyIconDoubleClicks = true;
                else
                    this.TheNotifyIconExample_LastMouseClicksWereNotifyIconDoubleClicks = false;
            }
            else
                // This MouseDown did not come from NotifyIcon.
                this.TheNotifyIconExample_LastMouseClickFromNotifyIcon = false;

            // Was it a left or right MouseDown?
            if (e.Button == MouseButtons.Left)
                this.TheNotifyIconExample_LastMouseClickWasLeft = true;
            else
                this.TheNotifyIconExample_LastMouseClickWasLeft = false;
        }

        // This event handler handles single MouseClicks for both Form1 and our NotifyIcon.

        // Currently this example shows how to assign a different ContextMenuStrip for single 
        // left MouseClicks on NotifyIcon and Form1. The same could be done for single right
        // and or double left and right MouseClicks as well.

        // Note: This event handler fires twice for double MouseClicks.
        private void TheNotifyIconExample_MouseClick(object sender, MouseEventArgs e)
        {
            // Check to see if we should minimize or display Form1 normally.
            if (((sender == this.TheNotifyIconExample_NotifyIcon)
                && (((Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseSingleLeftClickShowsForm1)
                    && (this.TheNotifyIconExample_LastMouseClickWasLeft))
                    || ((Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseSingleRightClickShowsForm1)
                        && (!this.TheNotifyIconExample_LastMouseClickWasLeft))))
                || ((sender == this)
                    && (((Properties.Settings.Default.TheNotifyIconExample_Form1MouseSingleRightClickMinimizesForm1)
                        && (!this.TheNotifyIconExample_LastMouseClickWasLeft))
                        || ((Properties.Settings.Default.TheNotifyIconExample_Form1MouseSingleLeftClickMinimizesForm1)
                            && (this.TheNotifyIconExample_LastMouseClickWasLeft)))))
            {
                // Toggle Form1 display from minimized - normal - minimized.
                this.TheNotifyIconExample_Handle_Form1_Display();

                // If sender equals Form1 then we just minimized Form1, so return now, because
                // we never want to attempt to display a ContextMenuStrip for Form1 when it is
                // minimized, as we could if we continued and our settings were set to attempt
                // to do this accidently as well as minimize for the same MouseClicks.

                // Whereas supporting two functions for NotifyIcon for the same MouseClicks,
                // might be acceptable and is possible to support properly.
                if (sender == this)
                    return;
            }

            // This handles our display of ContextMenuStrips for both Form1 and NotifyIcon when
            // single MouseClicks are set to true to display the ContextMenuStrip in the
            // Visual Studio Project User Settings.

            // NotifyIcon single right MouseClicks are automatically handled by the NotifyIcon
            // class, which is why you see us look only for left MouseClicks for NotifyIcon
            // and both left and right MouseClicks for Form1.

            // This example supports a different ContextMenuStrip for single left MouseClicks
            // for both NotifyIcon and Form1.
            if (((sender == this.TheNotifyIconExample_NotifyIcon)
                && (!this.TheNotifyIconExample_NotifyIcon.ContextMenuStrip.Visible)
                && (this.TheNotifyIconExample_LastMouseClickWasLeft)
                && (Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseSingleLeftClickShowsContextMenuStrip))
                || ((sender == this)
                    && (!this.ContextMenuStrip.Visible)
                    && (((Properties.Settings.Default.TheNotifyIconExample_Form1MouseSingleLeftClickShowsContextMenuStrip)
                        && (this.TheNotifyIconExample_LastMouseClickWasLeft))
                        || (!Properties.Settings.Default.TheNotifyIconExample_Form1MouseSingleRightClickDisabled)
                            && (!this.TheNotifyIconExample_LastMouseClickWasLeft))))
            {
                // Display the ContextMenuStrip for NotifyIcon.
                if (sender == this.TheNotifyIconExample_NotifyIcon)
                {
                    // This handles support of multiple ContextMenuStrips here we show an
                    // example of assigning a different ContextMenuStrip for a single left
                    // MouseClick on NotifyIcon.
                    if (Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseSingleLeftClickUsesDifferentContextMenuStrip)
                        this.TheNotifyIconExample_NotifyIcon.ContextMenuStrip = this.TheNotifyIconExample_contextMenuStrip2;

                    // Display the ContextMenuStrip for left single MouseClicks.
                    this.TheNotifyIconExample_DisplayNotifyIconContextMenu(sender);

                    // This puts the normal ContextMenuStrip back for NotifyIcon after we 
                    // displayed a different one.
                    if (Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseSingleLeftClickUsesDifferentContextMenuStrip)
                        this.TheNotifyIconExample_NotifyIcon.ContextMenuStrip = this.TheNotifyIconExample_contextMenuStrip1;
                }
                else
                    // Display the ContextMenuStrip for Form1.
                    if (sender == this)
                    {
                        // Replace the Empty ContextMenuStrip for Form1 with a real one. See 
                        // SEHEwc1_TheNotifyIconExample_Initialize();
                        // for more details on why we need to do this.
                        if (Properties.Settings.Default.TheNotifyIconExample_Form1MouseSingleLeftClickUsesDifferentContextMenuStrip)
                            this.ContextMenuStrip = this.TheNotifyIconExample_contextMenuStrip2;
                        else
                            this.ContextMenuStrip = this.TheNotifyIconExample_contextMenuStrip1;

                        // Display the ContextMenuStrip for left single MouseClicks.
                        this.ContextMenuStrip.Show(Control.MousePosition);

                        // This puts an Empty ContextMenuStrip back for Form1 after we displayed
                        // a real one. So that we do not lose MouseClick events for Form1.
                        this.ContextMenuStrip = new ContextMenuStrip();
                    }
            }

            // When using NotifyIcon and dealing with MouseClicks
            // we need to always make sure Form1 is in Focus
            // after MouseClicks on NotifyIcon.
            if (this.WindowState == FormWindowState.Normal)
                this.TheNotifyIconExample_ActivateAndShow();
        }

        // This event handler handles both left and right double MouseClicks for Form1
        // and NotifyIcon.
        private void TheNotifyIconExample_MouseDoubleClick(object sender, MouseEventArgs e)
        {
            // This handles our display Of Form1 when NotifyIcon or Form1 is double
            // MouseClicked.
            if (((sender == this.TheNotifyIconExample_NotifyIcon)
                && (((Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseDoubleLeftClickShowsForm1)
                    && (this.TheNotifyIconExample_LastMouseClickWasLeft))
                    || ((Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseDoubleRightClickShowsForm1)
                        && (!this.TheNotifyIconExample_LastMouseClickWasLeft))))
                || ((sender == this)
                    && (((Properties.Settings.Default.TheNotifyIconExample_Form1MouseDoubleRightClickMinimizesForm1)
                        && (!this.TheNotifyIconExample_LastMouseClickWasLeft))
                        || ((Properties.Settings.Default.TheNotifyIconExample_Form1MouseDoubleLeftClickMinimizesForm1)
                            && (this.TheNotifyIconExample_LastMouseClickWasLeft)))))
            {
                // Toggle Form1 display from minimized - normal - minimized.
                this.TheNotifyIconExample_Handle_Form1_Display();

                // If sender equals Form1 then we just minimized Form1, so return now, because
                // we never want to attempt to display a ContextMenuStrip for Form1 when it is
                // minimized, as we could if we continued and our settings were set to
                // attempt to do this accidently as well as minimize for the same MouseClicks.

                // Whereas supporting two functions for NotifyIcon for the same MouseClicks,
                // might be acceptable and is possible to support properly.
                if (sender == this)
                    return;
            }

            // This handles our display of the ContextMenuStrip when NotifyIcon is double
            // MouseClicked.
            if (((sender == this.TheNotifyIconExample_NotifyIcon)
                && (((Properties.Settings.Default.TheNotifyIconExample_NotifyIconMouseDoubleLeftClickShowsContextMenuStrip)
                    && (this.TheNotifyIconExample_LastMouseClickWasLeft))
                    || ((Properties.Settings.Default.TheNotifyIconExample_Form1MouseDoubleRightClickShowsContextMenuStrip)
                        && (!this.TheNotifyIconExample_LastMouseClickWasLeft))))
                || ((sender == this)
                    && (((Properties.Settings.Default.TheNotifyIconExample_Form1MouseDoubleRightClickShowsContextMenuStrip)
                        && (!this.TheNotifyIconExample_LastMouseClickWasLeft))
                        || ((Properties.Settings.Default.TheNotifyIconExample_Form1MouseDoubleLeftClickShowsContextMenuStrip)
                            && (this.TheNotifyIconExample_LastMouseClickWasLeft)))))
                // If this came from NotifyIcon then do this.
                if (sender == this.TheNotifyIconExample_NotifyIcon)
                    this.TheNotifyIconExample_DisplayNotifyIconContextMenu(sender);
                else
                    // If this came from Form1. Do this.
                    if (sender == this)
                    {
                        // Replace the empty ContextMenuStrip for Form1 with a real one.
                        // See SEHEwc1_TheNotifyIconExample_Initialize(); for
                        // more details on why we need to do this.
                        this.ContextMenuStrip = this.TheNotifyIconExample_contextMenuStrip1;

                        // Display the ContextMenuStrip on Form1 at current MousePostion.
                        this.ContextMenuStrip.Show(Control.MousePosition);

                        // This puts an empty ContextMenuStrip back for Form1 after we displayed
                        // a real one. So that we do not lose MouseClick events for Form1. 
                        this.ContextMenuStrip = new ContextMenuStrip();
                    }

            // When using NotifyIcon and dealing with MouseClicks
            // we need to always make sure Form1 is in Focus
            // after MouseClicks on NotifyIcon.
            if (this.WindowState == FormWindowState.Normal)
                this.TheNotifyIconExample_ActivateAndShow();
        }

        // **** End - Form1 and NotifyIcon MouseClicks and ContextMenuStrip display logic. ****

        // ***** End TheNotifyIconExample Logic *****


        // We monitor key strokes inside command text box. Looking for the ENTER key.

        // An Event was set to invoke this in the form designer:
        // this.CommandText.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.CommandText_KeyPress);

        void CommandText_KeyPress(object sender, System.Windows.Forms.KeyPressEventArgs e)
        {
            // What key on the keyboard was entered in the Command text box?
            if (e.KeyChar == (char)13)
            {
                // Could have been > 0 but 1 catches junk.
                if (this.CommandText.Text.Length > 1)
                {
                    // Process the text to be sent.
                    SendCommandText();
                }

                // Based on check box checked clear our Command text boxes.
                if (!this.SaveText.Checked)
                {
                    this.CommandText.Clear();
                    this.ExpectedText.Clear();
                }

                // We need to let Windows as an Operating System, know we handled this event.
                e.Handled = true;
            }
        }

        // We monitor key strokes inside expected text box. Looking for the ENTER key.

        // We do this here ALSO so that messages can easily be sent when using Expected Text
        // without the need to go back to the Command Text box and press the ENTER key so
        // it can be done from both text boxes.

        // An Event was set to invoke this in the form designer:
        // this.ExpectedText.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.ExpectedText_KeyPress);

        void ExpectedText_KeyPress(object sender, System.Windows.Forms.KeyPressEventArgs e)
        {
            // What key on the keyboard was entered in the Expected text box?
            if (e.KeyChar == (char)13)
            {
                // Could have been > 0 but 1 catches junk.
                if (this.CommandText.Text.Length > 1)
                {
                    // Process the text to be sent.
                    SendCommandText();
                }

                // Based on check box checked clear our Command text boxes.
                if (!this.SaveText.Checked)
                {
                    this.ExpectedText.Clear();
                    this.CommandText.Clear();
                }

                // We need to let Windows as an Operating System, know we handled this event.
                e.Handled = true;
            }
        }

        // Here is our timer event where we warn the Skype user to check for approval
        // of this program in case this program needs authorization by the Skype client.

        // When FirstTime equals true, the initial timer to expire is set to one Millisecond.
        // When FirstTime equals false, the initial timer is set to expire 30 seconds after
        // a PendingAuthorization Attachment response has been received. The timer will 
        // continue to fire every 60 seconds after the OK has been clicked on the Message
        // Box until the program authorization issue has been resolved.

        public void OurTimerPromptUser(object source, System.EventArgs e)
        {
            try
            {
                // Stop our System timer.
                OurPendingAuthTimer.Stop();
            }
            catch (Exception ee)
            {
                // Write problem stopping System Timer to Window, drop into debug if wanted.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - Unable to Stop OurPendingAuthTimer" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Write how to Authorize this program to Window.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code *** Check The Skype Window to Allow this Program ***" +
             "  - Check New Events at the top right of the Skype Window" +
             "  - Then click on the link under plugin authorization" +
             "\r\n");

            // Open a message box, write how to Authorize this program to it as well.
            MessageBox.Show("*** Check The Skype Window to Allow this Program *** \r\n"
                            + "Check New Events at the top right of the Skype Window \r\n"
                            + "      Then click on the link under plugin authorization \r\n"
                            + "             Click OK in this Box FIRST to Continue");

            // We Could have already cancelled our timer if we received a Sucessful Attachment
            // But...The Message Box might still be present because the user forgot
            // to Click "OK" first before this program was approved which would cause
            // us to reset the timer and display this message even after we were already
            // approved by the Users Skype Client. This is WHY we check WasAttached to see
            // if we have had a successful attachment response since the message box has been
            // displayed before we set another timer event.

            // If we were not attached since we started this program, this time.
            if (!WasAttached)
            {
                try
                {
                    // We will send this message again in 60 seconds if we do not receive a 
                    // successful attachment, if we do receive one, this timer will be cancelled.

                    OurPendingAuthTimer.Interval = 60000; // Set Timer to Expire again in 60 seconds.
                    OurPendingAuthTimer.Start();          // To Prompt User To Approve this program.
                }
                catch (Exception eee)
                {
                    // System Timer start problem, log an error, drop into debug if wanted.
                    AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                     " Our Code - Unable To Reset OurPendingAuthTimer" +
                     " - Exception Source: " + eee.Source + " - Exception Message: " + eee.Message +
                     "\r\n");

                    // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                    Debug.Assert(!this.UseAutoDebug.Checked);
                }
            }
        }

        // Here is where we handle sending the API command when needed. This is
        // fired when the enter key is used in the command text or expected text box
        // if and when there is any command to send in the command text box.

        private void SendCommandText()
        {
            try
            {
                // Set API Send Command options based on check boxes.
                if ((this.UseCommandId.Checked) || (command.Id < 0)) command.Id++;
                command.Command = CommandText.Text;
                command.Expected = ExpectedText.Text;
                command.Blocking = this.UseBlocking.Checked;
                command.Timeout = skype.Timeout;
            }
            catch (Exception e)
            {
                // Possibly old Skype4COM version, log an error, drop into debug if wanted.
                AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                 "  Our Code - Send Command Setup Failed" +
                 " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            try
            {
                // Send API Send Command.
                skype.SendCommand(command);
            }
            catch (Exception e)
            {
                // Possible timeout sending API Command.
                if (this.RetryCommandTimeouts.Checked)
                {
                    try
                    {
                        // Write to Window that first send command failed, and that we are retrying.
                        AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                         "  Our Code - Send Command Failed, Trying Again" +
                         "\r\n");

                        // Send API Send Command.
                        skype.SendCommand(command);
                    }
                    catch (Exception ee)
                    {
                        // Possible timeout sending API Command, log an error, drop into debug if wanted.
                        AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                         "  Our Code - Send Command Failed, Stoped Retrying" +
                         " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                         "\r\n");

                        // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                        Debug.Assert(!this.UseAutoDebug.Checked);
                    }
                }
                else
                {
                    // Possible timeout sending API Command, log an error.
                    AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
                     "  Our Code - Send Command Failed, No Retry" +
                     " - Exception Source: " + e.Source + " - Exception Message: " + e.Message +
                     "\r\n");
                }

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // When Check Boxes are checked or unchecked and links are clicked, these event 
        // handlers fire and load our user settings with the most current values of these
        // check boxes so that we can save them in our project settings prior to going away
        // and load the settings at startup as well.

        // The Context Menu is shared by both Form1 and our NotifyIcon and any Context
        // Menu selections are here as well.

        // When API Help link is clicked this opens DevZone API Home page.

        // An Event was set to invoke this in the form designer by double clicking
        // the link which created an empty event which we added our logic afterwards.

        private void APIHelp_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("https://developer.skype.com/Docs/ApiDoc");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - APIHelp_LinkClicked: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // API Documentation Context Menu Item was clicked on.

        private void aPIDocumentationToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("https://developer.skype.com/Docs/ApiDoc");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - aPIDocumentationToolStripMenuItem_Click: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // This enables/disables logging.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void AutoScrollOn_CheckedChanged(object sender, EventArgs e)
        {
            // At some point I might support "Pausing" of Scrolling and still log but
            // For now I will just stop logging instead and not update the user settings
            // for next time use for this user setting.

            // Properties.Settings.Default.AutoScroll = this.AutoScrollOn.Checked;

            // Write User Auto Scroll On Mode Checked Changed.
            this.textBox1.AppendText(DateTime.Now.ToLocalTime() + ": ");
            this.textBox1.AppendText(" Our Code - AutoScrollOn_CheckedChanged: " + this.AutoScrollOn.Checked);
            this.textBox1.AppendText(Environment.NewLine);
            this.textBox1.ScrollToCaret();
        }

        // When Program Help link is clicked, opens forum post for help for this program.

        // An Event was set to invoke this in the form designer by double clicking
        // the link which created an empty event which we added our logic afterwards.

        private void ClickForDetails_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("http://forum.skype.com/index.php?showtopic=142821");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - ClickForDetails_LinkClicked: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // Close this Menu was selected from our Context Menu(s)
        private void closeThisMenuToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (sender == this.TheNotifyIconExample_NotifyIcon.ContextMenuStrip)
                this.TheNotifyIconExample_NotifyIcon.ContextMenuStrip.Visible = false;
            else
                if (sender == this.TheNotifyIconExample_contextMenuStrip1)
                    this.TheNotifyIconExample_contextMenuStrip1.Visible = false;
                else
                    this.TheNotifyIconExample_contextMenuStrip2.Visible = false;
        }

        // When DevZone Help link is clicked this opens DevZone Home page.

        // An Event was set to invoke this in the form designer by double clicking
        // the link which created an empty event which we added our logic afterwards.

        private void DevZoneHelp_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("https://developer.skype.com/");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - ADevZoneHelp_LinkClicked: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // DevZone Context Menu Item was clicked on.

        private void devZoneToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("https://developer.skype.com/");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - devZoneToolStripMenuItem_Click: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // An Event was set to invoke this in the form designer by double clicking
        // the link which created an empty event which we added our logic afterwards.

        private void Donate_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("http://www.saveontelephonebills.com/skype/SEHEwc1/DonateForSEHE.html");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - Donate_Link Clicked: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // Donate Context Menu Item was clicked on.

        private void donateToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("http://www.saveontelephonebills.com/skype/SEHEwc1/DonateForSEHE.html");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - donateToolStripMenuItem_Click: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // Sets Silent Mode.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void EnableSilentMode_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.SetSilentModeOn = this.EnableSilentMode.Checked;

            // Write User Enable Silent Mode Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - EnableSilentMode_CheckedChanged: " + this.EnableSilentMode.Checked +
             "\r\n");

            // Always use try/catch with ANY Skype calls.
            try
            {
                // If Skype is running and we are attached continue.
                if ((skype.Client.IsRunning) && (this.Attached))
                {
                    // If checkbox is checked to set Silent Mode and Silent Mode is NOT set to true already, set Silent Mode to true.
                    if ((this.EnableSilentMode.Checked) && (!skype.SilentMode))
                    {
                        // Always use try/catch with ANY Skype calls.
                        try
                        {
                            // Set Silent mode to true.
                            skype.SilentMode = true;

                            // Write to Window tha Silent Mode has been set to true.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  Our Code - Skype Silent Mode Set To: " + skype.SilentMode +
                             "\r\n");
                        }
                        catch (Exception ee)
                        {
                            // Could be old Skype4COM version, log an error, drop into debug if needed.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             "  Our Code - Skype Silent Mode Set Failed" +
                             " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }
                    }
                }
            }
            catch (Exception ee)
            {
                // Could be old Skype4COM version, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - Unable To Check if Skype is running - Will Wait for Skype to Start" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // This fires when Exit is selected from our Context Menu.

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            TheNotifyIconExample_TimeToExit = true;
            this.Close();
        }

        // Can act like program was run first time every time when set.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void FirstTimeAlwaysTrue_CheckedChanged(object sender, EventArgs e)
        {
            // Write First Time Always True Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - FirstTimeAlwaysTrue_CheckedChanged: " + this.FirstTimeAlwaysTrue.Checked +
             " - Please Stop/Start this program for change to take effect" +
             "\r\n");

            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.AlwaysFirstTime = this.FirstTimeAlwaysTrue.Checked;

            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            if (this.FirstTimeAlwaysTrue.Checked) Properties.Settings.Default.FirstTime = true;
        }

        // This fires when Skype beta version download is selected from our Context Menu.

        private void getLatestBetaSkypeVersionToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                // Open a browser window to Download the Skype client.
                System.Diagnostics.Process.Start("http://www.anrdoezrs.net/click-3140383-10420859?url=http%3A%2F%2Fskype.com%2Fdownload%2Fskype%2Fwindows%2Fbeta%2F%2F%3Fcm_mmc%3Daffiliate%2D%5F%2Dcommission%5Fjunction%2D%5F%2Dlink%2D%5F%2Dbuilder");
            }
            catch (Exception eee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - getLatestBetaSkypeVersionToolStripMenuItem_Click: Unable To Open Download Page for Skype: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + eee.Source + " - Exception Message: " + eee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // This fires when Skype beta version download is selected from our Context Menu.

        private void getLatestBusinessSkypeVersionToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                // Open a browser window to Download the Skype client.
                System.Diagnostics.Process.Start("http://www.anrdoezrs.net/click-3140383-10420859?url=http%3A%2F%2Fskype.com%2Fdownload%2Fskype%2Fwindows%2Fbusiness%2F%2F%3Fcm_mmc%3Daffiliate%2D%5F%2Dcommission%5Fjunction%2D%5F%2Dlink%2D%5F%2Dbuilder");
            }
            catch (Exception eee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - getLatestBusinessSkypeVersionToolStripMenuItem_Click: Unable To Open Download Page for Skype: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + eee.Source + " - Exception Message: " + eee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // This fires when Skype beta version download is selected from our Context Menu.

        private void getLatestSkypeVersionToolStripMenuItem_Click(object sender, EventArgs e)
        {
            try
            {
                // Open a browser window to Download the Skype client.
                System.Diagnostics.Process.Start("http://www.anrdoezrs.net/click-3140383-10420859?url=http%3A%2F%2Fwww.skype.com%2Fdownload%2Fskype%2Fwindows%2F%2F%3Fcm_mmc%3Daffiliate%2D%5F%2Dcommission%5Fjunction%2D%5F%2Dlink%2D%5F%2Dbuilder");
            }
            catch (Exception eee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - getLatestSkypeVersionToolStripMenuItem_Click: Unable To Open Download Page for Skype: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + eee.Source + " - Exception Message: " + eee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // Help For This Program Context Menu Item was clicked on.

        private void helpForThisProgramToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("http://forum.skype.com/index.php?showtopic=142821");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - helpForThisProgramToolStripMenuItem_Click: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

        }

        // Hides the API windows area so that people who only use Skype4COM methods
        // do not see API command and control window area. This is used with Form designer
        // and setting AutoSize to true for Form1 to allow the form to shrink/grow when
        // form items are made not visible.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void HideAPIWindow_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.HideAPI = this.HideAPIWindow.Checked;

            // Write Hide API Window Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - HideAPIWindow_CheckedChanged: " + this.HideAPIWindow.Checked +
             "\r\n");

            // To shrink or grow we need to set item visibility. Our form in form designer is set
            // to AutoSize.
            if (!this.HideAPIWindow.Checked)
            {
                this.CommandTextLabel.Visible = true;
                this.ExpectedTextLabel.Visible = true;
                this.UseBlocking.Visible = true;
                this.UseCommandId.Visible = true;
                this.SaveText.Visible = true;
                this.RetryCommandTimeouts.Visible = true;
                this.CommandText.Visible = true;
                this.ExpectedText.Visible = true;
                this.textBox2.Visible = true;
            }
            else
            {
                this.CommandTextLabel.Visible = false;
                this.ExpectedTextLabel.Visible = false;
                this.UseBlocking.Visible = false;
                this.UseCommandId.Visible = false;
                this.SaveText.Visible = false;
                this.RetryCommandTimeouts.Visible = false;
                this.CommandText.Visible = false;
                this.ExpectedText.Visible = false;
                this.textBox2.Visible = false;
            }
        }

        // Shows how to use waited and non-waited attach requests. This example only uses
        // waited when this program is started and Skype is started and not logged on and
        // this check box is not checked.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        // If Minimize is selected from our Context Menu, this will fire.

        private void minimizeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            TheNotifyIconExample_Handle_Form1_Display();
        }

        // The NonWaitedAttachRequests Check Box was changed.

        private void MSDN_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("http://code.msdn.microsoft.com/SEHEwc1");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - MSDN_LinkClicked: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        private void NonWaitedAttachRequests_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.AlwaysNonWaitedAttach = this.NonWaitedAttachRequests.Checked;

            // Write Non Waited Attach Requests Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - NonWaitedAttachRequests_CheckedChanged: " + this.NonWaitedAttachRequests.Checked +
             "\r\n");
        }

        // Retry Command Timeouts Check Box was changed.

        private void RetryCommandTimeouts_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.RetryCommandTimeOut = this.RetryCommandTimeouts.Checked;

            // Write Retry Command Timeouts Checked Changed.
            AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - RetryCommandTimeouts_CheckedChanged: " + this.RetryCommandTimeouts.Checked +
             "\r\n");
        }

        // An Event was set to invoke this in the form designer by double clicking
        // the link which created an empty event which we added our logic afterwards.

        private void SaveOnTelephoneBills_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("http://saveontelephonebills.com");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - SaveOnTelephoneBills_Link Clicked: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // SaveOnTelephoneBills.Com Context Menu Item was clicked on.

        private void saveOnTelephoneBillscomToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("http://saveontelephonebills.com");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - saveOnTelephoneBillscomToolStripMenuItem_Click: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // This allows the command text and expected text to remain present after the command
        // was sent. It also will save the last command and expected text in user settings
        // as well so that when the program is re-started the last command and expected text
        // from the last program run will be there. When this check box is not checked both
        // command text and expected text is removed when the enter key is entered in both
        // the command text and expected text boxes when there is text in the command text
        // text box.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void SaveText_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.SaveTheText = this.SaveText.Checked;

            // Write Save Text Checked Changed.
            AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - SaveText_CheckedChanged: " + this.SaveText.Checked +
             "\r\n");
        }

        // When Skype4COM help link is clicked this opens DevZone Skype4COM Home page.

        // An Event was set to invoke this in the form designer by double clicking
        // the link which created an empty event which we added our logic afterwards.

        private void Skype4COMHelp_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("https://developer.skype.com/Docs/Skype4COM");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - Skype4COMHelp_LinkClicked: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // Skype4COM Documentation Context Menu Item was clicked on.

        private void skype4COMDocumentationToolStripMenuItem_Click(object sender, EventArgs e)
        {
            // We could be offline and have no internet connection or browser defined
            // on this system.
            try
            {
                System.Diagnostics.Process.Start("https://developer.skype.com/Docs/Skype4COM");
            }
            catch (Exception ee)
            {
                // Could have no Internet connection, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - skype4COMDocumentationToolStripMenuItem_Click: Check to see if you are connected to the Internet" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // Allows this program to automatically stop when it senses that the Skype client stopped.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void SkypeStop_CheckedChanged(object sender, EventArgs e)
        {
            // NOTE: Currently it is almost impossible to determine if the Skype client
            //       has been stopped or the user logged off using Skype4COM. Because
            //       of this for the moment 2 things have been done, some logic has
            //       been inserted in the Attachment, User and Reply event handlers
            //       yet it currently is impossible to distingush if the User has
            //       logged off or if the Skype client has been stopped. Because of this
            //       both the exit on User Logoff and the Exit of Skype client stop will
            //       be set to checked or unchecked when the other is changed.

            // Force this Custom event to fire as well for now.
            this.UserLogoff.Checked = this.SkypeStop.Checked;

            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.ExitOnSkypeStop = this.SkypeStop.Checked;

            // Write User Skype Stop Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - SkypeStop_CheckedChanged: " + this.SkypeStop.Checked +
             "\r\n");
        }

        // Will Start Skype minimized if this program starts Skype and the Skype client is
        // set to auto-logon, otherwise the Skype client must display so that the user can
        // enter their Skype name and password.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void StartMinimized_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.StartSkypeMinimized = this.StartMinimized.Checked;

            // Write User Start Minimized Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - StartMinimized_CheckedChanged: " + this.StartMinimized.Checked +
             "\r\n");
        }

        // Will Start Skype without the Splash Screen if this program starts Skype.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void StartNoSplash_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.StartSkypeNosplash = this.StartNoSplash.Checked;

            // Write User Start No Splash Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - StartNoSplash_CheckedChanged: " + this.StartNoSplash.Checked +
             "\r\n");
        }

        // Will start Skype if Skype is not already started.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void StartSkype_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.StartSkypeIfNeeded = this.StartSkype.Checked;

            // Write User Start Skype Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - StartSkype_CheckedChanged: " + this.StartSkype.Checked +
             "\r\n");

            // Always use try/catch with ANY Skype calls.
            try
            {
                // If Skype is NOT running and we are supposed to start Skype, Start Skype.
                if ((!skype.Client.IsRunning) && (this.StartSkype.Checked))
                {
                    // Always use try/catch with ANY Skype calls.
                    try
                    {
                        // Start Skype with the values of two of our other check boxes.
                        skype.Client.Start(this.StartMinimized.Checked, this.StartNoSplash.Checked);

                        // Write Starting Skype to Window.
                        AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                         " Our Code - Starting Skype" +
                         "\r\n");
                    }
                    catch (Exception ee)
                    {
                        // Present a Message Box So the Skype User knows to look for web page.
                        MessageBox.Show("You need to download and install Skype, an attempt will be made to open a web page to do this now. Please connect to the Internet if needed and refresh the page if you have problems.");

                        // log an error to the SEHEwc1 window.
                        AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                         " Our Code - You Need To Download Skype - Opening Web Page For You To Download Skype - Will Wait for Skype to Start" +
                         " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                         "\r\n");

                        try
                        {
                            // Open a browser window to Download the Skype client.
                            System.Diagnostics.Process.Start("http://www.anrdoezrs.net/click-3140383-10420859?url=http%3A%2F%2Fwww.skype.com%2Fdownload%2Fskype%2Fwindows%2F%2F%3Fcm_mmc%3Daffiliate%2D%5F%2Dcommission%5Fjunction%2D%5F%2Dlink%2D%5F%2Dbuilder");
                        }
                        catch (Exception eee)
                        {
                            // Could have no Internet connection, log an error, drop into debug if needed.
                            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                             " Our Code - Unable To Open Download Page for Skype: Check to see if you are connected to the Internet" +
                             " - Exception Source: " + eee.Source + " - Exception Message: " + eee.Message +
                             "\r\n");

                            // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                            Debug.Assert(!this.UseAutoDebug.Checked);
                        }
                    }
                }
            }
            catch (Exception ee)
            {
                // Could be old Skype4COM version, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - Unable To Check if Skype is running - Will Wait for Skype to Start" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }

        // When the UseAutoDebug check box is checked it will offer you to drop into
        // Debug, Abort or Continue. When the UseAutoDebug check box is not checked
        // only an error message is placed in the text box that the error has taken
        // place. 

        // I call this logic "Auto-Debug" because it can invoke the debugger 
        // dynamically, with no need to set a breakpoint, and left in place and set
        // to false when the application is released to to the public.

        // This is very useful if you need to check the current value of any variables
        // when logic fails, and any code you add for testing can also add the same logic
        // so that you can cut both development and testing time substantially. 

        // I cannot stress enough how important it is to never assume that a Skype4COM lib
        // request will always complete, so when UseAutoDebug is set to true any problems
        // will be seen during testing. One can always set this value to false when the code
        // is released to the public so that it remains in place for future version testing.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void UseAutoDebug_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.AutoDebugOn = this.UseAutoDebug.Checked;

            // Write Use Auto Debug Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - UseAutoDebug_CheckedChanged: " + this.UseAutoDebug.Checked +
             "\r\n");
        }

        // Will send API commands blocked if checked.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void UseBlocking_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.Blocking = this.UseBlocking.Checked;

            // Write Use Blocking Checked Changed.
            AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - UseBlocking_CheckedChanged: " + this.UseBlocking.Checked +
             "\r\n");
        }

        // Will use a Command Id if checked starting at 10,000 or always 0 if not checked.
        // Note: This will be bumped by 1 the first time so will always be zero or 10,000
        // first time. Starting the number at 10,000 when used will make it easy to see that
        // this program created the command vs the Skype client or Skype4COM.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void UseCommandId_CheckedChanged(object sender, EventArgs e)
        {
            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.CommandId = this.UseCommandId.Checked;

            // Set our Command Id 1 less because it will be bumped at least once.
            if (this.UseCommandId.Checked)
                command.Id = 9999;
            else
                command.Id = -1;

            // Write Use Command Id Checked Changed.
            AddTextToTextBox2(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - UseCommandId_CheckedChanged: " + this.UseCommandId.Checked +
             " - Command Id Reset To: " + (command.Id + 1) +
             "\r\n");
        }

        // Will Stop this program if the Skype User Logs Off.

        // An Event was set to invoke this in the form designer by double clicking
        // the Check Box which created an empty event which we added our logic afterwards.

        private void UserLogoff_CheckedChanged(object sender, EventArgs e)
        {
            // NOTE: Currently it is almost impossible to determine if the Skype client
            //       has been stopped or the user logged off using Skype4COM. Because
            //       of this for the moment 2 things have been done, some logic has
            //       been inserted in the Attachment, User and Reply event handlers
            //       yet it currently is impossible to distingush if the User has
            //       logged off or if the Skype client has been stopped. Because of this
            //       both the exit on User Logoff and the Exit of Skype client stop will
            //       be set to checked or unchecked when the other is changed.

            // Force this Custom event to fire as well for now.
            this.SkypeStop.Checked = this.UserLogoff.Checked;

            // Load these setting on a per Windows User for next time we run. ByeBye will save them.
            Properties.Settings.Default.ExitOnUserLogoff = this.UserLogoff.Checked;

            // Write User Logoff Checked Changed.
            AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
             " Our Code - UserLogoff_CheckedChanged: " + this.UserLogoff.Checked +
             "\r\n");
        }

        // Program Entry Point - This is where we start.

        // We added a line Under Form1.Designer.cs to invoke this:
        // this.Load += new System.EventHandler(this.SEHEwc1_TheNotifyIconExample_Initialize);
        public void SEHEwc1_TheNotifyIconExample_Initialize(object sender, System.EventArgs e)
        {
            // Look at Form1.Designer.cs under InitializeComponent()
            // where added to invoke this at load/run time was added:
            // this.Load += new System.EventHandler(this.TheUberOverLord_Initialize);

            // Set All Check Boxes to their last values
            // See Project Properties Settings
            // Write Header text as well.

            // Setup how we initially use the Taskbar and NotifyIcon and add our
            // Form1 Resize Event Handler After we haev completed our Initial Display
            // Logic, doing it before that will cause logic problems.

            // Make sure that standard and standard double clicks are enabled,
            // if they are not enabled, enable them. This really is OverKill but better to be
            // safe than sorry.
            if (!this.GetStyle(ControlStyles.StandardClick))
                this.SetStyle(ControlStyles.StandardClick, true);

            if (!this.GetStyle(ControlStyles.StandardDoubleClick))
                this.SetStyle(ControlStyles.StandardDoubleClick, true);

            // Initialize both ContextMenuStrips for NotifyIcon and Form1.
            // Form1 as being Empty, to avoid any problems later with null values.

            // We need to play some games with the Form1 assigned ContextMenuStrip. 
            // We need to assign it on the fly, and make it Empty afterwards because we lose
            // Form1 MouseClick events if we let a ContextMenuStrip stay assigned. Also, 
            // we can't leave it as a null because we use "if" logic on if it is visible,
            // which still works if it is Empty, but NOT if it is null and not assigned to
            // something, so we need to make it Empty 
            // this.ContextMenuStrip = new ContextMenuStrip(); so that we do not generate a
            // null exception when we query if it is visible or not in 
            // TheNotifyIconExample_MouseClick(); This is a great example showing
            // what can happen when things are not initialized, and how they can cause you
            // problems later on in your code under the right conditions, like checking if the
            // Form1 ContextMenuStrip is visible, this would build fine but create a null
            // exception later.
            this.ContextMenuStrip = new ContextMenuStrip();

            // We can share this same this.contextMenuStrip1; on the fly, later with Form1.
            // See the TheNotifyIconExample_MouseClick(); and 
            // TheNotifyIconExample__MouseDoubleClick(); event handlers for how and when.

            // Any changes to the ContextMenuStrips can be easily done using the Visual Studio
            // designer. this.TheNotifyIconExample_contextMenuStrip1; is the normal shared
            // contextMenuStrip and TheNotifyIconExample_contextMenuStrip2; is used as the
            // different shared ContextMenuStrip and menu items can easily be added or deleted
            // using the Visual Studio Designer to both of these ContextMenuStrips. 
            this.TheNotifyIconExample_NotifyIcon.ContextMenuStrip = this.TheNotifyIconExample_contextMenuStrip1;

            // All of our Mouse event handlers for Form1 and NotifyIcon are shared
            // to save code and space. It just is not possible to share single and double
            // click Mouse event handlers, otherwise we would have done that as well.

            // Form1 event handlers. Also See the Form1 Resize event below which needs to be
            // set later. Notice how these Mouse Events share the same event handler with
            // TheNotifyIconExample_NotifyIcon; below.
            this.MouseClick += new System.Windows.Forms.MouseEventHandler(this.TheNotifyIconExample_MouseClick);
            this.MouseDoubleClick += new System.Windows.Forms.MouseEventHandler(this.TheNotifyIconExample_MouseDoubleClick);
            this.MouseDown += new System.Windows.Forms.MouseEventHandler(this.TheNotifyIconExample_MouseDown);

            // TheNotifyIconExample_NotifyIcon; event handlers.
            this.TheNotifyIconExample_NotifyIcon.MouseClick += new System.Windows.Forms.MouseEventHandler(this.TheNotifyIconExample_MouseClick);
            this.TheNotifyIconExample_NotifyIcon.MouseDoubleClick += new System.Windows.Forms.MouseEventHandler(this.TheNotifyIconExample_MouseDoubleClick);
            this.TheNotifyIconExample_NotifyIcon.MouseDown += new System.Windows.Forms.MouseEventHandler(this.TheNotifyIconExample_MouseDown);

            // this.TheNotifyIconExample_contextMenuStrip1.Opening; is used to trap a single
            // right MouseClick on TheNotifyIconExample_NotifyIcon; and stop the normal
            // ContextMenuStrip from being displayed if the Project User Settings are set to
            // disable single right MouseClicks on NotifyIcon.
            this.TheNotifyIconExample_contextMenuStrip1.Opening += new System.ComponentModel.CancelEventHandler(this.TheNotifyIconExample_contextMenuStrip1_Opening);

            // contextMenuStrip1 item event handlers we need and use. See Form1.Designer.cs
            this.aPIDocumentationToolStripMenuItem.Click += new System.EventHandler(this.aPIDocumentationToolStripMenuItem_Click);
            this.closeThisMenuToolStripMenuItem.Click += new System.EventHandler(this.closeThisMenuToolStripMenuItem_Click);
            this.devZoneToolStripMenuItem.Click += new System.EventHandler(this.devZoneToolStripMenuItem_Click);
            this.donateToolStripMenuItem.Click += new System.EventHandler(this.donateToolStripMenuItem_Click);
            this.exitToolStripMenuItem.Click += new System.EventHandler(this.exitToolStripMenuItem_Click);
            this.getLatestBetaSkypeVersionToolStripMenuItem.Click += new System.EventHandler(this.getLatestBetaSkypeVersionToolStripMenuItem_Click);
            this.getLatestBusinessSkypeVersionToolStripMenuItem.Click += new System.EventHandler(this.getLatestBusinessSkypeVersionToolStripMenuItem_Click);
            this.getLatestSkypeVersionToolStripMenuItem.Click += new System.EventHandler(this.getLatestSkypeVersionToolStripMenuItem_Click);
            this.helpForThisProgramToolStripMenuItem.Click += new System.EventHandler(this.helpForThisProgramToolStripMenuItem_Click);
            this.minimizeToolStripMenuItem.Click += new System.EventHandler(this.minimizeToolStripMenuItem_Click);
            this.saveOnTelephoneBillscomToolStripMenuItem.Click += new System.EventHandler(this.saveOnTelephoneBillscomToolStripMenuItem_Click);
            this.skype4COMDocumentationToolStripMenuItem.Click += new System.EventHandler(this.skype4COMDocumentationToolStripMenuItem_Click);

            // contextMenuStrip2 item event handler
            this.closeThisMenuToolStripMenuItem1.Click += new System.EventHandler(this.closeThisMenuToolStripMenuItem_Click);

            // Our Taskbar and NotifyIcon minimize or normal display startup
            // logic for Form1.
            this.TheNotifyIconExample_Initial_Display_Logic();

            // We are single threaded and this is the easiest method for us not to create
            // any Form1 lag problems. Sleazy or not, it works :P
            System.Windows.Forms.Application.DoEvents();

            // Form1 Resize event handler. 
            // NOTE: Must be after our intital display logic
            // otherwise if before, will cause logic problems.
            this.Resize += new System.EventHandler(this.TheNotifyIconExample_Form1_Resize);

            // Write our Copyright info - **** Do NOT remove ****
            this.textBox1.AppendText(DateTime.Now.ToLocalTime() + ": ");
            this.textBox1.AppendText(" Our Code - SEHEwc1 1.0.31.0 Copyright By Don Kennedy aka TheUberOverLord@gmail.com");
            this.textBox1.AppendText(" - Tested with Skype4COM Lib version 1.0.31.0 Skype Windows client 3.8.0.188 Standard Version  3.8.32.188 - Business Version - 4.0.0.169 Beta Version ");
            this.textBox1.AppendText(Environment.NewLine);
            this.textBox1.ScrollToCaret();

            // Write TheUberOverLord Initialize.
            this.textBox1.AppendText(DateTime.Now.ToLocalTime() + ": ");
            this.textBox1.AppendText(" Our Code - TheUberOverLord_Initialize: Main Logic");
            this.textBox1.AppendText(Environment.NewLine);
            this.textBox1.ScrollToCaret();

            // Write TheUberOverLord Initialize.
            this.textBox1.AppendText(DateTime.Now.ToLocalTime() + ": ");
            this.textBox1.AppendText(" Our Code - FirstTime: " + Properties.Settings.Default.FirstTime);
            this.textBox1.AppendText(Environment.NewLine);
            this.textBox1.ScrollToCaret();

            // Set these Check Boxes right away from our saved user project settings.
            this.AutoScrollOn.Checked = Properties.Settings.Default.AutoScroll;
            this.RetryCommandTimeouts.Checked = Properties.Settings.Default.RetryCommandTimeOut;
            this.SaveText.Checked = Properties.Settings.Default.SaveTheText;
            this.UseCommandId.Checked = Properties.Settings.Default.CommandId;
            this.UseBlocking.Checked = Properties.Settings.Default.Blocking;
            this.HideAPIWindow.Checked = Properties.Settings.Default.HideAPI;
            this.UseAutoDebug.Checked = Properties.Settings.Default.AutoDebugOn;
            this.FirstTimeAlwaysTrue.Checked = Properties.Settings.Default.AlwaysFirstTime;
            this.NonWaitedAttachRequests.Checked = Properties.Settings.Default.AlwaysNonWaitedAttach;

            // Load the Command Strings. They will be empty if save text check box is unchecked.
            this.CommandText.Text = Properties.Settings.Default.SavedCommandText;
            this.ExpectedText.Text = Properties.Settings.Default.SavedExpectedText;

            // Set these Check Boxes from our saved user project settings.
            this.UserLogoff.Checked = Properties.Settings.Default.ExitOnUserLogoff;
            this.SkypeStop.Checked = Properties.Settings.Default.ExitOnSkypeStop;
            this.StartMinimized.Checked = Properties.Settings.Default.StartSkypeMinimized;
            this.StartNoSplash.Checked = Properties.Settings.Default.StartSkypeNosplash;
            this.StartSkype.Checked = Properties.Settings.Default.StartSkypeIfNeeded;
            this.EnableSilentMode.Checked = Properties.Settings.Default.SetSilentModeOn;

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Is the Skype client running, if not and we are not supposed to start it
                // tell the user that they need to start Skype, otherwise if we are going
                // start the Skype Client because that Check Box is checked, don't worry.

                if ((!skype.Client.IsRunning) && (!this.StartSkype.Checked))
                {
                    // Write to Window that Skype needs to be started.
                    AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                     " Our Code *** Please Start Skype Now ***" +
                     "\r\n");
                }
            }
            catch (Exception ee)
            {
                // Could be old Skype4COM version, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - Unable To Check if Skype is running, Please stop/start this program" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }

            // Always use try/catch with ANY Skype calls.
            try
            {
                // Send a non-waited Attachment request.
                // Bug Current Protocol is 8 Not 7 so we will force 8 instead of getting it from Skype4COM.
                // skype.Attach(skype.Protocol, false);
                skype.Attach(9, false);

                // Write that we are sending a Attachment Request to Skype Non-Waited to Window.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - Skype Attachment Request Non-Waited Sent" +
                 "\r\n");
            }
            catch (Exception ee)
            {
                // Skype might not be installed, log an error, drop into debug if needed.
                AddTextToTextBox1(DateTime.Now.ToLocalTime() + ": " +
                 " Our Code - Unable To Do Non-Waited Attach To Skype - Waiting for API Available" +
                 " - Exception Source: " + ee.Source + " - Exception Message: " + ee.Message +
                 "\r\n");

                // If the "Use Auto Debug" check box is checked and we are in debug, drop into debug here when retry, otherwise, prompt for action.
                Debug.Assert(!this.UseAutoDebug.Checked);
            }
        }
    }
}