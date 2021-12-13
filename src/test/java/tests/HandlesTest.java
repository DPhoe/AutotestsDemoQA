package tests;

import framework.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;
import pagesDemoQA.DemoqaBrowserWindowsPage;
import pagesDemoQA.DemoqaLandingPage;
import pagesDemoQA.DemoqaLinksPage;

public class HandlesTest extends BaseTest {

//    @Test
//    public void HandlesTest () {
//        BrowserActions.open(ConfigManager.getURL());
//        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
//        DemoqaLandingPage.clickAlertFrameWindowsButton();
//        DemoqaLandingPage.clickBrowserWindowsButton();
//        Assert.assertTrue(demoqaBrowserWindowsPage.isUniqueElementDisplayed(), "Browser window form is not displayed");
//        DemoqaBrowserWindowsPage.clickNewTabButton();
//        BrowserActions.switchToTabWithContains("sample", "Switch to tab which contains 'sample'");
//        Assert.assertTrue(demoqaSamplePage.isUniqueElementDisplayed(), "Sample page header is not displayed");
//        BrowserActions.driverClose();
//        BrowserActions.switchToTabWithContains("windows", "Switch to tab which contains 'windows'");
//        Assert.assertTrue(demoqaBrowserWindowsPage.isUniqueElementDisplayed(), "Browser window form is not displayed");
//        DemoqaBrowserWindowsPage.clickElementsButton();
//        DemoqaBrowserWindowsPage.clickLinksButton();
//        Assert.assertTrue(demoqaLinksPage.isUniqueElementDisplayed(),"Unique element is not displayed");
//        String parentHandle = BrowserActions.getParentWindowHandle("Get parent window handle");
//        DemoqaLinksPage.clickSimpleLink();
//        BrowserActions.switchFromParentWindow(parentHandle, "Switch to another then parent window by handle");
//        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
//        BrowserActions.switchToParentWindow(parentHandle, "Switch to parent window by handle");
//        Assert.assertTrue(demoqaLinksPage.isUniqueElementDisplayed(),"Unique element is not displayed");
//    }
}
