package tests;

import framework.alerts.Alerts;
import framework.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;
import framework.utilities.RandomGenerator;
import pagesDemoQA.DemoqaAlertsPage;
import pagesDemoQA.DemoqaLandingPage;

public class AlertsTest extends BaseTest {

    @Test (timeOut = 20000)
    public void AlertsTest () {;
        BrowserActions.open(ConfigManager.getURL());
        DemoqaLandingPage demoqaLandingPage =
                new DemoqaLandingPage();
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.getAlertWindowsFrameButton().waitAndClick();
        demoqaLandingPage.getAlertButton().waitAndClick();
        DemoqaAlertsPage demoqaAlertsPage =
                new DemoqaAlertsPage();
        Assert.assertTrue(demoqaAlertsPage.isUniqueElementDisplayed(), "Alert form is not displayed");
        demoqaAlertsPage.getSimpleAlertButton().waitAndClick();
        Assert.assertTrue(Alerts.isAlertPresent("Check is simple alert present"), "Alert is not present");
        Assert.assertEquals(Alerts.getAlertText("Get alert text"), "You clicked a button", "Alert text don't match");
        Assert.assertTrue(Alerts.isAlertPresent("Is simple alert present"));
        Alerts.acceptAlert();
        Assert.assertFalse(Alerts.isAlertPresent("Check is alert present"), "Alert is still present");
        demoqaAlertsPage.getConfirmAlertButton().waitAndClick();
        Assert.assertEquals(Alerts.getAlertText("Get alert text"),"Do you confirm action?", "Alert text don't match");
        Alerts.acceptAlert();
        Assert.assertTrue(demoqaAlertsPage.getConfirmResultField().getText().contains("Ok")
                && demoqaAlertsPage.getConfirmResultField().getText().contains("You selected"), "Confirmation text don't match");
        demoqaAlertsPage.getPromptAlertButton().waitAndClick();
        Assert.assertEquals(Alerts.getAlertText("Get alert text"),"Please enter your name");
        String text = RandomGenerator.getTimestamp();
        Alerts.sendTextToAlert(text, "Send random generated text to alert");
        Alerts.acceptAlert();
        Assert.assertTrue(demoqaAlertsPage.getPromptAlertResultField().getText().contains(text), "Result text don't match entered text");

    }
}
