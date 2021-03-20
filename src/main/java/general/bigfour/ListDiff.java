package general.bigfour;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListDiff {

    public static void main(String[] args) {

        List<String> first = Arrays.asList("foo", "bar", "baz");
        List<String> second = Arrays.asList("abc", "xyz", "foo");

        System.out.println(diff(first, second));

    }

    public static List<String> diff(List<String> first, List<String> second) {
        return first.stream()
                .filter(item -> !second.contains(item))
                .collect(Collectors.toList());
    }

}
