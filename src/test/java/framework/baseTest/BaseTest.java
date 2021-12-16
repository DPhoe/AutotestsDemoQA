package framework.baseTest;

import framework.utilities.DriverSingleton;
import org.testng.annotations.*;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;

import java.io.IOException;

public class BaseTest {

    @BeforeMethod
    public void windowSize() throws IOException {
        DriverSingleton.setDriverToNull();
        ConfigManager.getStringConfigs();
        ConfigManager.getIntConfig();
        ConfigManager.getBooleanConfig();
        BrowserActions.windowMaximize();
        BrowserActions.setWindowSize();
        BrowserActions.setImplicitWait();
    }

    @AfterMethod(alwaysRun = true)
    public void browserCloseAfterTest() {
        if (ConfigManager.getCloseAfterTest()) {
            BrowserActions.driverQuit();
            DriverSingleton.setDriverToNull();
        }
    }
}
