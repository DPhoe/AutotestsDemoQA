package pages.pages;

import elements.baseElement.BaseElement;
import elements.elements.Alerts;
import elements.elements.Button;
import elements.elements.TextField;
import org.openqa.selenium.By;
import pages.basePage.BasePage;

public class DemoqaAlertsPage extends BasePage {

    private static final By alertForm = By.xpath("//span[contains(text(),'to see')]/../../../parent::div");
    private static final By simpleAlertButton = By.xpath("//button[@id='alertButton']");
    private static final By confirmAlertButton = By.xpath("//button[@id='confirmButton']");
    private static final By confirmResultField = By.xpath("//span[@id='confirmResult']");
    private static final By promptAlertButton = By.xpath("//button[@id='promtButton']");
    private static final By promptAlertResultField = By.xpath("//span[@id='promptResult']");

    public static boolean isAlertFormDisplayed() {
        return BaseElement.isDisplayed(alertForm, "Alert form");
    }

    public static void clickSimpleAlertButton() {
        Button.click(simpleAlertButton, "Click Button to see alert");
    }

    public static String getAlertText() {
        return Alerts.getAlertText("Get simple alert text");
    }

    public static void acceptAlert() {
        Alerts.acceptAlert("Accept simple alert");
    }

    public static boolean isSimpleAlertPresent() {
        return Alerts.isAlertPresent("Is simple alert present");
    }

    public static void clickConfirmAlertButton() {
        Button.click(confirmAlertButton, "On button click, confirm box will appear");
    }

    public static String getConfirmationText() {
        return TextField.getText(confirmResultField, "Get confirmation text from field");
    }

    public static void clickPromptAlertButton() {
        Button.click(promptAlertButton, "Click prompt alert button");
    }

    public static void enterTextIntoAlert (String text) {
        Alerts.sendTextToAlert(text, "Send random generated text to alert");
    }

    public static String getPromptResultFieldText() {
        return TextField.getText(promptAlertResultField, "Get prompt alert result from field");
    }
}
