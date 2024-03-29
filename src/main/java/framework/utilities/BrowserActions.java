package framework.utilities;

import framework.utilities.driverFactory.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.Set;

public class BrowserActions {

    public static void setWindowSize() {
        if (ConfigManager.getEnablePresetWindowSize()) {
            LoggerUtility.log.info("Set browser window size: " + ConfigManager.getWindowSizes() + "and position: " + ConfigManager.getWindowPosition());
        }
        if (ConfigManager.getEnablePresetWindowSize()) {
            DriverSingleton.getDriver().manage().window().setSize(ConfigManager.getWindowSizes());
            DriverSingleton.getDriver().manage().window().setPosition(ConfigManager.getWindowPosition());
        }
    }

    public static void open(String url) {
        LoggerUtility.log.info("Opening page with URL: " + url);
        DriverSingleton.getDriver().get(url);
    }

    public static void windowMaximize() {
        LoggerUtility.log.info("Maximize browser window");
        if (ConfigManager.getWindowMaximize()) {
            DriverSingleton.getDriver().manage().window().maximize();
        }
    }

    public static void driverClose() {
        DriverSingleton.getDriver().close();
    }

    public static String getCurrentUTL(String name) {
        LoggerUtility.log.info(name);
        return DriverSingleton.getDriver().getCurrentUrl();
    }

    public static void setImplicitWait() {
        DriverSingleton.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigManager.getImplicitlyWaitSec()));
    }

    public static void switchToTabWithContains(String contains, String name) {
        LoggerUtility.log.info(name);
        Set<String> windows = DriverSingleton.getDriver().getWindowHandles();
        for (String window : windows) {
            DriverSingleton.getDriver().switchTo().window(window);
            if(DriverSingleton.getDriver().getTitle().contains(contains)) {
                break;
            }
        }

    }

    public static String getParentWindowHandle(String name) {
        LoggerUtility.log.info(name);
        String parentWindowHandle = DriverSingleton.getDriver().getWindowHandle();
        return parentWindowHandle;
    }

    public static void switchToParentWindow(String handle, String name) {
        LoggerUtility.log.info(name);
        DriverSingleton.getDriver().switchTo().window(handle);
    }

    public static void switchFromParentWindow(String parentWindow, String name) {
        LoggerUtility.log.info(name);
        Set<String> windows = DriverSingleton.getDriver().getWindowHandles();
        for (String window : windows) {
            DriverSingleton.getDriver().switchTo().window(window);
            if(DriverSingleton.getDriver().getWindowHandle().equals(parentWindow)) {
                continue;
            }
            else break;
        }

    }

    public static void scroll(int value) {
        LoggerUtility.log.info("Scrolled with JS: " + value);
        JavascriptExecutor js = (JavascriptExecutor) DriverSingleton.getDriver();
        js.executeScript("window.scrollBy(0," + value + ")");
    }

}
