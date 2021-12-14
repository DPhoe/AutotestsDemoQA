package framework.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.HashMap;
import java.util.Map;


public class DriverSingleton {

    private static WebDriver driver;

    private DriverSingleton () {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigManager.getBrowserName()) {
                case "Chrome":
                    Map<String,Object> preferences = new HashMap<>();
                    preferences.put("profile.default_content_settings.popups", 0);
                    preferences.put("download.default_directory", ConfigManager.getFilePath());
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", preferences);
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
                    break;
                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "Edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "Opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                default:
                    throw new NullPointerException("There is no escape");
            }
        }
        return driver;
    }
}
