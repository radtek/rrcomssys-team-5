using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.TransformationEngine;

namespace RRComSSys.WorkflowEngine
{
    public class IsAttached
    {
        private TransformationEngine.IsAttached isAttached = null;
        private WorkflowEngine.Person person = null;

        /// <summary>
        /// Initializes a new instance of the <see cref="IsAttached"/> class.
        /// </summary>
        /// <param name="anIsAttached">An is attached.</param>
        /// <param name="wfInstance">The wf instance.</param>
        public IsAttached(TransformationEngine.IsAttached anIsAttached, Workflow wfInstance)
        {
            isAttached = anIsAttached;
            AttachToPerson(wfInstance);
            
        }

        /// <summary>
        /// Attaches to person.
        /// </summary>
        /// <param name="wfInstance">The wf instance.</param>
        private void AttachToPerson(Workflow wfInstance)
        {
            TransformationEngine.Person aPerson = wfInstance.Person.Find(x => (x.personID.Equals(isAttached.fromPerson)));
            person = new WorkflowEngine.Person(aPerson);
        }

        /// <summary>
        /// Returns [is attached to] a Person.
        /// </summary>
        /// <returns></returns>
        public Person IsAttachedToPerson()
        {
            return person;
        }
    }
}
