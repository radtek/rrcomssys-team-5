/********************************************************************************
    This file is part of Simple Web Automation Toolkit, 
    Copyright (C) 2007 by Ultimate Software, Inc. All rights reserved.

    Simple Web Automation Toolkit is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License version 2 as published by
    the Free Software Foundation; 

    Simple Web Automation Toolkit is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */

/********************************************************************************/


using System;
using System.Collections.Generic;
using System.Text;
using System.Runtime.InteropServices;


namespace RRComSSys.SynthesisEngine
{
    /// <summary>
    /// Class that contains native win32 API support.
    /// </summary>
    public sealed class NativeMethods
    {
        #region Class variables

        static string enumChildClassName;
        static string enumWindowSubtitle;
        static int enumIndexCount;
        static int enumIndex;

        #endregion Class Variables


        #region Constants

        internal const int WM_SYSCOMMAND = 0x0112;
        internal const int WM_COMMAND = 0x0111;
        internal const int WM_CLOSE = 0x0010;
        internal const int SC_CLOSE = 0xF060;
        internal const int SC_MAXIMIZE = 0xF030;
        internal const int SC_MINIMIZE = 0xF020;

        internal const int WM_MDIMAXIMIZE = 0x225;


        internal const int KEYEVENTF_EXTENDEDKEY = 0x1;
        internal const int KEYEVENTF_KEYUP = 0x2;
        internal const int KEYEVENTF_TAB = 0x09;

        internal const Int32 SMTO_ABORTIFHUNG = 2;
        internal const Int32 SMTO_NOTIMEOUTIFNOTHUNG = 8;


        internal const int WM_LBUTTONDOWN = 0x0201;
        internal const int WM_LBUTTONUP = 0x0202;
        internal const int BM_SETSTATE = 0x00F3;


        internal const uint GW_HWNDFIRST = 0;
        internal const uint GW_HWNDLAST = 1;
        internal const uint GW_HWNDNEXT = 2;
        internal const uint GW_HWNDPREV = 3;
        internal const uint GW_OWNER = 4;
        internal const uint GW_CHILD = 5;
        internal const uint GW_ENABLEDPOPUP = 6;

        //SendMessage Constants
        internal const int SEARCH_ALL = -1;
        internal const int CB_SELECTSTRING = 0x014D; //ComboBox
        internal const int WM_SETTEXT = 0x000C; //TextBox
        internal const int BM_CLICK = 0x00F5; //Button
        internal const uint WM_KEYDOWN = 0x100;
        internal const uint WM_CHAR = 0x102;
        internal const uint WM_KEYUP = 0x101;

        //MapVirtualKeys uMapType Constants
        internal const uint MAPVK_VK_TO_VSC = 0x00;
        internal const uint MAPVK_VSC_TO_VK = 0x01;
        internal const uint MAPVK_VK_TO_CHAR = 0x02;
        internal const uint MAPVK_VSC_TO_VK_EX = 0x03;
        internal const uint MAPVK_VK_TO_VSC_EX = 0x04;

        //Virtual Key Codes
        internal const ushort VK_SHIFT = 0x10;
        internal const ushort VK_MENU = 0x12;
        internal const ushort VK_CONTROL = 0x11;

        //SendInput input type
        internal const int INPUT_KEYBOARD = 1;

        #endregion Constants


        #region Structs

        [StructLayout(LayoutKind.Sequential)]
        internal struct WINDOWPLACEMENT
        {
            public int length;
            public int flags;
            public int showCmd;
            public POINT ptMinPosition;
            public POINT ptMaxPosition;
            public RECT rcNormalPosition;
        }

        [StructLayout(LayoutKind.Sequential)]
        internal struct POINT
        {
            public int X;
            public int Y;
        }

        [StructLayout(LayoutKind.Sequential)]
        internal struct RECT
        {
            public int Left;
            public int Top;
            public int Right;
            public int Bottom;
        }

