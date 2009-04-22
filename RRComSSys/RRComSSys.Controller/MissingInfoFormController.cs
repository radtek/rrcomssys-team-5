using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.Controller
{    
    public class MissingInfoFormController
    {
        public MissingInfoFormController(IMissingInfoView view)
        {
            View = view;
        }

        public IMissingInfoView View { get; set; }
    }
}
