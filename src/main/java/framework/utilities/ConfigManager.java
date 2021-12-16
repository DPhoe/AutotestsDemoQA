package framework.utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ConfigManager {

    private static Map<String, String> stringConfigs = new HashMap<>();
    public static Map<String, String> getStringConfigs() throws IOException {
        FileReader reader = new FileReader("src/main/resources/ProjectConfig.properties");
        Properties props = new Properties();
        props.load(reader);
        stringConfigs.put("URL", props.getProperty("URL"));
        stringConfigs.put("BrowserName", props.getProperty("BrowserName"));
        stringConfigs.put("filePath", props.getProperty("filePath"));
        return stringConfigs;
    }


    private static Map<String,Integer> intConfig = new HashMap<>();
    public static Map<String, Integer> getIntConfig() throws IOException {
        FileReader reader = new FileReader("src/main/resources/ProjectConfig.properties");
        Properties props = new Properties();
        props.load(reader);
        intConfig.put("implicitlyWaitSec" ,Parser.stringToInt((props.getProperty("implicitlyWaitSec"))));
        intConfig.put("explicitWaitSec" ,Parser.stringToInt((props.getProperty("explicitWaitSec"))));
        intConfig.put("windowSizeX" ,Parser.stringToInt((props.getProperty("windowSizeX"))));
        intConfig.put("windowSizeY" ,Parser.stringToInt((props.getProperty("windowSizeY"))));
        intConfig.put("windowPositionX" ,Parser.stringToInt((props.getProperty("windowPositionX"))));
        intConfig.put("windowPositionY" ,Parser.stringToInt((props.getProperty("windowPositionY"))));
        return intConfig;
    }

    private static Map<String, Boolean> booleanConfig = new HashMap<>();
    public static Map<String, Boolean> getBooleanConfig() throws IOException {
        FileReader reader = new FileReader("src/main/resources/ProjectConfig.properties");
        Properties props = new Properties();
        props.load(reader);
        if(props.getProperty("widowMaximize").equals("true")) {
            booleanConfig.put("widowMaximize",true);
        }
        else booleanConfig.put("widowMaximize",false);
        if(props.getProperty("enablePresetWindowSize").equals("true")) {
            booleanConfig.put("enablePresetWindowSize",true);
        }
        else booleanConfig.put("enablePresetWindowSize", false);
        if(props.getProperty("closeAfterTest").equals("true")) {
            booleanConfig.put( "closeAfterTest",true);
        }
        else booleanConfig.put("closeAfterTest",false);
        return booleanConfig;
    }

    public static String getURL() {
        return stringConfigs.get("URL");
    }

    public static String getBrowserName() {
        return stringConfigs.get("BrowserName");
    }

    public static String getFilePath() {
        return stringConfigs.get("filePath");
    }

    public static int getImplicitlyWaitSec() {
        return intConfig.get("implicitlyWaitSec");
    }

    public static int getExplicitWaitSec() {
        return intConfig.get("explicitWaitSec");
    }

    public static boolean getWindowMaximize() {
        return booleanConfig.get("widowMaximize");
    }

    public static boolean getEnablePresetWindowSize() {
        return booleanConfig.get("enablePresetWindowSize");
    }

    public static org.openqa.selenium.Dimension getWindowSizes() {
        return new Dimension(intConfig.get("windowSizeX"), intConfig.get("windowSizeY"));
    }

    public static Point getWindowPosition() {
        return new Point(intConfig.get("windowPositionX"), intConfig.get("windowPositionY"));
    }

    public static boolean getCloseAfterTest() {
        return booleanConfig.get("closeAfterTest");
    }

}