        [StructLayout(LayoutKind.Sequential)]
        public struct KEYBDINPUT
        {
            public ushort wVk; // Virtual Key Code
            public ushort wScan; // Scan Code
            public uint dwFlags;
            public long time;
            public uint dwExtraInfo;
        }

        [StructLayout(LayoutKind.Explicit, Size = 28)]
        public struct INPUT
        {
            [FieldOffset(0)]
            public uint type; // eg. INPUT_KEYBOARD
            [FieldOffset(4)]
            public KEYBDINPUT ki;
        }

        [StructLayout(LayoutKind.Sequential)]
        struct WINDOWINFO
        {
            public uint cbSize;
            public RECT rcWindow;
            public RECT rcClient;
            public uint dwStyle;
            public uint dwExStyle;
            public uint dwWindowStatus;
            public uint cxWindowBorders;
            public uint cyWindowBorders;
            public ushort atomWindowType;
            public ushort wCreatorVersion;
        }

        #endregion Structs


        #region Delegates

        internal delegate bool EnumThreadProc(IntPtr hwnd, IntPtr lParam);
        internal delegate bool EnumChildProc(IntPtr hWnd, ref IntPtr lParam);
        internal delegate bool EnumWindowsProc(IntPtr hWnd, ref IntPtr lParam);

        #endregion Delegates


        #region Enums

        /// <summary>
        /// Enumeration of the different ways of showing a window using 
        /// ShowWindow
        /// </summary>
        public enum WindowShowStyle : int
        {
            /// <summary>Hides the window and activates another window.</summary>
            /// <remarks>See SW_HIDE</remarks>
            Hide = 0,
            /// <summary>Activates and displays a window. If the window is minimized 
            /// or maximized, the system restores it to its original size and 
            /// position. An application should specify this flag when displaying 
            /// the window for the first time.</summary>
            /// <remarks>See SW_SHOWNORMAL</remarks>
            ShowNormal = 1,
            /// <summary>Activates the window and displays it as a minimized window.</summary>
            /// <remarks>See SW_SHOWMINIMIZED</remarks>
            ShowMinimized = 2,
            /// <summary>Activates the window and displays it as a maximized window.</summary>
            /// <remarks>See SW_SHOWMAXIMIZED</remarks>
            ShowMaximized = 3,
            /// <summary>Maximizes the specified window.</summary>
            /// <remarks>See SW_MAXIMIZE</remarks>
            Maximize = 3,
            /// <summary>Displays a window in its most recent size and position. 
            /// This value is similar to "ShowNormal", except the window is not 
            /// actived.</summary>
            /// <remarks>See SW_SHOWNOACTIVATE</remarks>
            ShowNormalNoActivate = 4,
            /// <summary>Activates the window and displays it in its current size 
            /// and position.</summary>
            /// <remarks>See SW_SHOW</remarks>
            Show = 5,
            /// <summary>Minimizes the specified window and activates the next 
            /// top-level window in the Z order.</summary>
            /// <remarks>See SW_MINIMIZE</remarks>
            Minimize = 6,
            /// <summary>Displays the window as a minimized window. This value is 
            /// similar to "ShowMinimized", except the window is not activated.</summary>
            /// <remarks>See SW_SHOWMINNOACTIVE</remarks>
            ShowMinNoActivate = 7,
            /// <summary>Displays the window in its current size and position. This 
            /// value is similar to "Show", except the window is not activated.</summary>
            /// <remarks>See SW_SHOWNA</remarks>
            ShowNoActivate = 8,
            /// <summary>Activates and displays the window. If the window is 
            /// minimized or maximized, the system restores it to its original size 
            /// and position. An application should specify this flag when restoring 
            /// a minimized window.</summary>
            /// <remarks>See SW_RESTORE</remarks>
            Restore = 9,
            /// <summary>Sets the show state based on the SW_ value specified in the 
            /// STARTUPINFO structure passed to the CreateProcess function by the 
            /// program that started the application.</summary>
            /// <remarks>See SW_SHOWDEFAULT</remarks>
            ShowDefault = 10,
            /// <summary>Windows 2000/XP: Minimizes a window, even if the thread 
            /// that owns the window is hung. This flag should only be used when 
            /// minimizing windows from a different thread.</summary>
            /// <remarks>See SW_FORCEMINIMIZE</remarks>
            ForceMinimized = 11
        }

