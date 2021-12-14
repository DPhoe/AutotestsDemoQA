package pagesDemoQA;

import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaAlertsPage extends BasePage {

    public DemoqaAlertsPage(By locator, String name) {
        super(locator, name);
    }

    private Button simpleAlertButton = new Button(By.xpath("//button[@id='alertButton']"), "Simple alert button");
    private Button confirmAlertButton = new Button(By.xpath("//button[@id='confirmButton']"), "Confirm alert button");
    private TextField confirmResultField = new TextField(By.xpath("//span[@id='confirmResult']"), "Confirm result text field");
    private Button promptAlertButton = new Button(By.xpath("//button[@id='promtButton']"), "Prompt alert button");
    private TextField promptAlertResultField = new TextField(By.xpath("//span[@id='promptResult']"), "Prompt alert result text field");

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
