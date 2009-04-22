using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine
{
    public class Connection
    {
        private TransformationEngine.Connection myConnection;
        private SortedDictionary<int,Device> deviceDictionary = new SortedDictionary<int,Device>();
        
        public TransformationEngine.Connection ConnectionType
        {
            get { return myConnection; }
            set { myConnection = value; }
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="Connection"/> class.
        /// </summary>
        /// <param name="connection">The connection.</param>
        /// <param name="wfInstance">The wf instance.</param>
        public Connection ( TransformationEngine.Connection connection, Workflow wfInstance)
        {
            ConnectionType = connection;
            BuildConnection(wfInstance);
        }

        /// <summary>
        /// Builds the connection.
        /// </summary>
        /// <param name="instance">The instance.</param>
        private void BuildConnection(Workflow instance)
        {
            int key = 1;

            foreach (string deviceID in myConnection.fromDevice)
            {
                TransformationEngine.Device aDevice = instance.Device[WorkflowFactory.IndexOfActivity(deviceID)];//.//Find(x => (x.DeviceID.Equals(deviceID)));
                if (aDevice.isLocal)
                    deviceDictionary.Add(0, new Device(aDevice,instance));
                else
                {
                    deviceDictionary.Add(key, new Device(aDevice, instance));
                    key++;
                }
            }
        }

        /// <summary>
        /// Primaries the device.
        /// </summary>
        /// <returns></returns>
        public Device LocalDevice()
        {
            Device thePrimaryDevice = deviceDictionary[0];
            return thePrimaryDevice;
        }

        /// <summary>
        /// Devices at.
        /// </summary>
        /// <param name="index">The index.</param>
        /// <returns></returns>
        public Device DeviceAt(int index)
        {
            return deviceDictionary[index];
        }

        /// <summary>
        /// Remotelies the connected devices.
        /// </summary>
        /// <returns></returns>
        public int RemotelyConnectedDevices()
        {
            return deviceDictionary.Count - 1;
        }
    }
}
