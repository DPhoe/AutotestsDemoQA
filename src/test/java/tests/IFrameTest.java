package tests;

import framework.baseTest.BaseTest;
import framework.frames.Frames;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesDemoQA.DemoqaLandingPage;
import pagesDemoQA.DemoqaNestedFramesPage;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;
import framework.utilities.TestDataManager;

import java.io.IOException;

public class IFrameTest extends BaseTest {

//    @Test
//    public void IFrameTest () throws IOException {
//        BrowserActions.open(ConfigManager.getURL());
//        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
//        DemoqaLandingPage.clickAlertFrameWindowsButton();
//        DemoqaLandingPage.clickNestedFramesButton();
//        Assert.assertTrue(demoqaNestedFramesPage.isUniqueElementDisplayed(), "Nested Frame form is not displayed");
//        Frames.switchToFrameByNameOrId("frame1", "Switch to parent frame");
//        Assert.assertEquals(DemoqaNestedFramesPage.getTextFromParentFrame(), "Parent frame", "Parent frame text don't match expected one");
//        Frames.switchToFrameByIndex(TestDataManager.getChildFrameIndex(), "Switch to child iframe by index" + TestDataManager.getChildFrameIndex());
//        Assert.assertEquals(DemoqaNestedFramesPage.getTextFromChildFrame(), "Child Iframe", "Child frame text don't match expected one");
//        Frames.switchToDefault("Switch to default page from frame");
//        DemoqaNestedFramesPage.clickFramesButton();
//        Frames.switchToFrameByNameOrId(TestDataManager.getIDOne(), "Switch iframe by Id: " + TestDataManager.getIDOne());
//        String frame1text = DemoqaNestedFramesPage.getTextFromFrame();
//        Frames.switchToDefault("Switch to default page from frame");
//        Frames.switchToFrameByNameOrId(TestDataManager.getIDTwo(), "Switch iframe by Id: " + TestDataManager.getIDTwo());
//        String frame2text = DemoqaNestedFramesPage.getTextFromFrame();
//        Assert.assertEquals(frame1text, frame2text, "Strings don't match");
//    }
}
