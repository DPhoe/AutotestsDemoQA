package framework.alerts;

import org.openqa.selenium.NoAlertPresentException;
import framework.utilities.driverFactory.DriverSingleton;
import framework.utilities.LoggerUtility;

public class Alerts{

    public static String getAlertText (String name) {
        LoggerUtility.log.info(name);
        return DriverSingleton.getDriver().switchTo().alert().getText();
    }

    public static void acceptAlert () {
        LoggerUtility.log.info("Accept alert");
        DriverSingleton.getDriver().switchTo().alert().accept();
    }

    public static void dismissAlert () {
        LoggerUtility.log.info("Dismiss alert");
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
