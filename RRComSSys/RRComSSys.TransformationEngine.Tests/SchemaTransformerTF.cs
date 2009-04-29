using System;
using MbUnit.Framework;

namespace RRComSSys.TransformationEngine.Tests
{
    [TestFixture]
    public class SchemaTransformerTF
    {        
       // private const string XSLT_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.TransformationEngine\MappingMapToWXCML.xslt";
       // private const string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.TransformationEngine.Tests\TestResources\AlternateWithWorkflow2.gcml";

        private const string XSLT_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\RRComSSys\RRComSSys.TransformationEngine\MappingMapToWXCML.xslt";
        private const string GCML_FILE_PATH = @"C:\Documents and Settings\jeanr\Desktop\RRComSSysTeam5\GCML Scenarios\AlternateWithWorkflow2.gcml";

        [SetUp]
        public void SetUp()
        {

        }

        [Test]
        public void TestTransformReturnsAWorkflow()
        {
            Workflow doc = SchemaTransformer.GetObjectModel(GCML_FILE_PATH);
            Assert.AreNotEqual(doc, null);
            Exception exc;
            doc.SaveToFile(@"C:\WXCML.wxcml", out exc);
        }
    }
}
