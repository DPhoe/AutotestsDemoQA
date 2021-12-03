package utilities;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class RandomGenerator {

    public static String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String string  = dateFormat.format(new Timestamp(System.currentTimeMillis()));
        return string;
    }

}
