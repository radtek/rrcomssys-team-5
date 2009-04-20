using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;

namespace RRComSSys.TransformationEngine.Tests
{
    [TestFixture]
    public class SchemaTransformerTF
    {
        SchemaTransformer st = new SchemaTransformer();
        private const string XSLT_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.TransformationEngine\MappingMapToWXCML.xslt";
        private const string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.TransformationEngine.Tests\TestResources\AlternateWithWorkflow2.gcml";

        [SetUp]
        public void SetUp()
        {

        }

        [Test]
        public void TestTransformReturnsAWorkflow()
        {
            Workflow doc = st.GetObjectModel(GCML_FILE_PATH);
            Assert.AreNotEqual(doc, null);
        }
    }
}
