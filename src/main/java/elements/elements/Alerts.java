package elements.elements;

import elements.baseElement.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import utilities.DriverSingleton;
import utilities.LoggerUtility;

public class Alerts{

    public static String getAlertText (String name) {
        LoggerUtility.log.info(name);
        return DriverSingleton.getDriver().switchTo().alert().getText();
    }

    public static void acceptAlert (String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().alert().accept();
    }

    public static void dismissAlert (String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().alert().dismiss();
    }

    public static void sendTextToAlert (String text, String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().alert().sendKeys(text);
    }

    public static boolean isAlertPresent (String name) {
        LoggerUtility.log.info(name);
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
