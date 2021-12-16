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

    @Test
    public void IFrameTest () throws IOException {
        BrowserActions.open(ConfigManager.getURL());
        DemoqaLandingPage demoqaLandingPage =
                new DemoqaLandingPage();
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.getAlertWindowsFrameButton().waitAndClick();
        demoqaLandingPage.getNestedFramesButton().waitAndClick();
        DemoqaNestedFramesPage demoqaNestedFramesPage =
                new DemoqaNestedFramesPage();
        Assert.assertTrue(demoqaNestedFramesPage.isUniqueElementDisplayed(), "Nested Frame form is not displayed");
        Frames.switchToFrameByNameOrId("frame1", "Switch to parent frame");
        Assert.assertEquals(demoqaNestedFramesPage.getParentFrameText().getText(),
                "Parent frame", "Parent frame text don't match expected one");
        Frames.switchToFrameByIndex(TestDataManager.getChildFrameIndex(),
                "Switch to child iframe by index" + TestDataManager.getChildFrameIndex());
        Assert.assertEquals(demoqaNestedFramesPage.getParentChildText().getText(),
                "Child Iframe", "Child frame text don't match expected one");
        Frames.switchToDefaultContent("Switch to default page from frame");
        demoqaNestedFramesPage.getFramesButton().waitAndClick();
        Frames.switchToFrameByNameOrId(TestDataManager.getIDOne(), "Switch iframe by Id: " + TestDataManager.getIDOne());
        String frame1text = demoqaNestedFramesPage.getFramesText().getText();
        Frames.switchToDefaultContent("Switch to default page from frame");
        Frames.switchToFrameByNameOrId(TestDataManager.getIDTwo(), "Switch iframe by Id: " + TestDataManager.getIDTwo());
        String frame2text = demoqaNestedFramesPage.getFramesText().getText();
        Assert.assertEquals(frame1text, frame2text, "Strings don't match");
    }
}
