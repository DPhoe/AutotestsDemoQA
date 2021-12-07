package baseTest;

import elements.baseElement.BaseElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utilities.BrowserActions;
import utilities.ConfigManager;

import java.io.IOException;

public class BaseTest {

    @BeforeTest
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
