package utilities;

import org.openqa.selenium.Point;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class ConfigManager {

    private static ArrayList<String> stringConfigs = new ArrayList<>();
    public static ArrayList<String> getStringConfigs() throws IOException {
        FileReader reader = new FileReader("src/main/resources/ProjectConfig.properties");
        Properties props = new Properties();
        props.load(reader);
        stringConfigs.add(props.getProperty("URL"));
        stringConfigs.add(props.getProperty("BrowserName"));
        return stringConfigs;
    }

    private static String URL;
    public static String getURL() {
        URL = stringConfigs.get(0);
        return URL;
    }

    private static String browserName;
    public static String getBrowserName() {
        browserName = stringConfigs.get(1);
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

}
