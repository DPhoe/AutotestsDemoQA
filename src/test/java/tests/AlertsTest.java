package tests;

import framework.alerts.Alerts;
import framework.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;
import framework.utilities.RandomGenerator;

public class AlertsTest extends BaseTest {

    @Test
    public void AlertsTest () {;
        BrowserActions.open(ConfigManager.getURL());
        Assert.assertTrue(demoqaLandingPage.isUniqueElementDisplayed(), "Unique page element is not displayed");
        demoqaLandingPage.alertWindowsFrameButton.waitAndClick();
        demoqaLandingPage.alertButton.waitAndClick();
        Assert.assertTrue(demoqaAlertsPage.isUniqueElementDisplayed(), "Alert form is not displayed");
        demoqaAlertsPage.simpleAlertButton.waitAndClick();
        Assert.assertTrue(Alerts.isAlertPresent("Check is simple alert present"), "Alert is not present");
        Assert.assertEquals(Alerts.getAlertText("Get alert text"), "You clicked a button", "Alert text don't match");
        Alerts.acceptAlert("Accept alert");
        Assert.assertFalse(Alerts.isAlertPresent("Check is alert present"), "Alert is still present");
        demoqaAlertsPage.confirmAlertButton.waitAndClick();
        Assert.assertEquals(Alerts.getAlertText("Get alert text"),"Do you confirm action?", "Alert text don't match");
        Alerts.acceptAlert("Accept alert");
        Assert.assertTrue(demoqaAlertsPage.confirmResultField.getText().contains("Ok")
                && demoqaAlertsPage.confirmResultField.getText().contains("You selected"), "Confirmation text don't match");
        demoqaAlertsPage.promptAlertButton.waitAndClick();
        Assert.assertEquals(Alerts.getAlertText("Get alert text"),"Please enter your name");
        String text = RandomGenerator.getTimestamp();
        Alerts.sendTextToAlert(text, "Send random generated text to alert");
        Alerts.acceptAlert("Accept alert");
        Assert.assertTrue(demoqaAlertsPage.promptAlertResultField.getText().contains(text), "Result text don't match entered text");

    }
}
