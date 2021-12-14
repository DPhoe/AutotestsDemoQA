package pagesDemoQA;

import framework.elements.Button;
import framework.elements.TextField;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaNestedFramesPage extends BasePage {


    public DemoqaNestedFramesPage(By locator, String name) {
        super(locator, name);
    }

    private TextField parentFrameText = new TextField(By.xpath("//iframe[contains(@srcdoc, 'Child')]/parent::body"), "Parent frame text field");
    private TextField parentChildText = new TextField(By.xpath("//p"), "Get frame text");
    private Button framesButton = new Button(By.xpath("//span[text()='Frames']/parent::li"), "Frames button");
    private TextField framesText = new TextField(By.xpath("//h1[@id='sampleHeading']"), "In frame text field");

    public TextField getParentFrameText() {
        return parentFrameText;
    }

    public TextField getParentChildText() {
        return parentChildText;
    }

    public Button getFramesButton() {
        return framesButton;
    }

    public TextField getFramesText() {
        return framesText;
    }
}
