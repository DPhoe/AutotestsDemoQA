package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.*;
import utilities.BrowserActions;
import utilities.ConfigManager;

public class HandlesTest extends BaseTest {

    @Test
    public void HandlesTest () {
        BrowserActions.open(ConfigManager.getURL());
        Assert.assertTrue(DemoqaLandingPage.isDemoQABannerDisplayed(), "Unique page element is not displayed");
        DemoqaLandingPage.clickAlertFrameWindowsButton();
        DemoqaLandingPage.clickBrowserWindowsButton();
        Assert.assertTrue(DemoqaBrowserWindowsPage.isBrowserWindowsFormDisplayed(), "Browser window form is not displayed");
        DemoqaBrowserWindowsPage.clickNewTabButton();
        BrowserActions.switchToTabWithContains("sample", "Switch to tab which contains 'sample'");
        Assert.assertTrue(DemoqaSamplePage.isSamplePageHeaderDisplayed(), "Sample page header is not displayed");
        BrowserActions.driverClose();
        BrowserActions.switchToTabWithContains("windows", "Switch to tab which contains 'windows'");
        Assert.assertTrue(DemoqaBrowserWindowsPage.isBrowserWindowsFormDisplayed(), "Browser window form is not displayed");
        DemoqaBrowserWindowsPage.clickElementsButton();
        DemoqaBrowserWindowsPage.clickLinksButton();
        Assert.assertTrue(DemoqaLinksPage.isBrowserWindowsFormDisplayed(),"Unique element is not displayed");
        String parentHandle = BrowserActions.getParentWindowHandle("Get parent window handle");
        DemoqaLinksPage.clickSimpleLink();
        BrowserActions.switchFromParentWindow(parentHandle, "Switch to another then parent window by handle");
        Assert.assertTrue(DemoqaLandingPage.isDemoQABannerDisplayed(), "Unique page element is not displayed");
        BrowserActions.switchToParentWindow(parentHandle, "Switch to parent window by handle");
        Assert.assertTrue(DemoqaLinksPage.isBrowserWindowsFormDisplayed(),"Unique element is not displayed");
    }
}
