using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.TransformationEngine;

namespace RRComSSys.SynthesisEngine
{
    public class SEClient
    {
        private Command _command;
        
        public SEClient(CommandType type)
        {
            _command = new Command(new SkypeReceiver(), type);
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
