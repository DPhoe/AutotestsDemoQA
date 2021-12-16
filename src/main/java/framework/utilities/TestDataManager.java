package framework.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Properties;

public class TestDataManager {

    private static int frameIndex = 0;
    private static String idOne;
    private static String idTwo;
    public static int getChildFrameIndex() {
        return frameIndex;
    }

    /**
     Getting users record data from src/test/resources/TestData.properties by index
     Not in use atm
     */
    public static ArrayList<String> getRecordDataByIndexProperties(String index) throws IOException {
        ArrayList<String> recordData = new ArrayList<>();
        FileReader reader = new FileReader("src/test/resources/TestData.properties");
        Properties props = new Properties();
        props.load(reader);
        recordData.add(props.getProperty("FirstName_" + index + ""));
        recordData.add(props.getProperty("LastName_" + index + ""));
        recordData.add(props.getProperty("Email_" + index + ""));
        recordData.add(props.getProperty("Age_" + index + ""));
        recordData.add(props.getProperty("Salary_" + index + ""));
        recordData.add(props.getProperty("Department_" + index + ""));
        return recordData;

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

    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    /**
     Getting user record data from src/test/resources/UserRecords.json by index
     The worst realization you could ever imagine
     */
    public static ArrayList<String> getRecordDataByIndexJson(int index) throws Exception {
        String file = "src/test/resources/UserRecords.json";
        String json = readFileAsString(file);
        Gson gson = new GsonBuilder()
                .create();
        UserRecordsPojo records = gson.fromJson(json, UserRecordsPojo.class);
        String obj = records.getRecords().get(index).toString();
        UserRecordsPojo recordsData = gson.fromJson(obj, UserRecordsPojo.class);
        ArrayList<String> recordData = new ArrayList<>();
        recordData.add(recordsData.getFirstName());
        recordData.add(recordsData.getLastName());
        recordData.add(recordsData.getEmail());
        recordData.add(recordsData.getAge());
        recordData.add(recordsData.getSalary());
        recordData.add(recordsData.getDepartment());
        return recordData;
    }

    public static Object[] addDataToProviderByIndex (int index) throws Exception {
        ArrayList<String> data = new ArrayList<>();
        data.addAll(TestDataManager.getRecordDataByIndexJson(index));
        return data.toArray();
    }

}
