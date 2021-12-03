package pages.pages;

import elements.elements.Button;
import org.openqa.selenium.By;
import pages.basePage.BasePage;

public class DemoqaLandingPage extends BasePage {

    private static final By uniqueElement = By.xpath("//img[contains(@class, 'banner')]");
    private static final By alertWindowsFrameButton = By.xpath("//h5[contains(text(), 'lerts')]/../../parent::div");
    private static final By alertButton = By.xpath("//span[contains(text(),'lerts')]");

    public static boolean isDemoQABannerDisplayed () {
       return BasePage.isUniqueElementDisplayed(uniqueElement, "DemoQABanner");
    }

    public static void clickAlertFrameWindowsButton () {
        Button.click(alertWindowsFrameButton, "Alerts, Frame & Windows button");
    }

    public static void clickAlertsButton () {
        Button.click(alertButton, "Alerts button");
    }

}