        #endregion Enums


        /// <summary>
        /// Prevent creating an instance of this class (contains only static members)
        /// </summary>
        private NativeMethods() { }


        #region DllImport User32

        [DllImport("user32.dll", CharSet = CharSet.Auto)]
        internal static extern bool EnumThreadWindows(int threadId, EnumThreadProc pfnEnum, IntPtr lParam);

        [DllImport("user32", EntryPoint = "GetClassNameA", CharSet = CharSet.Ansi, SetLastError = true, ExactSpelling = true)]
        internal static extern int GetClassName(IntPtr handleToWindow, StringBuilder className, int maxClassNameLength);

        [DllImport("user32.dll", SetLastError = true, CharSet = CharSet.Auto)]
        internal static extern IntPtr GetDlgItem(IntPtr handleToWindow, int ControlId);

        /// <summary>
        /// The GetForegroundWindow function returns a handle to the foreground window.
        /// </summary>
        [DllImport("user32.dll", SetLastError = true)]
        internal static extern IntPtr GetForegroundWindow();

        [DllImport("user32.dll", SetLastError = true, CharSet = CharSet.Auto)]
        internal static extern int GetWindowText(IntPtr handleToWindow, StringBuilder windowText, int maxTextLength);

        [DllImport("user32.dll", SetLastError = true, CharSet = CharSet.Auto)]
        internal static extern int GetWindowTextLength(IntPtr hWnd);

        [DllImport("user32.dll", SetLastError = true, CharSet = CharSet.Auto)]
        internal static extern bool GetWindowPlacement(IntPtr hWnd, ref WINDOWPLACEMENT lpwndpl);

        [DllImport("user32.dll", CharSet = CharSet.Auto)]
        internal static extern int SendMessage(IntPtr hWnd, int msg, int wParam, int lParam);

        [DllImport("user32.dll", CharSet = CharSet.Auto)]
        internal static extern int SendMessage(IntPtr hWnd, uint msg, uint wParam, uint lParam);

        /// <summary>
        /// Translates a character to the corresponding virtual-key code
        /// and shift state for the current keyboard.
        /// </summary>
        /// <param name="ch"></param>
        /// <returns>
        /// The low-order byte of the return value contains the virtual-key code.
        /// The high-order byte contains the shift state.
        /// </returns>
        [DllImport("user32.dll")]
        public static extern ushort VkKeyScan(char ch);

        /// <summary>
        /// Translates (maps) a virtual-key code into a scan code or character value,
        /// or translates a scan code into a virtual-key code. 
        /// </summary>
        /// <param name="uCode"></param>
        /// <param name="uMapType"></param>
        /// <returns>
        /// Returns either a scan code, a virtual-key code, or a character value, depending on the value of uCode and uMapType. 
        /// If there is no translation, the return value is zero.
        /// </returns>
        [DllImport("user32.dll")]
        internal static extern uint MapVirtualKey(uint uCode, uint uMapType);

        /// <summary>
        /// Synthesizes keystrokes to a process
        /// </summary>
        /// <param name="nInputs"></param>
        /// <param name="pInputs"></param>
        /// <param name="cbSize"></param>
        /// <returns>
        /// Returns the number of events that it successfully inserted into the keyboard or mouse input stream.
        /// If the function returns zero, the input was already blocked by another thread.
        /// </returns>
        [DllImport("user32.dll", SetLastError = true)]
        public static extern uint SendInput(uint nInputs, INPUT[] pInputs, int cbSize);

