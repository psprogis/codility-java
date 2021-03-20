package general.traiding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SampleTest {

    public static void main(String[] args) {
//        System.out.println(findNumber(Arrays.asList(1, 2, 3), 2));
//        System.out.println(findNumber(Arrays.asList(1, 2, 3), 5));
//        System.out.println(findNumber(Arrays.asList(1024, 200000, 3232222), 200000));

        System.out.println(oddNumbers(2, 5));
        System.out.println(oddNumbers2(2, 5));
        System.out.println(oddNumbers(3, 9));
        System.out.println(oddNumbers2(3, 9));


    }

    public static String findNumber(List<Integer> arr, int k) {

        for (Integer number : arr) {
            if (number == k) { // number.intValue
                return "YES";
            }
        }

        return "NO";
    }

    public static List<Integer> oddNumbers(int l, int r) {

        List<Integer> result = new ArrayList<>();
        int start = l;

        if (l % 2 == 0) {
            ++start;
        }

        for (int i = start; i <= r; i += 2) {
            result.add(i);
        }

        return result;
    }

    public static List<Integer> oddNumbers2(int l, int r) {
        return IntStream.rangeClosed(l, r)
                .filter(n -> n % 2 != 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
