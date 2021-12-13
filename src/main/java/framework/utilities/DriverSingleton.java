package framework.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;



public class DriverSingleton {

    private static WebDriver driver;

    private DriverSingleton () {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigManager.getBrowserName()) {
                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
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