        [DllImport("user32.dll", CharSet = CharSet.Auto)]
        public static extern bool PostMessage(IntPtr hWnd, uint Msg, uint wParam, uint lParam);

        [DllImport("user32.dll", SetLastError = true)]
        [return: MarshalAs(UnmanagedType.Bool)]
        internal static extern bool SetForegroundWindow(IntPtr hWnd);

        [DllImport("user32", CharSet = CharSet.Ansi, SetLastError = true, ExactSpelling = true)]
        internal static extern Int32 EnumChildWindows(IntPtr hWndParent, EnumChildProc lpEnumFunc, ref IntPtr lParam);

        [DllImport("user32", EntryPoint = "RegisterWindowMessageA", CharSet = CharSet.Ansi, SetLastError = true, ExactSpelling = true)]
        internal static extern Int32 RegisterWindowMessage(string lpString);

        [DllImport("user32", EntryPoint = "SendMessageTimeoutA", CharSet = CharSet.Ansi, SetLastError = true, ExactSpelling = true)]
        internal static extern Int32 SendMessageTimeout(IntPtr hWnd, Int32 msg, Int32 wParam, Int32 lParam, Int32 fuFlags, Int32 uTimeout, ref Int32 lpdwResult);

        [DllImport("user32.dll")]
        internal static extern bool AttachThreadInput(int idAttach, int idAttachTo, bool fAttach);

        /// <summary>Shows a Window</summary>
        /// <remarks>
        /// <para>To perform certain special effects when showing or hiding a 
        /// window, use AnimateWindow.</para>
        ///<para>The first time an application calls ShowWindow, it should use 
        ///the WinMain function's nCmdShow parameter as its nCmdShow parameter. 
        ///Subsequent calls to ShowWindow must use one of the values in the 
        ///given list, instead of the one specified by the WinMain function's 
        ///nCmdShow parameter.</para>
        ///<para>As noted in the discussion of the nCmdShow parameter, the 
        ///nCmdShow value is ignored in the first call to ShowWindow if the 
        ///program that launched the application specifies startup information 
        ///in the structure. In this case, ShowWindow uses the information 
        ///specified in the STARTUPINFO structure to show the window. On 
        ///subsequent calls, the application must call ShowWindow with nCmdShow 
        ///set to SW_SHOWDEFAULT to use the startup information provided by the 
        ///program that launched the application. This behavior is designed for 
        ///the following situations: </para>
        ///<list type="">
        ///    <item>Applications create their main window by calling CreateWindow 
        ///    with the WS_VISIBLE flag set. </item>
        ///    <item>Applications create their main window by calling CreateWindow 
        ///    with the WS_VISIBLE flag cleared, and later call ShowWindow with the 
        ///    SW_SHOW flag set to make it visible.</item>
        ///</list></remarks>
        /// <param name="hWnd">Handle to the window.</param>
        /// <param name="nCmdShow">Specifies how the window is to be shown. 
        /// This parameter is ignored the first time an application calls 
        /// ShowWindow, if the program that launched the application provides a 
        /// STARTUPINFO structure. Otherwise, the first time ShowWindow is called, 
        /// the value should be the value obtained by the WinMain function in its 
        /// nCmdShow parameter. In subsequent calls, this parameter can be one of 
        /// the WindowShowStyle members.</param>
        /// <returns>
        /// If the window was previously visible, the return value is nonzero. 
        /// If the window was previously hidden, the return value is zero.
        /// </returns>
        [DllImport("user32.dll")]
        internal static extern bool ShowWindow(IntPtr hWnd, int nCmdShow);

        [DllImport("user32.dll", SetLastError = true)]
        internal static extern IntPtr FindWindowEx(IntPtr hwndParent, IntPtr hwndChildAfter, string lpszClass, string lpszWindow);

