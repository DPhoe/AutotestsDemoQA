package baseTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.BrowserActions;
import utilities.ConfigManager;

import java.io.IOException;

public class BaseTest {

    @BeforeTest
    public void windowSize() throws IOException {
        ConfigManager.getStringConfigs();
        BrowserActions.windowMaximize();
        BrowserActions.setWindowSize();
    }

    @AfterTest(alwaysRun = true)
    public void browserCloseAfterTest() {
        if (ConfigManager.getCloseAfterTest()) {
            BrowserActions.driverQuit();
        }
    }
}
