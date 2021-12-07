package utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

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

    private static ArrayList<Integer> intConfig = new ArrayList<>();
    public static ArrayList<Integer> getIntConfig() throws IOException {
        FileReader reader = new FileReader("src/main/resources/ProjectConfig.properties");
        Properties props = new Properties();
        props.load(reader);
        intConfig.add(Parser.stringToInt((props.getProperty("implicitlyWaitSec"))));
        intConfig.add(Parser.stringToInt((props.getProperty("explicitWaitSec"))));
        intConfig.add(Parser.stringToInt((props.getProperty("windowSizeX"))));
        intConfig.add(Parser.stringToInt((props.getProperty("windowSizeY"))));
        intConfig.add(Parser.stringToInt((props.getProperty("windowPositionX"))));
        intConfig.add(Parser.stringToInt((props.getProperty("windowPositionY"))));
        return intConfig;
    }

    private static ArrayList<Boolean> booleanConfig = new ArrayList<>();
    public static ArrayList<Boolean> getBooleanConfig() throws IOException {
        FileReader reader = new FileReader("src/main/resources/ProjectConfig.properties");
        Properties props = new Properties();
        props.load(reader);
        if(props.getProperty("widowMaximize").equals("true")) {
            booleanConfig.add(true);
        }
        else booleanConfig.add(false);
        if(props.getProperty("enablePresetWindowSize").equals("true")) {
            booleanConfig.add(true);
        }
        else booleanConfig.add(false);
        if(props.getProperty("closeAfterTest").equals("true")) {
            booleanConfig.add(true);
        }
        else booleanConfig.add(false);

        return booleanConfig;
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

    private static int implicitlyWaitSec;
    public static int getImplicitlyWaitSec() {
        implicitlyWaitSec = intConfig.get(0);
        return implicitlyWaitSec;
    }

    private static int explicitWaitSec;
    public static int getExplicitWaitSec() {
        explicitWaitSec = intConfig.get(1);
        return explicitWaitSec;
    }

    private static boolean widowMaximize;
    public static boolean getWindowMaximize() {
        widowMaximize = booleanConfig.get(0);
        return widowMaximize;
    }

    private static boolean enablePresetWindowSize;
    public static boolean getEnablePresetWindowSize() {
        enablePresetWindowSize = booleanConfig.get(1);
        return enablePresetWindowSize;
    }

    private static org.openqa.selenium.Dimension windowSizes;
    public static org.openqa.selenium.Dimension getWindowSizes() {
        windowSizes = new Dimension(intConfig.get(2), intConfig.get(3));
        return windowSizes;
    }

    private static Point windowPosition;
    public static Point getWindowPosition() {
        windowPosition = new Point(intConfig.get(4), intConfig.get(5));
        return windowPosition;
    }

    private static boolean closeAfterTest;
    public static boolean getCloseAfterTest() {
        closeAfterTest = booleanConfig.get(2);
        return closeAfterTest;
    }

}
