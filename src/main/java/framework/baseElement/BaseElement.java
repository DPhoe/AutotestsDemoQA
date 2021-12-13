package framework.baseElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import framework.utilities.ConfigManager;
import framework.utilities.DriverSingleton;
import framework.utilities.LoggerUtility;

import java.time.Duration;
import java.util.List;

public abstract class BaseElement {

    protected By locator;
    protected String name;

    public BaseElement (By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public static WebElement findElement (By locator) {
        return DriverSingleton.getDriver().findElement(locator);
    }

    public static  List<WebElement> findElements (By locator) {
        return DriverSingleton.getDriver().findElements(locator);
    }

    public void waitAndClick() {
        LoggerUtility.log.info(name);
        new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.visibilityOf(findElement(locator))).click();
    }

    public String getAttribute (String attribute, String name) {
        LoggerUtility.log.info(name);
        return findElement(locator).getAttribute(attribute);
    }

    public Boolean isDisplayed (By locator, String name) {
        LoggerUtility.log.info(name);
        return findElement(locator).isDisplayed();
    }

    public void hoverOver (By locator, String name) {
        LoggerUtility.log.info(name);
        Actions action = new Actions(DriverSingleton.getDriver());
        action.moveToElement(findElement(locator)).perform();
    }

    public WebElement waitElementToBeVisible(WebElement element, String name) {
        LoggerUtility.log.info(name);
        new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitElementToBeClickable(WebElement element, String name) {
        LoggerUtility.log.info(name);
        new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

}
