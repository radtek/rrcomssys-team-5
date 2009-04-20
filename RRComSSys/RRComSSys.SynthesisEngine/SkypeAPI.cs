using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using SKYPE4COMLib;

namespace RRComSSys.SynthesisEngine
{
    internal sealed class SkypeAPI
    {        
        private SkypeAPI()
        { }

        static readonly Skype instance = new Skype();

        public static Skype GetInstance()
        {
            return instance;
        }
    }
}