        [DllImport("user32.dll", SetLastError = true)]
        internal static extern IntPtr FindWindow(string lpClassName, string lpWindowName);

        [DllImport("user32.dll", SetLastError = true)]
        internal static extern bool IsWindow(IntPtr hWnd);

        [DllImport("user32.dll")]
        [return: MarshalAs(UnmanagedType.Bool)]
        static extern bool EnumWindows(EnumWindowsProc lpEnumFunc, ref IntPtr lParam);

        [DllImport("user32.dll")]
        static extern bool GetWindowInfo(IntPtr hwnd, ref WINDOWINFO pwi);

        [DllImport("user32.dll", SetLastError = true)]
        internal static extern IntPtr GetWindow(IntPtr hWnd, uint uCmd);

        [DllImport("user32.dll", SetLastError = true)]
        internal static extern bool BringWindowToTop(IntPtr hWnd);

        [DllImport("user32.dll")]
        [return: MarshalAs(UnmanagedType.Bool)]
        internal static extern bool GetClientRect(IntPtr hWnd, out RECT lpRect);

        [DllImport("user32.dll", SetLastError = true)]
        public static extern void SwitchToThisWindow(IntPtr hWnd, bool fAltTab);

        #endregion DllImport User32


        #region Misc imports

        [DllImport("kernel32")]
        internal static extern int GetCurrentThreadId();

        #endregion Misc imports


        internal static IntPtr GetChildWindowHwnd(IntPtr parentHwnd, string className)
        {
            IntPtr hWnd = IntPtr.Zero;
            enumChildClassName = className;

            // Go throught the child windows of the dialog window
            EnumChildProc childProc = new EnumChildProc(EnumChildWindows);
            EnumChildWindows(parentHwnd, childProc, ref hWnd);

            return hWnd;
        }

        private static bool EnumChildWindows(IntPtr hWnd, ref IntPtr lParam)
        {
            if (enumChildClassName.Equals(GetClassName(hWnd)))
            {
                lParam = hWnd;
                return false;
            }
            return true;
        }

        internal static int GetNumberOfWindowsWithSubString(string windowTitle)
        {
            enumWindowSubtitle = windowTitle;
            enumIndexCount = 0;
            enumIndex = 1000;
            IntPtr hWnd = IntPtr.Zero;

            EnumWindowsProc windowProc = new EnumWindowsProc(EnumWindows);
            EnumWindows(windowProc, ref hWnd);

            return enumIndexCount;
        }

        internal static int GetWindowWithSubstring(string classSubTitle, int index, int indexCount, ref IntPtr hWnd)
        {
            //"Internet Explorer_TridentDlgFrame"
            enumWindowSubtitle = classSubTitle;
            enumIndexCount = indexCount;
            enumIndex = index;

            EnumWindowsProc windowProc = new EnumWindowsProc(EnumWindows);
            EnumWindows(windowProc, ref hWnd);


            return enumIndexCount;
        }

        private static bool EnumWindows(IntPtr hWnd, ref IntPtr lParam)
        {
            if (GetWindowText(hWnd).Contains(enumWindowSubtitle))
            {
                if (enumIndexCount == enumIndex)
                {
                    lParam = hWnd;
                    return false;
                }
                else
                {
                    enumIndexCount++;
                    return true;
                }
            }
            return true;
        }

        private static string GetClassName(IntPtr hwnd)
        {
            StringBuilder className = new StringBuilder(255);
            Int32 result = GetClassName(hwnd, className, className.MaxCapacity);

            if (result == 0)
                return String.Empty;

            return className.ToString();
        }

        private static string GetWindowText(IntPtr hwnd)
        {
            StringBuilder windowName = new StringBuilder(255);
            Int32 result = GetWindowText(hwnd, windowName, windowName.MaxCapacity);

            if (result == 0)
                return String.Empty;

            return windowName.ToString();
        }
    }
}
