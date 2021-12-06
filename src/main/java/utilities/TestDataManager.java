package utilities;

import java.util.ArrayList;

public class TestDataManager {
    private static int frameIndex = 0;
    public static int getChildFrameIndex() {
        return frameIndex;
    }

    private static ArrayList<String> firstRecord = new ArrayList<String>();
    public static ArrayList<String> getFirstRecord() {
        firstRecord.add("Jon");
        firstRecord.add("Snow");
        firstRecord.add("knownothing@gmail.com");
        firstRecord.add("30");
        firstRecord.add("3000");
        firstRecord.add("alpha");
        return firstRecord;

    }


    private static ArrayList<String> secondRecord = new ArrayList<String>();
    public static ArrayList<String> getSecondRecord() {
        secondRecord.add("Buttercup");
        secondRecord.add("Cumbersnatch");
        secondRecord.add("BudapestCandygram@mail.ru");
        secondRecord.add("41");
        secondRecord.add("2000");
        secondRecord.add("beta");
        return secondRecord;
    }

}
