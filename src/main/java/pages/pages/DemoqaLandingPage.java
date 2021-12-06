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

    public static boolean isDemoQABannerDisplayed () {
       return BasePage.isUniqueElementDisplayed(uniqueElement, "DemoQABanner");
    }

    public static void clickAlertFrameWindowsButton () {
        Button.click(alertWindowsFrameButton, "Alerts, Frame & Windows button");
    }

    public static void clickAlertsButton () {
        Button.click(alertButton, "Alerts button");
    }

    public static void clickNestedFramesButton () {
        Button.click(nestedFramesButton, "Clicked nested frames button");
    }

    public static void clickElementsButton() {
        Button.click(elementsButton, "Click elements button");
    }

    public static void clickWebTablesButton() {
        Button.click(webTablesButton, "Click web tables button");
    }

}
