using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RRComSSys.View
{
    public static class FileHandler
    {
        public static string getFilePath()
        {
            OpenFileDialog openFileDialog1 = new OpenFileDialog();

            openFileDialog1.DefaultExt = ".gcml";
            openFileDialog1.Filter = "gcml files (*.gcml)|*.gcml";

            if(openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                return openFileDialog1.FileName;
            }

            else return null;
        }

    }
}
