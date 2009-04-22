using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.SynthesisEngine
{
    public static class PressKeys
    {
        private static IntPtr curWindowHandle = IntPtr.Zero;

        public static void sendString(string fileName)
        {
            NativeMethods.GetWindowWithSubstring("Send file", 0, 0, ref curWindowHandle);            
            NativeMethods.SetForegroundWindow(curWindowHandle);
            for (int charIndex = 0; charIndex < fileName.Length; charIndex++)
            {
                processKey(NativeMethods.VkKeyScan(fileName[charIndex]));
            }

            IntPtr buttonHwnd = IntPtr.Zero;

            buttonHwnd = NativeMethods.FindWindowEx(curWindowHandle, IntPtr.Zero, "Button", "Open");

            if (buttonHwnd != IntPtr.Zero)
            {
                NativeMethods.SendMessage(buttonHwnd, NativeMethods.WM_LBUTTONDOWN, 0, 0);
                NativeMethods.SendMessage(buttonHwnd, NativeMethods.WM_LBUTTONUP, 0, 0);
                NativeMethods.SendMessage(buttonHwnd, NativeMethods.BM_SETSTATE, 0, 0);
            }
        }

        private static void processKey(uint keyToPressCode)
        {
            try
            {
                byte virtualKeyCode = (byte)keyToPressCode; // low byte contains virtual key code
                ushort scanCode = (ushort)NativeMethods.MapVirtualKey(virtualKeyCode, NativeMethods.MAPVK_VK_TO_VSC);
                uint shiftState = GetShiftState(keyToPressCode);
                bool midKeyPress = false;
                int inputIndex = 0;

                NativeMethods.INPUT[] input = new NativeMethods.INPUT[4];

                if (((shiftState > 0) && (shiftState <= 8)) && !midKeyPress
                    && processShiftState(shiftState, input, inputIndex, midKeyPress))
                {
                    midKeyPress = true;
                    inputIndex++;
                }

                // KEYDOWN
                input[inputIndex].type = NativeMethods.INPUT_KEYBOARD;
                input[inputIndex].ki.wVk = (ushort)virtualKeyCode;
                input[inputIndex].ki.wScan = scanCode;
                inputIndex++;

                // KEYUP
                input[inputIndex].type = NativeMethods.INPUT_KEYBOARD;
                input[inputIndex].ki.wVk = (ushort)virtualKeyCode;
                input[inputIndex].ki.dwFlags = NativeMethods.KEYEVENTF_KEYUP;
                input[inputIndex].ki.wScan = scanCode;
                inputIndex++;

                if (((shiftState > 0) && (shiftState <= 8)) && midKeyPress
                    && processShiftState(shiftState, input, inputIndex, midKeyPress))
                {
                    midKeyPress = false;
                    inputIndex++;
                }

                if (curWindowHandle == null || curWindowHandle == IntPtr.Zero)
                    throw new Exception("Unable to press keys becuase the current window handle is not set");

                DateTime endTime = DateTime.Now.AddSeconds(15);

                while (DateTime.Now < endTime)
                {
                    NativeMethods.SetForegroundWindow(curWindowHandle);

                    if (NativeMethods.GetForegroundWindow() == curWindowHandle)
                    {
                        NativeMethods.SendInput(4, input, System.Runtime.InteropServices.Marshal.SizeOf(input[0]));
                        break;
                    }
                }
            }
            catch (Exception e)
            {
                throw (e);
            }
        }

        private static bool processShiftState(uint shiftState, NativeMethods.INPUT[] input, int inputIndex, bool midKeyPress)
        {
            try
            {
                switch (shiftState)
                {
                    case 0:
                        return false;

                    #region SHIFT
                    case 1:
                        {
                            if (!midKeyPress)
                            {
                                // SHIFT DOWN
                                input[inputIndex].type = NativeMethods.INPUT_KEYBOARD;
                                input[inputIndex].ki.wVk = NativeMethods.VK_SHIFT;
                                input[inputIndex].ki.wScan = 42; // left shift
                            }
                            else
                            {
                                // SHIFT UP
                                input[inputIndex].type = NativeMethods.INPUT_KEYBOARD;
                                input[inputIndex].ki.wVk = NativeMethods.VK_SHIFT;
                                input[inputIndex].ki.dwFlags = NativeMethods.KEYEVENTF_KEYUP;
                                input[inputIndex].ki.wScan = 42; // left shift
                            }
                            break;
                        }
                    #endregion

                    #region CTRL
                    //case 2:
                    //{
                    //    if (!midKeyPress)
                    //    {
                    //        // CTRL DOWN
                    //        input[inputIndex].type = NativeMethods.INPUT_KEYBOARD;
                    //        input[inputIndex].ki.wVk = NativeMethods.VK_CONTROL;
                    //        input[inputIndex].ki.wScan = 29; // left ctrl
                    //    }
                    //    else
                    //    {
                    //        // CTRL UP
                    //        input[inputIndex].type = NativeMethods.INPUT_KEYBOARD;
                    //        input[inputIndex].ki.wVk = NativeMethods.VK_CONTROL;
                    //        input[inputIndex].ki.dwFlags = NativeMethods.KEYEVENTF_KEYUP;
                    //        input[inputIndex].ki.wScan = 29; // left ctrl
                    //    }
                    //    break;
                    //}
                    #endregion

                    #region ALT
                    //case 4:
                    //{
                    //    if (!midKeyPress)
                    //    {
                    //        // ALT DOWN
                    //        input[inputIndex].type = NativeMethods.INPUT_KEYBOARD;
                    //        input[inputIndex].ki.wVk = NativeMethods.VK_MENU;
                    //        input[inputIndex].ki.wScan = 56; // left alt
                    //    }
                    //    else
                    //    {
                    //        // ALT UP
                    //        input[inputIndex].type = NativeMethods.INPUT_KEYBOARD;
                    //        input[inputIndex].ki.wVk = NativeMethods.VK_MENU;
                    //        input[inputIndex].ki.dwFlags = NativeMethods.KEYEVENTF_KEYUP;
                    //        input[inputIndex].ki.wScan = 56; // left alt
                    //    }
                    //    break;
                    //}
                    #endregion

                    default:
                        throw new Exception("Unsupported shift state detected. Cannot process PressKey request.");
                }

                return true;
            }
            catch (Exception e)
            {
                throw (e);
            }
        }

        /// <summary>
        /// Gets the shift state (high-order byte) of a 
        /// virtualKeyCode obtained by VkKeyScan method.
        /// </summary>
        /// <param name="virtualKeyCode"></param>
        /// <returns>
        /// Returns 1 if SHIFT key is pressed.
        /// Returns 2 if CTRL key is pressed.
        /// Returns 4 if ALT key is pressed.
        /// Returns 8 if Hankaku key is pressed.
        /// </returns>
        private static uint GetShiftState(uint virtualKeyCode)
        {
            return virtualKeyCode >> 8;
        }
    }
}
