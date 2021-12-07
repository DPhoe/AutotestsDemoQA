package elements.elements;

import elements.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigManager;
import utilities.DriverSingleton;
import utilities.LoggerUtility;

import java.time.Duration;

public class Frames extends BaseElement {
    public Frames(By locator, String name) {
        super(locator, name);
    }

    public static void switchToFrameByIndex(int index, String name) {
        LoggerUtility.log.info(name);
        new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(ConfigManager.getExplicitWaitSec()))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
    }

    public static void switchToFrameByNameOrId(String nameOrId, String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().frame(nameOrId);
    }

    public static void switchToFrameByWebElement (WebElement element, String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().frame(element);
    }

    public static void switchToDefault (String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().defaultContent();
    }
}
