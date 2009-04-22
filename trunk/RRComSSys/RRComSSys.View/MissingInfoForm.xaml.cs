using System;
using System.IO;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Navigation;

namespace RRComSSys.View
{
	public partial class MissingInfoForm
	{
		public MissingInfoForm(string attr)
		{
			this.InitializeComponent();
            this.AttrMessageLabel.Content = attr;			
		}

        public string ReturnValue { get; private set; }

        private void OK_Button_Click(object sender, RoutedEventArgs e)
        {
            if(!string.IsNullOrEmpty(ReturnValueTB.Text))
                ReturnValue = ReturnValueTB.Text;

            this.Close();
        }

        private void Cancel_Button_Click(object sender, RoutedEventArgs e)
        {
            this.Close();
        }
	}
}