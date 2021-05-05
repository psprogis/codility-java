package general.bigfour;

import static java.util.function.Predicate.not;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Given an unsorted list A of non-negative integers,
// return a new list consisting of all the even elements of A, followed by all the odd elements of A.
// You may return any answer list that satisfies this condition: the order of even or odd elements is irrelevant.

// Example:
// Input: [3,1,2,4]
// Output: [2,4,3,1]
// The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

public class ParitySort {

    public static List<Integer> paritySort(List<Integer> initialList) {
        return Stream.concat(
                initialList.stream().filter(ParitySort::isEven),
                initialList.stream().filter(not(ParitySort::isEven)))
                    .collect(toList());
    }

    public static List<Integer> paritySortAlternative(List<Integer> initialList) {
        List<Integer> result = Arrays.asList(new Integer[initialList.size()]);

        int evenNumbersIndex = 0;
        int oddNumbersIndex = initialList.size() - 1;
        for (int value: initialList) {
            if (isEven(value)) {
                result.set(evenNumbersIndex++, value);
            } else {
                result.set(oddNumbersIndex--, value);
            }
        }

        return result;
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}
