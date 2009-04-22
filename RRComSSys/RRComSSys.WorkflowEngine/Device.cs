using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine
{
    public class Device
    {
        private TransformationEngine.Device device = null;
        private WorkflowEngine.IsAttached attachedTo = null;

        public Device( TransformationEngine.Device aDevice, Workflow wfInstance)
        {
            device = aDevice;
            CreateAttachmentTo(wfInstance);
        }

        public IsAttached AttachedTo
        {
            get { return attachedTo; }
            set { attachedTo = value; }
        }

        private void CreateAttachmentTo(Workflow instance)
        {
            TransformationEngine.IsAttached attached =
                instance.IsAttached[WorkflowFactory.IndexOfActivity(device.fromIsAttached)];
             //   instance.IsAttached.Find(x => (x.toDevice.Equals(device.DeviceID)));
            AttachedTo = new IsAttached(attached,instance);
        }

        public Person DeviceAttachesToPerson()
        {
            return attachedTo.IsAttachedToPerson();
        }

        public TransformationEngine.Device DeviceModel()
        {
            return device;
        }


   }
}
