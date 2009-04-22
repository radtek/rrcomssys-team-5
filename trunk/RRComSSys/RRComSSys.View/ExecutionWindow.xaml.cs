using System;
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

        private bool fileLoaded = false;

        public ExecutionWindow()
        {
            InitializeComponent();
            initializeCommands();
            Log = new StringBuilder();
            Controller = new MainController(this);
        }

        private void initializeCommands()
        {
            ExecuteClicked = new RoutedUICommand();
            LoadClicked = new RoutedUICommand();

            this.ExecuteButton.Command = this.ExecuteClicked;
            this.ExecuteButton.CommandBindings.Add(new CommandBinding(this.ExecuteClicked, ExecuteClicked_Executed, ExecuteClicked_CanExecute));

            this.LoadGCMLButton.Command = this.LoadClicked;
            this.LoadGCMLButton.CommandBindings.Add(new CommandBinding(this.LoadClicked, ExecuteClicked_Executed));
        }

        #endregion

        #region Properties
                
        public MainController Controller { get; set; }
        public RoutedUICommand ExecuteClicked { get; set; }
        public RoutedUICommand LoadClicked { get; set; }

        #endregion

        #region Handlers

        private void ExecuteClicked_Executed(object sender, ExecutedRoutedEventArgs e)
        {

        }

        private void ExecuteClicked_CanExecute(object sender, CanExecuteRoutedEventArgs e)
        {
            e.CanExecute = fileLoaded;
        }

        private void LoadClicked_Executed(object sender, ExecutedRoutedEventArgs e)
        {
            Controller.LoadFile();
            
        }

        #endregion

        #region IExecutionView members

        public IMissingInfoView MissingInfoView { get; set; }

        public StringBuilder Log { get; set; }

        public string getFilePath()
        {
            return FileHandler.getFilePath();
        }

        #endregion
    }
}
