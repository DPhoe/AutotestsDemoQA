package framework.utilities;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Random;

public class RandomGenerator {

    public static String getTimestamp() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String string  = dateFormat.format(new Timestamp(System.currentTimeMillis()));
        return string;
    }

    private static final int randomNumberUpperLimit = 100;
    static Random randomNumber = new Random();
    public static int randomInt = randomNumber.nextInt(randomNumberUpperLimit) + 1;

}
