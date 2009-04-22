namespace SEHEwc1
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.UserLogoff = new System.Windows.Forms.CheckBox();
            this.SkypeStop = new System.Windows.Forms.CheckBox();
            this.StartSkype = new System.Windows.Forms.CheckBox();
            this.EnableSilentMode = new System.Windows.Forms.CheckBox();
            this.StartMinimized = new System.Windows.Forms.CheckBox();
            this.HideAPIWindow = new System.Windows.Forms.CheckBox();
            this.StartNoSplash = new System.Windows.Forms.CheckBox();
            this.AutoScrollOn = new System.Windows.Forms.CheckBox();
            this.ClickForDetails = new System.Windows.Forms.LinkLabel();
            this.FirstTimeAlwaysTrue = new System.Windows.Forms.CheckBox();
            this.NonWaitedAttachRequests = new System.Windows.Forms.CheckBox();
            this.UseAutoDebug = new System.Windows.Forms.CheckBox();
            this.CommandText = new System.Windows.Forms.TextBox();
            this.CommandTextLabel = new System.Windows.Forms.Label();
            this.UseBlocking = new System.Windows.Forms.CheckBox();
            this.UseCommandId = new System.Windows.Forms.CheckBox();
            this.ExpectedText = new System.Windows.Forms.TextBox();
            this.ExpectedTextLabel = new System.Windows.Forms.Label();
            this.SaveText = new System.Windows.Forms.CheckBox();
            this.RetryCommandTimeouts = new System.Windows.Forms.CheckBox();
            this.Skype4COMHelp = new System.Windows.Forms.LinkLabel();
            this.APIHelp = new System.Windows.Forms.LinkLabel();
            this.DevZoneHelp = new System.Windows.Forms.LinkLabel();
            this.SaveOnTelephoneBills = new System.Windows.Forms.LinkLabel();
            this.Donate = new System.Windows.Forms.LinkLabel();
            this.TheNotifyIconExample_NotifyIcon = new System.Windows.Forms.NotifyIcon(this.components);
            this.TheNotifyIconExample_contextMenuStrip1 = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.exitToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.helpForThisProgramToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.getLatestBusinessSkypeVersionToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.getLatestSkypeVersionToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.getLatestBetaSkypeVersionToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.devZoneToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.skype4COMDocumentationToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.aPIDocumentationToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.saveOnTelephoneBillscomToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.donateToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.minimizeToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.closeThisMenuToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.TheNotifyIconExample_contextMenuStrip2 = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.differentContextMenuExampleToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.closeThisMenuToolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.MSDN = new System.Windows.Forms.LinkLabel();
            this.TheNotifyIconExample_contextMenuStrip1.SuspendLayout();
            this.TheNotifyIconExample_contextMenuStrip2.SuspendLayout();
            this.SuspendLayout();
            // 
            // textBox1
            // 
            this.textBox1.BackColor = System.Drawing.Color.White;
            this.textBox1.Location = new System.Drawing.Point(12, 23);
            this.textBox1.Multiline = true;
            this.textBox1.Name = "textBox1";
            this.textBox1.ReadOnly = true;
            this.textBox1.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.textBox1.Size = new System.Drawing.Size(530, 193);
            this.textBox1.TabIndex = 0;
            this.textBox1.WordWrap = false;
            // 
            // textBox2
            // 
            this.textBox2.BackColor = System.Drawing.Color.White;
            this.textBox2.Location = new System.Drawing.Point(12, 399);
            this.textBox2.Multiline = true;
            this.textBox2.Name = "textBox2";
            this.textBox2.ReadOnly = true;
            this.textBox2.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.textBox2.Size = new System.Drawing.Size(530, 193);
            this.textBox2.TabIndex = 1;
            this.textBox2.WordWrap = false;
            // 
            // UserLogoff
            // 
            this.UserLogoff.AutoSize = true;
            this.UserLogoff.Location = new System.Drawing.Point(12, 222);
            this.UserLogoff.Name = "UserLogoff";
            this.UserLogoff.Size = new System.Drawing.Size(118, 17);
            this.UserLogoff.TabIndex = 2;
            this.UserLogoff.Text = "Exit On User Logoff";
            this.UserLogoff.UseVisualStyleBackColor = true;
            this.UserLogoff.CheckedChanged += new System.EventHandler(this.UserLogoff_CheckedChanged);
            // 
            // SkypeStop
            // 
            this.SkypeStop.AutoSize = true;
            this.SkypeStop.Location = new System.Drawing.Point(12, 245);
            this.SkypeStop.Name = "SkypeStop";
            this.SkypeStop.Size = new System.Drawing.Size(118, 17);
            this.SkypeStop.TabIndex = 3;
            this.SkypeStop.Text = "Exit On Skype Stop";
            this.SkypeStop.UseVisualStyleBackColor = true;
            this.SkypeStop.CheckedChanged += new System.EventHandler(this.SkypeStop_CheckedChanged);
            // 
            // StartSkype
            // 
            this.StartSkype.AutoSize = true;
            this.StartSkype.Location = new System.Drawing.Point(136, 222);
            this.StartSkype.Name = "StartSkype";
            this.StartSkype.Size = new System.Drawing.Size(131, 17);
            this.StartSkype.TabIndex = 4;
            this.StartSkype.Text = "Start Skype If Needed";
            this.StartSkype.UseVisualStyleBackColor = true;
            this.StartSkype.CheckedChanged += new System.EventHandler(this.StartSkype_CheckedChanged);
            // 
            // EnableSilentMode
            // 
            this.EnableSilentMode.AutoSize = true;
            this.EnableSilentMode.Location = new System.Drawing.Point(136, 245);
            this.EnableSilentMode.Name = "EnableSilentMode";
            this.EnableSilentMode.Size = new System.Drawing.Size(118, 17);
            this.EnableSilentMode.TabIndex = 5;
            this.EnableSilentMode.Text = "Enable Silent Mode";
            this.EnableSilentMode.UseVisualStyleBackColor = true;
            this.EnableSilentMode.CheckedChanged += new System.EventHandler(this.EnableSilentMode_CheckedChanged);
            // 
            // StartMinimized
            // 
            this.StartMinimized.AutoSize = true;
            this.StartMinimized.Location = new System.Drawing.Point(274, 222);
            this.StartMinimized.Name = "StartMinimized";
            this.StartMinimized.Size = new System.Drawing.Size(97, 17);
            this.StartMinimized.TabIndex = 6;
            this.StartMinimized.Text = "Start Minimized";
            this.StartMinimized.UseVisualStyleBackColor = true;
            this.StartMinimized.CheckedChanged += new System.EventHandler(this.StartMinimized_CheckedChanged);
            // 
            // HideAPIWindow
            // 
            this.HideAPIWindow.AutoSize = true;
            this.HideAPIWindow.Location = new System.Drawing.Point(274, 245);
            this.HideAPIWindow.Name = "HideAPIWindow";
            this.HideAPIWindow.Size = new System.Drawing.Size(110, 17);
            this.HideAPIWindow.TabIndex = 7;
            this.HideAPIWindow.Text = "Hide API Window";
            this.HideAPIWindow.UseVisualStyleBackColor = true;
            this.HideAPIWindow.CheckedChanged += new System.EventHandler(this.HideAPIWindow_CheckedChanged);
            // 
            // StartNoSplash
            // 
            this.StartNoSplash.AutoSize = true;
            this.StartNoSplash.Location = new System.Drawing.Point(400, 222);
            this.StartNoSplash.Name = "StartNoSplash";
            this.StartNoSplash.Size = new System.Drawing.Size(100, 17);
            this.StartNoSplash.TabIndex = 8;
            this.StartNoSplash.Text = "Start No Splash";
            this.StartNoSplash.UseVisualStyleBackColor = true;
            this.StartNoSplash.CheckedChanged += new System.EventHandler(this.StartNoSplash_CheckedChanged);
            // 
            // AutoScrollOn
            // 
            this.AutoScrollOn.AutoSize = true;
            this.AutoScrollOn.Location = new System.Drawing.Point(400, 245);
            this.AutoScrollOn.Name = "AutoScrollOn";
            this.AutoScrollOn.Size = new System.Drawing.Size(81, 17);
            this.AutoScrollOn.TabIndex = 9;
            this.AutoScrollOn.Text = "Logging On";
            this.AutoScrollOn.UseVisualStyleBackColor = true;
            this.AutoScrollOn.CheckedChanged += new System.EventHandler(this.AutoScrollOn_CheckedChanged);
            // 
            // ClickForDetails
            // 
            this.ClickForDetails.AutoSize = true;
            this.ClickForDetails.Location = new System.Drawing.Point(17, 6);
            this.ClickForDetails.Name = "ClickForDetails";
            this.ClickForDetails.Size = new System.Drawing.Size(163, 13);
            this.ClickForDetails.TabIndex = 10;
            this.ClickForDetails.TabStop = true;
            this.ClickForDetails.Text = "Click For Help With This Program";
            this.ClickForDetails.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.ClickForDetails_LinkClicked);
            // 
            // FirstTimeAlwaysTrue
            // 
            this.FirstTimeAlwaysTrue.AutoSize = true;
            this.FirstTimeAlwaysTrue.Location = new System.Drawing.Point(12, 268);
            this.FirstTimeAlwaysTrue.Name = "FirstTimeAlwaysTrue";
            this.FirstTimeAlwaysTrue.Size = new System.Drawing.Size(177, 17);
            this.FirstTimeAlwaysTrue.TabIndex = 11;
            this.FirstTimeAlwaysTrue.Text = "Always Start as FirstTime = True";
            this.FirstTimeAlwaysTrue.UseVisualStyleBackColor = true;
            this.FirstTimeAlwaysTrue.CheckedChanged += new System.EventHandler(this.FirstTimeAlwaysTrue_CheckedChanged);
            // 
            // NonWaitedAttachRequests
            // 
            this.NonWaitedAttachRequests.AutoSize = true;
            this.NonWaitedAttachRequests.Location = new System.Drawing.Point(308, 268);
            this.NonWaitedAttachRequests.Name = "NonWaitedAttachRequests";
            this.NonWaitedAttachRequests.Size = new System.Drawing.Size(218, 17);
            this.NonWaitedAttachRequests.TabIndex = 12;
            this.NonWaitedAttachRequests.Text = "Always Use Non-Waited Attach Request";
            this.NonWaitedAttachRequests.UseVisualStyleBackColor = true;
            this.NonWaitedAttachRequests.CheckedChanged += new System.EventHandler(this.NonWaitedAttachRequests_CheckedChanged);
            // 
            // UseAutoDebug
            // 
            this.UseAutoDebug.AutoSize = true;
            this.UseAutoDebug.Location = new System.Drawing.Point(195, 268);
            this.UseAutoDebug.Name = "UseAutoDebug";
            this.UseAutoDebug.Size = new System.Drawing.Size(105, 17);
            this.UseAutoDebug.TabIndex = 13;
            this.UseAutoDebug.Text = "Use Auto Debug";
            this.UseAutoDebug.UseVisualStyleBackColor = true;
            this.UseAutoDebug.CheckedChanged += new System.EventHandler(this.UseAutoDebug_CheckedChanged);
            // 
            // CommandText
            // 
            this.CommandText.BackColor = System.Drawing.Color.White;
            this.CommandText.Location = new System.Drawing.Point(105, 347);
            this.CommandText.Name = "CommandText";
            this.CommandText.Size = new System.Drawing.Size(437, 20);
            this.CommandText.TabIndex = 14;
            this.CommandText.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.CommandText_KeyPress);
            // 
            // CommandTextLabel
            // 
            this.CommandTextLabel.AutoSize = true;
            this.CommandTextLabel.Location = new System.Drawing.Point(14, 350);
            this.CommandTextLabel.Name = "CommandTextLabel";
            this.CommandTextLabel.Size = new System.Drawing.Size(81, 13);
            this.CommandTextLabel.TabIndex = 15;
            this.CommandTextLabel.Text = "Command Text:";
            // 
            // UseBlocking
            // 
            this.UseBlocking.AutoSize = true;
            this.UseBlocking.Location = new System.Drawing.Point(12, 319);
            this.UseBlocking.Name = "UseBlocking";
            this.UseBlocking.Size = new System.Drawing.Size(89, 17);
            this.UseBlocking.TabIndex = 16;
            this.UseBlocking.Text = "Use Blocking";
            this.UseBlocking.UseVisualStyleBackColor = true;
            this.UseBlocking.CheckedChanged += new System.EventHandler(this.UseBlocking_CheckedChanged);
            // 
            // UseCommandId
            // 
            this.UseCommandId.AutoSize = true;
            this.UseCommandId.Location = new System.Drawing.Point(105, 319);
            this.UseCommandId.Name = "UseCommandId";
            this.UseCommandId.Size = new System.Drawing.Size(107, 17);
            this.UseCommandId.TabIndex = 17;
            this.UseCommandId.Text = "Use Command Id";
            this.UseCommandId.UseVisualStyleBackColor = true;
            this.UseCommandId.CheckedChanged += new System.EventHandler(this.UseCommandId_CheckedChanged);
            // 
            // ExpectedText
            // 
            this.ExpectedText.BackColor = System.Drawing.Color.White;
            this.ExpectedText.Location = new System.Drawing.Point(105, 373);
            this.ExpectedText.Name = "ExpectedText";
            this.ExpectedText.Size = new System.Drawing.Size(437, 20);
            this.ExpectedText.TabIndex = 18;
            this.ExpectedText.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.ExpectedText_KeyPress);
            // 
            // ExpectedTextLabel
            // 
            this.ExpectedTextLabel.AutoSize = true;
            this.ExpectedTextLabel.Location = new System.Drawing.Point(14, 376);
            this.ExpectedTextLabel.Name = "ExpectedTextLabel";
            this.ExpectedTextLabel.Size = new System.Drawing.Size(79, 13);
            this.ExpectedTextLabel.TabIndex = 19;
            this.ExpectedTextLabel.Text = "Expected Text:";
            // 
            // SaveText
            // 
            this.SaveText.AutoSize = true;
            this.SaveText.Location = new System.Drawing.Point(218, 319);
            this.SaveText.Name = "SaveText";
            this.SaveText.Size = new System.Drawing.Size(75, 17);
            this.SaveText.TabIndex = 20;
            this.SaveText.Text = "Save Text";
            this.SaveText.UseVisualStyleBackColor = true;
            this.SaveText.CheckedChanged += new System.EventHandler(this.SaveText_CheckedChanged);
            // 
            // RetryCommandTimeouts
            // 
            this.RetryCommandTimeouts.AutoSize = true;
            this.RetryCommandTimeouts.Location = new System.Drawing.Point(308, 319);
            this.RetryCommandTimeouts.Name = "RetryCommandTimeouts";
            this.RetryCommandTimeouts.Size = new System.Drawing.Size(147, 17);
            this.RetryCommandTimeouts.TabIndex = 21;
            this.RetryCommandTimeouts.Text = "Retry Command Timeouts";
            this.RetryCommandTimeouts.UseVisualStyleBackColor = true;
            this.RetryCommandTimeouts.CheckedChanged += new System.EventHandler(this.RetryCommandTimeouts_CheckedChanged);
            // 
            // Skype4COMHelp
            // 
            this.Skype4COMHelp.AutoSize = true;
            this.Skype4COMHelp.Location = new System.Drawing.Point(310, 6);
            this.Skype4COMHelp.Name = "Skype4COMHelp";
            this.Skype4COMHelp.Size = new System.Drawing.Size(133, 13);
            this.Skype4COMHelp.TabIndex = 22;
            this.Skype4COMHelp.TabStop = true;
            this.Skype4COMHelp.Text = "Click for Skype4COM Help";
            this.Skype4COMHelp.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.Skype4COMHelp_LinkClicked);
            // 
            // APIHelp
            // 
            this.APIHelp.AutoSize = true;
            this.APIHelp.Location = new System.Drawing.Point(446, 6);
            this.APIHelp.Name = "APIHelp";
            this.APIHelp.Size = new System.Drawing.Size(90, 13);
            this.APIHelp.TabIndex = 23;
            this.APIHelp.TabStop = true;
            this.APIHelp.Text = "Click for API Help";
            this.APIHelp.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.APIHelp_LinkClicked);
            // 
            // DevZoneHelp
            // 
            this.DevZoneHelp.AutoSize = true;
            this.DevZoneHelp.Location = new System.Drawing.Point(184, 6);
            this.DevZoneHelp.Name = "DevZoneHelp";
            this.DevZoneHelp.Size = new System.Drawing.Size(121, 13);
            this.DevZoneHelp.TabIndex = 24;
            this.DevZoneHelp.TabStop = true;
            this.DevZoneHelp.Text = "Click For DevZone Help";
            this.DevZoneHelp.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.DevZoneHelp_LinkClicked);
            // 
            // SaveOnTelephoneBills
            // 
            this.SaveOnTelephoneBills.AutoSize = true;
            this.SaveOnTelephoneBills.Location = new System.Drawing.Point(30, 288);
            this.SaveOnTelephoneBills.Name = "SaveOnTelephoneBills";
            this.SaveOnTelephoneBills.Size = new System.Drawing.Size(182, 13);
            this.SaveOnTelephoneBills.TabIndex = 25;
            this.SaveOnTelephoneBills.TabStop = true;
            this.SaveOnTelephoneBills.Text = "Click For SaveOnTelephoneBills.com";
            this.SaveOnTelephoneBills.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.SaveOnTelephoneBills_LinkClicked);
            // 
            // Donate
            // 
            this.Donate.AutoSize = true;
            this.Donate.Location = new System.Drawing.Point(432, 288);
            this.Donate.Name = "Donate";
            this.Donate.Size = new System.Drawing.Size(84, 13);
            this.Donate.TabIndex = 26;
            this.Donate.TabStop = true;
            this.Donate.Text = "Click To Donate";
            this.Donate.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.Donate_LinkClicked);
            // 
            // TheNotifyIconExample_NotifyIcon
            // 
            this.TheNotifyIconExample_NotifyIcon.ContextMenuStrip = this.TheNotifyIconExample_contextMenuStrip1;
            this.TheNotifyIconExample_NotifyIcon.Icon = ((System.Drawing.Icon)(resources.GetObject("TheNotifyIconExample_NotifyIcon.Icon")));
            this.TheNotifyIconExample_NotifyIcon.Text = "Single Left Click For The SEHEwc1 For Skype Window";
            this.TheNotifyIconExample_NotifyIcon.Visible = true;
            // 
            // TheNotifyIconExample_contextMenuStrip1
            // 
            this.TheNotifyIconExample_contextMenuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.exitToolStripMenuItem,
            this.helpForThisProgramToolStripMenuItem,
            this.getLatestBusinessSkypeVersionToolStripMenuItem,
            this.getLatestSkypeVersionToolStripMenuItem,
            this.getLatestBetaSkypeVersionToolStripMenuItem,
            this.devZoneToolStripMenuItem,
            this.skype4COMDocumentationToolStripMenuItem,
            this.aPIDocumentationToolStripMenuItem,
            this.saveOnTelephoneBillscomToolStripMenuItem,
            this.donateToolStripMenuItem,
            this.minimizeToolStripMenuItem,
            this.closeThisMenuToolStripMenuItem});
            this.TheNotifyIconExample_contextMenuStrip1.Name = "contextMenuStrip1";
            this.TheNotifyIconExample_contextMenuStrip1.Size = new System.Drawing.Size(250, 268);
            // 
            // exitToolStripMenuItem
            // 
            this.exitToolStripMenuItem.Name = "exitToolStripMenuItem";
            this.exitToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.exitToolStripMenuItem.Text = "Exit";
            // 
            // helpForThisProgramToolStripMenuItem
            // 
            this.helpForThisProgramToolStripMenuItem.Name = "helpForThisProgramToolStripMenuItem";
            this.helpForThisProgramToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.helpForThisProgramToolStripMenuItem.Text = "Help For This Program";
            // 
            // getLatestBusinessSkypeVersionToolStripMenuItem
            // 
            this.getLatestBusinessSkypeVersionToolStripMenuItem.Name = "getLatestBusinessSkypeVersionToolStripMenuItem";
            this.getLatestBusinessSkypeVersionToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.getLatestBusinessSkypeVersionToolStripMenuItem.Text = "Get Latest Business Skype Version";
            // 
            // getLatestSkypeVersionToolStripMenuItem
            // 
            this.getLatestSkypeVersionToolStripMenuItem.Name = "getLatestSkypeVersionToolStripMenuItem";
            this.getLatestSkypeVersionToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.getLatestSkypeVersionToolStripMenuItem.Text = "Get Latest Skype Version";
            // 
            // getLatestBetaSkypeVersionToolStripMenuItem
            // 
            this.getLatestBetaSkypeVersionToolStripMenuItem.Name = "getLatestBetaSkypeVersionToolStripMenuItem";
            this.getLatestBetaSkypeVersionToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.getLatestBetaSkypeVersionToolStripMenuItem.Text = "Get Latest Beta Skype Version";
            // 
            // devZoneToolStripMenuItem
            // 
            this.devZoneToolStripMenuItem.Name = "devZoneToolStripMenuItem";
            this.devZoneToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.devZoneToolStripMenuItem.Text = "DevZone";
            // 
            // skype4COMDocumentationToolStripMenuItem
            // 
            this.skype4COMDocumentationToolStripMenuItem.Name = "skype4COMDocumentationToolStripMenuItem";
            this.skype4COMDocumentationToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.skype4COMDocumentationToolStripMenuItem.Text = "Skype4COM Documentation";
            // 
            // aPIDocumentationToolStripMenuItem
            // 
            this.aPIDocumentationToolStripMenuItem.Name = "aPIDocumentationToolStripMenuItem";
            this.aPIDocumentationToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.aPIDocumentationToolStripMenuItem.Text = "API Documentation";
            // 
            // saveOnTelephoneBillscomToolStripMenuItem
            // 
            this.saveOnTelephoneBillscomToolStripMenuItem.Name = "saveOnTelephoneBillscomToolStripMenuItem";
            this.saveOnTelephoneBillscomToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.saveOnTelephoneBillscomToolStripMenuItem.Text = "SaveOnTelephoneBills.com";
            // 
            // donateToolStripMenuItem
            // 
            this.donateToolStripMenuItem.Name = "donateToolStripMenuItem";
            this.donateToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.donateToolStripMenuItem.Text = "Donate";
            // 
            // minimizeToolStripMenuItem
            // 
            this.minimizeToolStripMenuItem.Name = "minimizeToolStripMenuItem";
            this.minimizeToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.minimizeToolStripMenuItem.Text = "Display SEHEwc1 Window";
            // 
            // closeThisMenuToolStripMenuItem
            // 
            this.closeThisMenuToolStripMenuItem.Name = "closeThisMenuToolStripMenuItem";
            this.closeThisMenuToolStripMenuItem.Size = new System.Drawing.Size(249, 22);
            this.closeThisMenuToolStripMenuItem.Text = "Close This Menu";
            // 
            // TheNotifyIconExample_contextMenuStrip2
            // 
            this.TheNotifyIconExample_contextMenuStrip2.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.differentContextMenuExampleToolStripMenuItem,
            this.closeThisMenuToolStripMenuItem1});
            this.TheNotifyIconExample_contextMenuStrip2.Name = "contextMenuStrip2";
            this.TheNotifyIconExample_contextMenuStrip2.Size = new System.Drawing.Size(200, 48);
            // 
            // differentContextMenuExampleToolStripMenuItem
            // 
            this.differentContextMenuExampleToolStripMenuItem.Name = "differentContextMenuExampleToolStripMenuItem";
            this.differentContextMenuExampleToolStripMenuItem.Size = new System.Drawing.Size(199, 22);
            this.differentContextMenuExampleToolStripMenuItem.Text = "Different Context Menu";
            // 
            // closeThisMenuToolStripMenuItem1
            // 
            this.closeThisMenuToolStripMenuItem1.Name = "closeThisMenuToolStripMenuItem1";
            this.closeThisMenuToolStripMenuItem1.Size = new System.Drawing.Size(199, 22);
            this.closeThisMenuToolStripMenuItem1.Text = "Close This Menu";
            // 
            // MSDN
            // 
            this.MSDN.AutoSize = true;
            this.MSDN.Location = new System.Drawing.Point(233, 288);
            this.MSDN.Name = "MSDN";
            this.MSDN.Size = new System.Drawing.Size(178, 13);
            this.MSDN.TabIndex = 27;
            this.MSDN.TabStop = true;
            this.MSDN.Text = "Click For MSDN Code Gallery Article\r\n";
            this.MSDN.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.MSDN_LinkClicked);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSize = true;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.ClientSize = new System.Drawing.Size(554, 604);
            this.ContextMenuStrip = this.TheNotifyIconExample_contextMenuStrip1;
            this.Controls.Add(this.MSDN);
            this.Controls.Add(this.DevZoneHelp);
            this.Controls.Add(this.APIHelp);
            this.Controls.Add(this.Skype4COMHelp);
            this.Controls.Add(this.RetryCommandTimeouts);
            this.Controls.Add(this.SaveText);
            this.Controls.Add(this.SaveOnTelephoneBills);
            this.Controls.Add(this.Donate);
            this.Controls.Add(this.ExpectedTextLabel);
            this.Controls.Add(this.ExpectedText);
            this.Controls.Add(this.UseCommandId);
            this.Controls.Add(this.UseBlocking);
            this.Controls.Add(this.CommandTextLabel);
            this.Controls.Add(this.CommandText);
            this.Controls.Add(this.UseAutoDebug);
            this.Controls.Add(this.NonWaitedAttachRequests);
            this.Controls.Add(this.FirstTimeAlwaysTrue);
            this.Controls.Add(this.ClickForDetails);
            this.Controls.Add(this.AutoScrollOn);
            this.Controls.Add(this.StartNoSplash);
            this.Controls.Add(this.HideAPIWindow);
            this.Controls.Add(this.StartMinimized);
            this.Controls.Add(this.EnableSilentMode);
            this.Controls.Add(this.StartSkype);
            this.Controls.Add(this.SkypeStop);
            this.Controls.Add(this.UserLogoff);
            this.Controls.Add(this.textBox2);
            this.Controls.Add(this.textBox1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximumSize = new System.Drawing.Size(562, 638);
            this.MinimumSize = new System.Drawing.Size(562, 340);
            this.Name = "Form1";
            this.Text = "Skype4COM Event Handler Example V31 Copyright 2008 TheUberOverLord";
            this.Load += new System.EventHandler(this.SEHEwc1_TheNotifyIconExample_Initialize);
            this.TheNotifyIconExample_contextMenuStrip1.ResumeLayout(false);
            this.TheNotifyIconExample_contextMenuStrip2.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.CheckBox UserLogoff;
        private System.Windows.Forms.CheckBox SkypeStop;
        private System.Windows.Forms.CheckBox StartSkype;
        private System.Windows.Forms.CheckBox EnableSilentMode;
        private System.Windows.Forms.CheckBox StartMinimized;
        private System.Windows.Forms.CheckBox HideAPIWindow;
        private System.Windows.Forms.CheckBox StartNoSplash;
        private System.Windows.Forms.CheckBox AutoScrollOn;
        private System.Windows.Forms.LinkLabel ClickForDetails;
        private System.Windows.Forms.CheckBox FirstTimeAlwaysTrue;
        private System.Windows.Forms.CheckBox NonWaitedAttachRequests;
        private System.Windows.Forms.CheckBox UseAutoDebug;
        private System.Windows.Forms.TextBox CommandText;
        private System.Windows.Forms.Label CommandTextLabel;
        private System.Windows.Forms.CheckBox UseBlocking;
        private System.Windows.Forms.CheckBox UseCommandId;
        private System.Windows.Forms.TextBox ExpectedText;
        private System.Windows.Forms.Label ExpectedTextLabel;
        private System.Windows.Forms.CheckBox SaveText;
        private System.Windows.Forms.CheckBox RetryCommandTimeouts;
        private System.Windows.Forms.LinkLabel Skype4COMHelp;
        private System.Windows.Forms.LinkLabel APIHelp;
        private System.Windows.Forms.LinkLabel DevZoneHelp;
        private System.Windows.Forms.LinkLabel SaveOnTelephoneBills;
        private System.Windows.Forms.LinkLabel Donate;
        private System.Windows.Forms.NotifyIcon TheNotifyIconExample_NotifyIcon;
        private System.Windows.Forms.ContextMenuStrip TheNotifyIconExample_contextMenuStrip1;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem helpForThisProgramToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem devZoneToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem skype4COMDocumentationToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem aPIDocumentationToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem saveOnTelephoneBillscomToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem donateToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem minimizeToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem getLatestSkypeVersionToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem getLatestBusinessSkypeVersionToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem getLatestBetaSkypeVersionToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem closeThisMenuToolStripMenuItem;
        private System.Windows.Forms.ContextMenuStrip TheNotifyIconExample_contextMenuStrip2;
        private System.Windows.Forms.ToolStripMenuItem differentContextMenuExampleToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem closeThisMenuToolStripMenuItem1;
        private System.Windows.Forms.LinkLabel MSDN;
    }
}



