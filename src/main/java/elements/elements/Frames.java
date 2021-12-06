package elements.elements;

import elements.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.DriverSingleton;
import utilities.LoggerUtility;

public class Frames extends BaseElement {
    public Frames(By locator, String name) {
        super(locator, name);
    }

    public static void switchToFrameByIndex(int index, String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().frame(index);
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
