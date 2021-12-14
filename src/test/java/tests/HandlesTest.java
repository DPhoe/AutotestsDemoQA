package tests;

import framework.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;

public class HandlesTest extends BaseTest {

    @Test
    public void HandlesTest () {
        BrowserActions.open(ConfigManager.getURL());
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.getAlertWindowsFrameButton().waitAndClick();
        demoqaLandingPage.getBrowserWindowsButton().waitAndClick();
        Assert.assertTrue(demoqaBrowserWindowsPage.isUniqueElementDisplayed(), "Browser window form is not displayed");
        demoqaBrowserWindowsPage.getNewTabButton().waitAndClick();
        BrowserActions.switchToTabWithContains("sample", "Switch to tab which contains 'sample'");
        Assert.assertTrue(demoqaSamplePage.isUniqueElementDisplayed(), "Sample page header is not displayed");
        BrowserActions.driverClose();
        BrowserActions.switchToTabWithContains("windows", "Switch to tab which contains 'windows'");
        Assert.assertTrue(demoqaBrowserWindowsPage.isUniqueElementDisplayed(), "Browser window form is not displayed");
        demoqaBrowserWindowsPage.getElementsButton().waitAndClick();
        demoqaBrowserWindowsPage.getLinksButton().waitAndClick();
        Assert.assertTrue(demoqaLinksPage.isUniqueElementDisplayed(),"Unique element is not displayed");
        String parentHandle = BrowserActions.getParentWindowHandle("Get parent window handle");
        demoqaLinksPage.getSimpleLink().waitAndClick();
        BrowserActions.switchFromParentWindow(parentHandle, "Switch to another then parent window by handle");
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        BrowserActions.switchToParentWindow(parentHandle, "Switch to parent window by handle");
        Assert.assertTrue(demoqaLinksPage.isUniqueElementDisplayed(),"Unique element is not displayed");
    }
}
