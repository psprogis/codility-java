package general.statsperform;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/*
* Implement the method 'toCommaSeparatedString' which takes an array of String items as parameter and should build
* a result String that contains all of these items separated with comma
*
* Please, ignore any null values, empty strings, whitespaces or commas itself if they're part of the argument array.
*/
public class CommaSeparatedString {

    public static void main(String[] args) {
        System.out.println(isValidString("abc"));
        System.out.println(isValidString(","));
        System.out.println(isValidString(",,,"));
        System.out.println(isValidString("   ,  ,,  "));
    }

    // use string joiner
    String toCommaSeparatedStrin2(String[] items) {
        StringJoiner sj = new StringJoiner(",");
        if (items.length == 0) {
            return "";
        }

        for (String item : items) {
            if (isValidString(item)) {
                sj.add(item);
            }
        }

        return sj.toString();
    }

    String toCommaSeparatedString(String[] items) {
        return Arrays.stream(items)
                     .filter(CommaSeparatedString::isValidString)
                     .collect(Collectors.joining(","));
    }

    private static boolean isValidString(String input) {
        return ( input != null ) &&
               ( ! input.trim().isEmpty() ) &&
               ( !input.trim().matches("^[, ]+$") );
    }
}
