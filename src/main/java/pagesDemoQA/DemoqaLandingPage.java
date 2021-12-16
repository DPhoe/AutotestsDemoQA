package pagesDemoQA;

import framework.elements.Button;
import org.openqa.selenium.By;
import framework.basePage.BasePage;

public class DemoqaLandingPage extends BasePage {


    public DemoqaLandingPage() {
        super(By.xpath("//img[contains(@class, 'banner')]"), "DemoQA banner on landing page");
    }

    private final Button alertWindowsFrameButton = new Button(By.xpath("//h5[contains(text(), 'lerts')]/ancestor::div[contains(@class,'mt-4')]"), "Alert windows and frame button");
    private final Button alertButton = new Button(By.xpath("//span[contains(text(),'lerts')]"), "Alert button");
    private final Button nestedFramesButton = new Button(By.xpath("//span[contains(text(), 'Nested')]/parent::li"), "Nested frames button");
    private final Button elementsButton = new Button(By.xpath("//h5[contains(text(), 'ments')]/ancestor::div[contains(@class,'mt-4')]"), "Elements button");
    private final Button webTablesButton = new Button(By.xpath("//span[contains(text(), 'Tables')]/parent::li"), "Web tables button");
    private final Button browserWindowsButton = new Button(By.xpath("//span[contains(text(),'indo')]"), "Browser window button");
    private final Button widgetsButton = new Button(By.xpath("//h5[contains(text(), 'gets')]/ancestor::div[contains(@class,'mt-4')]"), "Widgets button");
    private final Button sliderButton = new Button(By.xpath("//span[contains(text(),'lid')]/parent::li"), "Slider button");
    private final Button uploadDownloadButton = new Button(By.xpath("//span[contains(text(),'load')]/parent::li"), "Download upload button");

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
