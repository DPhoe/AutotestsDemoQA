package pagesDemoQA;

import framework.elements.Button;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaLandingPage extends BasePage {


    public DemoqaLandingPage(By locator, String name) {
        super(locator, name);
    }

    public final Button alertWindowsFrameButton = new Button(By.xpath("//h5[contains(text(), 'lerts')]/../../parent::div"), "Alert windows and frame button");
    public final Button alertButton = new Button(By.xpath("//span[contains(text(),'lerts')]"), "Alert button");
    public final Button nestedFramesButton = new Button(By.xpath("//span[contains(text(), 'Nested')]/parent::li"), "Nested frames button");
    public final Button elementsButton = new Button(By.xpath("//h5[contains(text(), 'ments')]/../../parent::div"), "Elements button");
    public final Button webTablesButton = new Button(By.xpath("//span[contains(text(), 'Tables')]/parent::li"), "Web tables button");
    public final Button browserWindowsButton = new Button(By.xpath("//span[contains(text(),'indo')]"), "Browser window button");
    public final Button widgetsButton = new Button(By.xpath("//h5[contains(text(), 'gets')]/../../parent::div"), "Widgets button");
    public final Button sliderButton = new Button(By.xpath("//span[contains(text(),'lid')]/parent::li"), "Slider button");
    public final Button uploadDownloadButton = new Button(By.xpath("//span[contains(text(),'load')]/parent::li"), "Download upload button");

}
