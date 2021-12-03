package elements.elements;

import elements.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import utilities.DriverSingleton;

public class Alerts extends BaseElement {
    public Alerts(By locator, String name) {
        super(locator, name);
    }

    public static String getAlertText (String name) {
        return DriverSingleton.getDriver().switchTo().alert().getText();
    }

    public static void acceptAlert (String name) {
        DriverSingleton.getDriver().switchTo().alert().accept();
    }

    public static void dismissAlert (String name) {
        DriverSingleton.getDriver().switchTo().alert().dismiss();
    }

    public static void sendTextToAlert (String text, String name) {
        DriverSingleton.getDriver().switchTo().alert().sendKeys(text);
    }

    public static boolean isAlertPresent (String name) {
        {
            try
            {
                DriverSingleton.getDriver().switchTo().alert();
                return true;
            }
            catch (NoAlertPresentException Ex)
            {
                return false;
            }
        }
    }
}
