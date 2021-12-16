package framework.baseElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import framework.utilities.ConfigManager;
import framework.utilities.driverFactory.DriverSingleton;
import framework.utilities.LoggerUtility;

import java.time.Duration;
import java.util.List;

public abstract class BaseElement {

    protected By locator;
    protected String name;

    protected BaseElement (By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    protected static WebElement findElement (By locator) {
        return DriverSingleton.getDriver().findElement(locator);
    }

    protected static  List<WebElement> findElements (By locator) {
        return DriverSingleton.getDriver().findElements(locator);
    }

    public static int getElementListSize (By locator){
        return findElements(locator).size();
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

    protected WebElement waitToBeVisible(WebElement element, String name) {
        LoggerUtility.log.info(name);
        new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    protected WebElement waitToBeClickable(WebElement element, String name) {
        LoggerUtility.log.info(name);
        new WebDriverWait(DriverSingleton.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWaitSec())).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

}
