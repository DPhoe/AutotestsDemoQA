package framework.baseTest;

import framework.utilities.DriverSingleton;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;
import pagesDemoQA.*;

import java.io.IOException;

public class BaseTest {

    protected DemoqaAlertsPage demoqaAlertsPage = new DemoqaAlertsPage(By.xpath("//span[contains(text(),'to see')]/ancestor::div[contains(@class, '12')]"), "Alerts form");
    protected DemoqaBrowserWindowsPage demoqaBrowserWindowsPage = new DemoqaBrowserWindowsPage(By.xpath("//div[@id='browserWindows']"), "Browser window form");
    protected DemoqaLandingPage demoqaLandingPage = new DemoqaLandingPage(By.xpath("//img[contains(@class, 'banner')]"), "DemoQA banner on landing page");
    protected DemoqaLinksPage demoqaLinksPage = new DemoqaLinksPage(By.xpath("//div[@id='linkWrapper']"), "Link wrapper on links page");
    protected DemoqaNestedFramesPage demoqaNestedFramesPage = new DemoqaNestedFramesPage(By.xpath("//div[@id='frame1Wrapper']"), "Nested frame wrapper");
    protected DemoqaSamplePage demoqaSamplePage = new DemoqaSamplePage(By.xpath("//h1"), "Sample page header");
    protected DemoqaUploadDownloadPage demoqaUploadDownloadPage = new DemoqaUploadDownloadPage(By.xpath("//a[@id='downloadButton']"), "Download button on DemoQA download page");
    protected DemoqaWebTablesPage demoqaWebTablesPage = new DemoqaWebTablesPage(By.xpath("//div[@class='web-tables-wrapper']"), "DemoQA web tablet wrapper");
    protected DemoqaWidgetsPage demoqaWidgetsPage = new DemoqaWidgetsPage(By.xpath("//div[@id='progressBarContainer']"), "Progress bar container");

    @BeforeMethod
    public void windowSize() throws IOException {
        ConfigManager.getStringConfigs();
        ConfigManager.getIntConfig();
        ConfigManager.getBooleanConfig();
        BrowserActions.windowMaximize();
        BrowserActions.setWindowSize();
        BrowserActions.setImplicitWait();
    }

    @AfterTest(alwaysRun = true)
    public void browserCloseAfterTest() {
        if (ConfigManager.getCloseAfterTest()) {
            BrowserActions.driverQuit();
        }
    }
}
