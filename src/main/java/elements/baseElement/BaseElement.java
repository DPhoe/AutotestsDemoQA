package elements.baseElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigManager;
import utilities.DriverSingleton;

import java.time.Duration;
import java.util.List;

public class BaseElement {

    public BaseElement (By locator, String name) {}

    public static  WebElement findElement (By locator) {
        return DriverSingleton.getDriver().findElement(locator);
    }

    public static List<WebElement> findElements (By locator) {
        return DriverSingleton.getDriver().findElements(locator);
    }

    public static void click(By locator, String name) {
        new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.visibilityOf(findElement(locator))).click();
    }

    public static void getAttribute (By locator, String attribute, String name) {
        findElement(locator).getAttribute(attribute);
    }

    public static Boolean isDisplayed (By locator, String name) {
        return findElement(locator).isDisplayed();
    }

    public static void hoverOver (By locator, String name) {
        Actions action = new Actions(DriverSingleton.getDriver());
        action.moveToElement(findElement(locator)).perform();
    }

    public static WebElement waitElementToBeVisible(WebElement element, String name) {
        new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public static WebElement waitElementToBeClickable(WebElement element, String name) {
        new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }


}
