package framework.utilities;

public class Parser {

    public static int stringToInt (String args) {
        int value = Integer.parseInt(args.replaceAll("[^0-9]", ""));
        return value;
    }

}
