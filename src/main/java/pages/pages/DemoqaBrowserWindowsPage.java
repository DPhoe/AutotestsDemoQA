package pages.pages;

import elements.elements.Button;
import org.openqa.selenium.By;
import pages.basePage.BasePage;

public class DemoqaBrowserWindowsPage extends BasePage {

    private static final By uniqueElement = By.xpath("//div[@id='browserWindows']");
    private static final By newTabButton = By.xpath("//button[@id='tabButton']");
    private static final By newWindowButton = By.xpath("//button[@id='windowButton']");
    private static final By newWindowMessageButton = By.xpath("//button[@id='messageWindowButton']");
    private static final By elementsButton = By.xpath("//div[contains(text(),'men')]/parent::div");
    private static final By linksButton = By.xpath("//span[text()='Links']");

    public static boolean isBrowserWindowsFormDisplayed () {
        return BasePage.isUniqueElementDisplayed(uniqueElement, "Check is browser windows form displayed");
    }

    public static void clickNewTabButton() {
        Button.click(newTabButton, "Click new tab button");
    }

    public static void clickNewWindowButton() {
        Button.click(newWindowButton, "Click new window button");
    }

    public static void clickNewWindowMessageButton() {
        Button.click(newWindowMessageButton, "Click window message button");
    }

    public static void clickElementsButton() {
        Button.click(elementsButton, "Click elements button");
    }

    public static void clickLinksButton() {
        Button.click(linksButton, "Click links button");
    }

}
