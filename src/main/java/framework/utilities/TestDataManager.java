package framework.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class TestDataManager {
    private static int frameIndex = 0;

    private static String idOne;
    private static String idTwo;
    public static int getChildFrameIndex() {
        return frameIndex;
    }

    private static ArrayList<String> firstRecord = new ArrayList<String>();
    public static ArrayList<String> getFirstRecord() throws IOException {
        FileReader reader = new FileReader("src/test/resources/TestData.properties");
        Properties props = new Properties();
        props.load(reader);
        firstRecord.add(props.getProperty("FirstName_1"));
        firstRecord.add(props.getProperty("LastName_1"));
        firstRecord.add(props.getProperty("Email_1"));
        firstRecord.add(props.getProperty("Age_1"));
        firstRecord.add(props.getProperty("Salary_1"));
        firstRecord.add(props.getProperty("Department_1"));
        return firstRecord;

    }

    private static ArrayList<String> secondRecord = new ArrayList<String>();
    public static ArrayList<String> getSecondRecord() throws IOException {
        FileReader reader = new FileReader("src/test/resources/TestData.properties");
        Properties props = new Properties();
        props.load(reader);
        secondRecord.add(props.getProperty("FirstName_2"));
        secondRecord.add(props.getProperty("LastName_2"));
        secondRecord.add(props.getProperty("Email_2"));
        secondRecord.add(props.getProperty("Age_2"));
        secondRecord.add(props.getProperty("Salary_2"));
        secondRecord.add(props.getProperty("Department_2"));
        return secondRecord;
    }

    private static ArrayList<String> thirdRecord = new ArrayList<String>();
    public static ArrayList<String> getThirdRecord() throws IOException {
        FileReader reader = new FileReader("src/test/resources/TestData.properties");
        Properties props = new Properties();
        props.load(reader);
        thirdRecord.add(props.getProperty("FirstName_3"));
        thirdRecord.add(props.getProperty("LastName_2"));
        thirdRecord.add(props.getProperty("Email_3"));
        thirdRecord.add(props.getProperty("Age_3"));
        thirdRecord.add(props.getProperty("Salary_2"));
        thirdRecord.add(props.getProperty("Department_3"));
        return thirdRecord;
    }

    public static String getIDOne() throws IOException {
        FileReader reader = new FileReader("src/test/resources/TestData.properties");
        Properties props = new Properties();
        props.load(reader);
        return  idOne = props.getProperty("FrameIdOne");
    }

    public static String getIDTwo() throws IOException {
        FileReader reader = new FileReader("src/test/resources/TestData.properties");
        Properties props = new Properties();
        props.load(reader);
        return  idTwo = props.getProperty("FrameIdTwo");
    }


}
