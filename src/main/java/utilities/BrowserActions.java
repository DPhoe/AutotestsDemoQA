package utilities;


import java.time.Duration;

public class BrowserActions {

    public static void setWindowSize() {
        if (ConfigManager.getEnablePresetWindowSize()) {
            DriverSingleton.getDriver().manage().window().setSize(ConfigManager.getWindowSizes());
            DriverSingleton.getDriver().manage().window().setPosition(ConfigManager.getWindowPosition());
        }
    }

    public static void open(String url) {
        DriverSingleton.getDriver().get(url);
    }

    public static void windowMaximize() {
        if (ConfigManager.getWindowMaximize()) {
            DriverSingleton.getDriver().manage().window().maximize();
        }
    }

    public static void explicitWait () {
        DriverSingleton.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigManager.getExplicitWaitSec()));
    }

    public static void driverClose () {
        DriverSingleton.getDriver().close();
    }

    public static void driverQuit () {
        DriverSingleton.getDriver().quit();
    }

    public String getCurrentUTL () {
        return DriverSingleton.getDriver().getCurrentUrl();
    }

    public static void setImplicitWait () {
        DriverSingleton.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigManager.getImplicitlyWaitSec()));
    }

}
