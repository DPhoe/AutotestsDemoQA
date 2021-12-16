package framework.utilities.driverFactory;

import framework.utilities.ConfigManager;
import framework.utilities.LoggerUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.opera.OperaDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {

    private BrowserFactory() {}

    static WebDriver createWebDriver() {
        LoggerUtility.log.info(System.lineSeparator() + "Creating driver for browser: " + ConfigManager.getBrowserName());
        switch (ConfigManager.getBrowserName()) {
            case "Chrome":
                Map<String, Object> preferences = new HashMap<>();
                preferences.put("profile.default_content_settings.popups", 0);
                preferences.put("download.default_directory", ConfigManager.getFilePath());
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", preferences);
                WebDriverManager.chromedriver().setup();
                DriverSingleton.driver = new ChromeDriver(options);
                break;
            case "Firefox":
                FirefoxProfile fxProfile = new FirefoxProfile();
                FirefoxOptions option = new FirefoxOptions();
                fxProfile.setPreference("browser.download.folderList", 2);
                fxProfile.setPreference("browser.download.manager.showWhenStarting", false);
                fxProfile.setPreference("browser.download.dir", ConfigManager.getFilePath());
                fxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");
                option.setProfile(fxProfile);
                WebDriverManager.firefoxdriver().setup();
                DriverSingleton.driver = new FirefoxDriver(option);
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                DriverSingleton.driver = new EdgeDriver();
                break;
            case "Opera":
                WebDriverManager.operadriver().setup();
                DriverSingleton.driver = new OperaDriver();
                break;
            default:
                throw new NullPointerException("Incorrect browser name: " + ConfigManager.getBrowserName());
        }
        return DriverSingleton.driver;
    }
}

