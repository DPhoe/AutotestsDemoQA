package utilities;

import org.openqa.selenium.Point;

public class ConfigManager {

    private static String browserName = "Firefox";
    public static String getBrowserName() {
        return browserName;
    }

    private static int implicitlyWaitSec = 5;
    public static int getImplicitlyWaitSec() {
        return implicitlyWaitSec;
    }

    private static int explicitWaitSec = 5;
    public static int getExplicitWaitSec() {
        return explicitWaitSec;
    }

    private static boolean widowMaximize = true;
    public static boolean getWindowMaximize() {
        return widowMaximize;
    }

    private static boolean enablePresetWindowSize = false;
    public static boolean getEnablePresetWindowSize() {
        return enablePresetWindowSize;
    }

    private static org.openqa.selenium.Dimension windowSizes;
    public static org.openqa.selenium.Dimension getWindowSizes() {
        return windowSizes;
    }

    private static Point windowPosition;
    public static Point getWindowPosition() {
        return windowPosition;
    }

    private static boolean closeAfterTest = false;
    public static boolean getCloseAfterTest() {return closeAfterTest;}

    private static boolean closeAfterSuit;
    public static boolean getCloseAfterSuite() {return closeAfterSuit;}
}
