package utilities;


import java.time.Duration;

public class BrowserActions {

    public static void setWindowSize() {
        if (ConfigManager.getPresetWindowSize()) {
            DriverSingleton.getDriver().manage().window().setSize(ConfigManager.getWindowSizes());
            DriverSingleton.getDriver().manage().window().setPosition(ConfigManager.getWindowPosition());
        }
    }

    public static void open(String url) {
        DriverSingleton.getDriver().get(url);
    }

    public static void driverMaximize () {
        if (ConfigManager.getWindowMaximize()) {
            DriverSingleton.getDriver().manage().window().maximize();
        }
    }

    public static void implicitWait () {
        DriverSingleton.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigManager.getExplicitWaitSec()));
    }

}
