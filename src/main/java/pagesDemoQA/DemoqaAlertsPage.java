package pagesDemoQA;

import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaAlertsPage extends BasePage {

    public DemoqaAlertsPage() {
        super(By.xpath("//span[contains(text(),'to see')]/ancestor::div[contains(@class, '12')]"), "Alerts form");
    }

    private final Button simpleAlertButton = new Button(By.xpath("//button[@id='alertButton']"), "Simple alert button");
    private final Button confirmAlertButton = new Button(By.xpath("//button[@id='confirmButton']"), "Confirm alert button");
    private final TextField confirmResultField = new TextField(By.xpath("//span[@id='confirmResult']"), "Confirm result text field");
    private final Button promptAlertButton = new Button(By.xpath("//button[@id='promtButton']"), "Prompt alert button");
    private final TextField promptAlertResultField = new TextField(By.xpath("//span[@id='promptResult']"), "Prompt alert result text field");

    public Button getSimpleAlertButton() {
        return simpleAlertButton;
    }

    public Button getConfirmAlertButton() {
        return confirmAlertButton;
    }

    public TextField getConfirmResultField() {
        return confirmResultField;
    }

    public Button getPromptAlertButton() {
        return promptAlertButton;
    }

    public TextField getPromptAlertResultField() {
        return promptAlertResultField;
    }
}
