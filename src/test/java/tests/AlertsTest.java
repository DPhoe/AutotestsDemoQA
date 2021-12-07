package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.DemoqaAlertsPage;
import pages.pages.DemoqaLandingPage;
import utilities.BrowserActions;
import utilities.ConfigManager;
import utilities.RandomGenerator;

import java.net.URL;

public class AlertsTest extends BaseTest {

    @Test
    public void AlertsTest () {
        BrowserActions.open(ConfigManager.getURL());
        Assert.assertTrue(DemoqaLandingPage.isDemoQABannerDisplayed(), "Unique page element is not displayed");
        DemoqaLandingPage.clickAlertFrameWindowsButton();
        DemoqaLandingPage.clickAlertsButton();
        Assert.assertTrue(DemoqaAlertsPage.isAlertFormDisplayed(), "Alert form is not displayed");
        DemoqaAlertsPage.clickSimpleAlertButton();
        Assert.assertEquals(DemoqaAlertsPage.getAlertText(), "You clicked a button", "Alert text don't match");
        DemoqaAlertsPage.acceptAlert();
        Assert.assertFalse(DemoqaAlertsPage.isSimpleAlertPresent(), "Alert is still present");
        DemoqaAlertsPage.clickConfirmAlertButton();
        Assert.assertEquals(DemoqaAlertsPage.getAlertText(),"Do you confirm action?", "Alert text don't match");
        DemoqaAlertsPage.acceptAlert();
        Assert.assertTrue(DemoqaAlertsPage.getConfirmationText().contains("Ok")
                && DemoqaAlertsPage.getConfirmationText().contains("You selected"), "Confirmation text don't match");
        DemoqaAlertsPage.clickPromptAlertButton();
        Assert.assertEquals(DemoqaAlertsPage.getAlertText(),"Please enter your name");
        String text = RandomGenerator.getTimestamp();
        DemoqaAlertsPage.enterTextIntoAlert(text);
        DemoqaAlertsPage.acceptAlert();
        Assert.assertTrue(DemoqaAlertsPage.getPromptResultFieldText().contains(text), "Result text don't match entered text");

    }
}
