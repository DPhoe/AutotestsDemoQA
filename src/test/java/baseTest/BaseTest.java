package baseTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.BrowserActions;
import utilities.ConfigManager;

public class BaseTest {

    @BeforeTest
    public void windowSize() {
        BrowserActions.windowMaximize();
        BrowserActions.setWindowSize();
    }

    @AfterTest(alwaysRun = true)
    public void browserCloseAfterTest() {
        if (ConfigManager.getCloseAfterTest()) {
            BrowserActions.driverQuit();
        }
    }

    @AfterSuite
    public void browserCloseAfterSuit() {
        if (ConfigManager.getCloseAfterSuite()) {
            BrowserActions.driverQuit();
        }
    }
}
