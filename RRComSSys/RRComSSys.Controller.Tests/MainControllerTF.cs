using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;

namespace RRComSSys.Controller.Tests
{
    [TestFixture]
    public class MainControllerTF
    {
        MainController _controller;
        MockExcWindow _excView;

        [SetUp]
        public void SetUp()
        {
            _excView = new MockExcWindow();
            _controller = new MainController(_excView);
        }

        [Test]
        public void LoadGCMLFile()
        {
            
        }
    }
}
