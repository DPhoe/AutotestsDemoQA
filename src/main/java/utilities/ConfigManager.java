package utilities;

import org.openqa.selenium.Point;

public class ConfigManager {

    private static String browserName;
    public static String getBrowserName() {
        return browserName;
    }

    private static int implicitlyWaitSec;
    public static int getImplicitlyWaitSec() {
        return implicitlyWaitSec;
    }

    private static int explicitWaitSec;
    public static int getExplicitWaitSec() {
        return explicitWaitSec;
    }

    private static boolean widowMaximize;
    public static boolean getWindowMaximize() {
        return widowMaximize;
    }

    private static boolean presetWindowSize;
    public static boolean getPresetWindowSize() {
        return presetWindowSize;
    }

    private static org.openqa.selenium.Dimension windowSizes;
    public static org.openqa.selenium.Dimension getWindowSizes() {
        return windowSizes;
    }

    private static Point windowPosition;
    public static Point getWindowPosition() {
        return windowPosition;
    }
}
