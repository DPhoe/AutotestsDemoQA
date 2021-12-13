package pagesDemoQA;

import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaAlertsPage extends BasePage {

    public DemoqaAlertsPage(By locator, String name) {
        super(locator, name);
    }

    public final Button simpleAlertButton = new Button(By.xpath("//button[@id='alertButton']"), "Simple alert button");
    public final Button confirmAlertButton = new Button(By.xpath("//button[@id='confirmButton']"), "Confirm alert button");
    public final TextField confirmResultField = new TextField(By.xpath("//span[@id='confirmResult']"), "Confirm result text field");
    public final Button promptAlertButton = new Button(By.xpath("//button[@id='promtButton']"), "Prompt alert button");
    public final TextField promptAlertResultField = new TextField(By.xpath("//span[@id='promptResult']"), "Prompt alert result text field");

}
