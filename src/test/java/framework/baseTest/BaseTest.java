package framework.baseTest;

import framework.utilities.driverFactory.DriverSingleton;
import org.testng.annotations.*;
import framework.utilities.BrowserActions;
import framework.utilities.ConfigManager;

import java.io.IOException;

public class BaseTest {

    @BeforeMethod
    public void windowSize() throws IOException {
        ConfigManager.getStringConfigs();
        ConfigManager.getIntConfig();
        ConfigManager.getBooleanConfig();
        DriverSingleton.getDriver();
        BrowserActions.windowMaximize();
        BrowserActions.setWindowSize();
        BrowserActions.setImplicitWait();
    }

    @AfterMethod(alwaysRun = true)
    public void browserCloseAfterTest() {
        if (ConfigManager.getCloseAfterTest()) {
            DriverSingleton.driverQuit();
            DriverSingleton.setDriverToNull();
        }
    }
}
