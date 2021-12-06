package pages.pages;

import elements.elements.Button;
import org.openqa.selenium.By;
import pages.basePage.BasePage;

public class DemoqaLinksPage extends BasePage {

    private static final By uniqueElement = By.xpath("//div[@id='linkWrapper']");
    private static final By simpleLink = By.xpath("//a[@id='simpleLink']");

    public static boolean isBrowserWindowsFormDisplayed () {
        return BasePage.isUniqueElementDisplayed(uniqueElement, "Check is link wrapper displayed");
    }

    public static void clickSimpleLink () {
        Button.click(simpleLink, "Click Home link");
    }
}
