﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using RRComSSys.Controller;
using System.Windows.Forms;

namespace RRComSSys.View
{
    /// <summary>
    /// Interaction logic for ExecutionWindow.xaml
    /// </summary>
    public partial class ExecutionWindow : Window, IExecutionView
    {
        #region Initialization

        private bool _fileLoaded = false;

        public ExecutionWindow()
        {
            InitializeComponent();
            initializeCommands();
            Log = "Error Log" + Environment.NewLine;
            Controller = new MainController(this);
            this.DataContext = this;
        }

        private void initializeCommands()
        {
            ExecuteClicked = new RoutedUICommand();
            LoadClicked = new RoutedUICommand();
            SendFileClicked = new RoutedUICommand();

            this.ExecuteButton.Command = this.ExecuteClicked;
            this.ExecuteButton.CommandBindings.Add(new CommandBinding(this.ExecuteClicked, ExecuteClicked_Executed, ExecuteClicked_CanExecute));

            this.LoadGCMLButton.Command = this.LoadClicked;
            this.LoadGCMLButton.CommandBindings.Add(new CommandBinding(this.LoadClicked, LoadClicked_Executed));

            this.SendFileButton.Command = this.SendFileClicked;
            this.SendFileButton.CommandBindings.Add(new CommandBinding(this.SendFileClicked, SendFileClicked_Executed));
        }
        

        #endregion

        #region Properties
                
        public MainController Controller { get; set; }
        public RoutedUICommand ExecuteClicked { get; set; }
        public RoutedUICommand LoadClicked { get; set; }
        public RoutedUICommand SendFileClicked { get; set; }

        #endregion

        #region Handlers

        private void ExecuteClicked_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            Controller.ExecuteXCML();
            _fileLoaded = false;
        }

        private void ExecuteClicked_CanExecute(object sender, CanExecuteRoutedEventArgs e)
        {
            e.CanExecute = _fileLoaded;
        }

        private void LoadClicked_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            
            Controller.LoadFile();
            Controller.TransformGCML();
            _fileLoaded = true;
        }

        private void SendFileClicked_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            Controller.SendFile();
        }        



        #endregion

        #region IExecutionView members

        public string Log
        {
            get
            {
                return txtConnectionLog.Text;
            }
            set
            {
                txtConnectionLog.Text = value;
            }
        }


        public string getFilePath()
        {
            return FileHandler.getFilePath();
        }

        public string ShowMissingAttrForm(string attr)
        {
            MissingInfoForm mf = new MissingInfoForm(attr);
            
            mf.ShowDialog();

            if(!string.IsNullOrEmpty(mf.ReturnValue))
                return mf.ReturnValue;

            return null;                
        }

        #endregion        
    }
}
