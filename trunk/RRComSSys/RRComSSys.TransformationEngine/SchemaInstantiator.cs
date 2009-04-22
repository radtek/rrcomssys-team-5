using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.TransformationEngine
{
    public class SchemaInstantiator
    {
        public Workflow Document { get; private set; }
        delegate string MissingAttribute(string attrMessage);
        private MissingAttribute
        MissingAttributeEvt;


        public SchemaInstantiator(Workflow doc, IMissingAttributeHandler handler)
        {
            Document = doc;
            MissingAttributeEvt = handler.GetMissingAttribute;
        }

        public void Instantiate()
        {
            checkPerson();
            checkConnections();
            checkDevices();
            CheckDecision();
            CheckBoundary();
            CheckCall();
        }

        private string callMissingAttribute(string attrInfo)
        {
            return MissingAttributeEvt("Enter " + attrInfo);
        }

        private void checkConnections()
        {
            foreach (Connection conn in Document.Connection)
            {
                if (!string.IsNullOrEmpty(conn.ConnectionID))
                    conn.ConnectionID = callMissingAttribute("Connection ID");

                if (!string.IsNullOrEmpty(conn.bandwidth))
                    conn.bandwidth = callMissingAttribute("Connection Bandwidth");
            }
        }        

        private void checkDevices()
        {
            bool localSpecified = false;

            foreach (Device dev in Document.Device)
            {
                if (dev.deviceCapability.Count == 0)
                    dev.deviceCapability = new List<Capability>(new Capability[] {Capability.LiveAudio});

                if (!string.IsNullOrEmpty(dev.DeviceID))
                    dev.DeviceID = callMissingAttribute("Device ID");

                if (dev.isLocalSpecified == true)
                    localSpecified = true;
            }

            if (!localSpecified)
                throw new ValidationException("Is local should be specified for at least one device");
        }

        private void CheckDecision()
        {
            foreach (Decision de in Document.Decision)
            {
                if (!string.IsNullOrEmpty(de.activityID))
                    de.activityID = callMissingAttribute("Decision Activity ID");

                if (!string.IsNullOrEmpty(de.successPathID))
                    de.successPathID = callMissingAttribute("Decision Success Path ID");            

                if (!string.IsNullOrEmpty(de.failPathID))
                    de.failPathID = callMissingAttribute("Decision Fail Path ID");

                if (!string.IsNullOrEmpty(de.successPathID))
                    de.sourceActivityID = callMissingAttribute("Decision Source Activity ID");
            }
        }

        private void CheckBoundary()
        {
            
            foreach (Boundary bd in Document.Boundary)
            {
                if (!string.IsNullOrEmpty(bd.activityID))
                    bd.activityID = callMissingAttribute("Boundary Activity ID");

                if (bd.TypeSpecified == false)
                {
                    if (callMissingAttribute("Boundary Type").Equals("start", StringComparison.OrdinalIgnoreCase))
                        bd.Type = BoundaryType.Start;
                    else
                        bd.Type = BoundaryType.End;

                }                
            }        
        }

        private void CheckCall()
        {
            foreach (Call cl in Document.Call)
            {
                if (string.IsNullOrEmpty(cl.activityID))
                    cl.activityID = callMissingAttribute("Call Activity ID");                
            }       
        }

        private void checkPerson()
        {
            foreach (Person p in Document.Person)
            {
                if (!string.IsNullOrEmpty(p.personID))
                    p.personID = callMissingAttribute("Person ID");

                if (!string.IsNullOrEmpty(p.personName))
                    p.personName = callMissingAttribute("Person Name");

                if (!string.IsNullOrEmpty(p.personRole))
                    p.personRole = callMissingAttribute("Person Role");
            }    
        }
    }
}
