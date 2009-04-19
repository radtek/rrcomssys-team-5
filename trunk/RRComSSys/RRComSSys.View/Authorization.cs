using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.View
{
    internal static class Authorization
    {
        static Dictionary<string,string> users = new Dictionary<string, string>();

        static Authorization()
        {
            users["Jean"] = "password";
            users["Marcelo"] = "password";
            users["Denis"] = "password";
            users["Harika"] = "password";
        }

        public static bool getUser(string username, string password)
        {
            KeyValuePair<string, string> pair = new KeyValuePair<string,string>(username, password);

            return users.Contains(pair);
        }
    }
}
