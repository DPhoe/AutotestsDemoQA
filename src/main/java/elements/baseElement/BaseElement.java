package elements.baseElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.DriverSingleton;

public class BaseElement {

    public BaseElement (By locator, String name) {}

    public static  WebElement findElement (By locator) {
        return DriverSingleton.getDriver().findElement(locator);
    }

    public static void click(By locator, String name) {
        findElement(locator).click();
    }

    public static void getAttribute (By locator, String attribute) {
        DriverSingleton.getDriver().findElement(locator).getAttribute(attribute);
    }

    public static Boolean isDisplayed (By locator) {
        return DriverSingleton.getDriver().findElement(locator).isDisplayed();
    }


}
