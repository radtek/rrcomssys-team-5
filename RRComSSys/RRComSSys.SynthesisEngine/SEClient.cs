using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.SynthesisEngine
{
    public class SEClient
    {
        private Command _command;
        public SEClient()
        {
            _command = new Command(new SkypeReceiver());
        }

        public Command MyCommand
        {
            get
            {
                return _command;
            }
        }
    }
}
