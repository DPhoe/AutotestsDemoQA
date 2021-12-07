package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.DemoqaLandingPage;
import pages.pages.DemoqaNestedFramesPage;
import utilities.BrowserActions;
import utilities.ConfigManager;
import utilities.TestDataManager;

import java.io.IOException;

public class IFrameTest extends baseTest.BaseTest {

    @Test
    public void IFrameTest () throws IOException {
        BrowserActions.open(ConfigManager.getURL());
        Assert.assertTrue(DemoqaLandingPage.isDemoQABannerDisplayed(), "Unique page element is not displayed");
        DemoqaLandingPage.clickAlertFrameWindowsButton();
        DemoqaLandingPage.clickNestedFramesButton();
        Assert.assertTrue(DemoqaNestedFramesPage.isNestedFrameFromDisplayed(), "Nested Frame form is not displayed");
        DemoqaNestedFramesPage.switchToParentFrame();
        Assert.assertEquals(DemoqaNestedFramesPage.getTextFromParentFrame(), "Parent frame", "Parent frame text don't match expected one");
        DemoqaNestedFramesPage.switchToChildFrame(TestDataManager.getChildFrameIndex());
        Assert.assertEquals(DemoqaNestedFramesPage.getTextFromChildFrame(), "Child Iframe", "Child frame text don't match expected one");
        DemoqaNestedFramesPage.switchToDefaultContent();
        DemoqaNestedFramesPage.clickFramesButton();
        DemoqaNestedFramesPage.switchToFrameById(TestDataManager.getIndexOne());
        String frame1text = DemoqaNestedFramesPage.getTextFromFrame();
        DemoqaNestedFramesPage.switchToDefaultContent();
        DemoqaNestedFramesPage.switchToFrameById(TestDataManager.getIndexTwo());
        String frame2text = DemoqaNestedFramesPage.getTextFromFrame();
        Assert.assertEquals(frame1text, frame2text, "Strings don't match");
    }
}
