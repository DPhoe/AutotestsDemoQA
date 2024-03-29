package framework.frames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import framework.utilities.ConfigManager;
import framework.utilities.driverFactory.DriverSingleton;
import framework.utilities.LoggerUtility;

import java.time.Duration;

public class Frames{

    public static void switchToFrameByIndex(int index, String name) {
        LoggerUtility.log.info(name);
        new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(ConfigManager.getExplicitWaitSec()))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
    }

    public static void switchToFrameByNameOrId(String nameOrId, String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().frame(nameOrId);
    }

    public void switchToFrameByWebElement (WebElement element, String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().frame(element);
    }

    public static void switchToDefaultContent(String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().defaultContent();
    }
}
