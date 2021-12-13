package pagesDemoQA;

import framework.baseElement.BaseElement;
import framework.elements.Button;
import framework.frames.Frames;
import framework.elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import framework.basePage.BasePage;
import framework.utilities.DriverSingleton;

public class DemoqaNestedFramesPage extends BasePage {


    public DemoqaNestedFramesPage(By locator, String name) {
        super(locator, name);
    }

    public final TextField parentFrameText = new TextField(By.xpath("//iframe[contains(@srcdoc, 'Child')]/parent::body"), "Parent frame text field");
    public final TextField parentChildText = new TextField(By.xpath("//p"), "Get frame text");
    public final Button framesButton = new Button(By.xpath("//span[text()='Frames']/parent::li"), "Frames button");
    public final TextField framesText = new TextField(By.xpath("//h1[@id='sampleHeading']"), "In frame text field");

}
