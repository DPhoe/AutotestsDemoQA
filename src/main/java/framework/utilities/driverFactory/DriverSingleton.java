package framework.utilities.driverFactory;

import framework.utilities.LoggerUtility;
import org.openqa.selenium.WebDriver;

public class DriverSingleton {

    static WebDriver driver;

    private DriverSingleton() {}

    public static void setDriverToNull() {
        LoggerUtility.log.info("Set driver to null");
        driver = null;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver =  BrowserFactory.createWebDriver();
        }
        return driver;
    }

    public static void driverQuit() {
        LoggerUtility.log.info("Quiting driver");
        DriverSingleton.getDriver().quit();
    }
}

