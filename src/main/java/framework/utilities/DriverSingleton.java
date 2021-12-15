package framework.utilities;

import org.openqa.selenium.WebDriver;

public class DriverSingleton {

    protected static WebDriver driver;

    protected DriverSingleton() {
    }

    public static void setDriverToNull() {
        driver = null;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver =  BrowserFactory.createWebDriver();
        }
        return driver;
    }
}

