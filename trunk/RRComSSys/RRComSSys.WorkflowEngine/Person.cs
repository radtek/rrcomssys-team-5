using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.WorkflowEngine
{
    public class Person
    {
        #region Properties
        private TransformationEngine.Person person = null;
  

        public string PersonID
        {
            get
            {
                return person.personID;
            }
        }

        public string Name
        {
            get
            {
                return person.personName;
            }
        }

        public string Role
        {
            get
            {
                return person.personRole;
            }
        }
        #endregion

        public Person(TransformationEngine.Person aPerson)
        {
            person = aPerson;
        }
    }
}
