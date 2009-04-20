using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections.Specialized;
using SKYPE4COMLib;

namespace RRComSSys.SynthesisEngine
{
    public class SkypeReceiver
    {
        private Skype _skypeObject;

        public SkypeReceiver()
        {       
            _skypeObject.CallStatus +=new _ISkypeEvents_CallStatusEventHandler(_skypeObject_CallStatus);
        }

        void  _skypeObject_CallStatus(Call pCall, TCallStatus Status)
        {
 	        throw new NotImplementedException();
        }

        public void MakeAVoiceCall()
        {

        }
    }
}
