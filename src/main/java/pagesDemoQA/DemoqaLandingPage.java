package pagesDemoQA;

import framework.elements.Button;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaLandingPage extends BasePage {


    public DemoqaLandingPage(By locator, String name) {
        super(locator, name);
    }

    private Button alertWindowsFrameButton = new Button(By.xpath("//h5[contains(text(), 'lerts')]/ancestor::div[contains(@class,'mt-4')]"), "Alert windows and frame button");
    private Button alertButton = new Button(By.xpath("//span[contains(text(),'lerts')]"), "Alert button");
    private Button nestedFramesButton = new Button(By.xpath("//span[contains(text(), 'Nested')]/parent::li"), "Nested frames button");
    private Button elementsButton = new Button(By.xpath("//h5[contains(text(), 'ments')]/ancestor::div[contains(@class,'mt-4')]"), "Elements button");
    private Button webTablesButton = new Button(By.xpath("//span[contains(text(), 'Tables')]/parent::li"), "Web tables button");
    private Button browserWindowsButton = new Button(By.xpath("//span[contains(text(),'indo')]"), "Browser window button");
    private Button widgetsButton = new Button(By.xpath("//h5[contains(text(), 'gets')]/ancestor::div[contains(@class,'mt-4')]"), "Widgets button");
    private Button sliderButton = new Button(By.xpath("//span[contains(text(),'lid')]/parent::li"), "Slider button");
    private Button uploadDownloadButton = new Button(By.xpath("//span[contains(text(),'load')]/parent::li"), "Download upload button");

    public Button getAlertWindowsFrameButton() {
        return alertWindowsFrameButton;
    }

    public Button getAlertButton() {
        return alertButton;
    }

    public Button getNestedFramesButton() {
        return nestedFramesButton;
    }

    public Button getElementsButton() {
        return elementsButton;
    }

    public Button getWebTablesButton() {
        return webTablesButton;
    }

    public Button getBrowserWindowsButton() {
        return browserWindowsButton;
    }

    public Button getWidgetsButton() {
        return widgetsButton;
    }

    public Button getSliderButton() {
        return sliderButton;
    }

    public Button getUploadDownloadButton() {
        return uploadDownloadButton;
    }
}
