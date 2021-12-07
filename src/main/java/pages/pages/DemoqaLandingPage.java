package pages.pages;

import elements.elements.Button;
import org.openqa.selenium.By;
import pages.basePage.BasePage;

public class DemoqaLandingPage extends BasePage {

    private static final By uniqueElement = By.xpath("//img[contains(@class, 'banner')]");
    private static final By alertWindowsFrameButton = By.xpath("//h5[contains(text(), 'lerts')]/../../parent::div");
    private static final By alertButton = By.xpath("//span[contains(text(),'lerts')]");
    private static final By nestedFramesButton = By.xpath("//span[contains(text(), 'Nested')]/parent::li");
    private static final By elementsButton = By.xpath("//h5[contains(text(), 'ments')]/../../parent::div");
    private static final By webTablesButton = By.xpath("//span[contains(text(), 'Tables')]/parent::li");
    private static final By browserWindowsButton = By.xpath("//span[contains(text(),'indo')]");
    private static final By widgetsButton = By.xpath("//h5[contains(text(), 'gets')]/../../parent::div");
    private static final By sliderButton = By.xpath("//span[contains(text(),'lid')]/parent::li");
    private static final By uploadDownloadButton = By.xpath("//span[contains(text(),'load')]/parent::li");

    public static boolean isDemoQABannerDisplayed () {
       return BasePage.isUniqueElementDisplayed(uniqueElement, "Check is DemoQA banner displayed");
    }

    public static void clickAlertFrameWindowsButton () {
        Button.click(alertWindowsFrameButton, "Click alerts, Frame & Windows button");
    }

    public static void clickAlertsButton () {
        Button.click(alertButton, "Click alerts button");
    }

    public static void clickNestedFramesButton () {
        Button.click(nestedFramesButton, "Click nested frames button");
    }

    public static void clickElementsButton() {
        Button.click(elementsButton, "Click elements button");
    }

    public static void clickWebTablesButton() {
        Button.click(webTablesButton, "Click web tables button");
    }

    public static void clickBrowserWindowsButton() {
        Button.click(browserWindowsButton, "Click browser windows button");
    }

    public static void clickWidgetsButton() {
        Button.click(widgetsButton, "Click widgets button");
    }

    public static void clickSliderButton() {
        Button.click(sliderButton, "Click slider button");
    }

    public static void clickUploadDownloadButton() {
        Button.click(uploadDownloadButton, "Click download upload button");
    }
}
