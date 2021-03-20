package general.statsperform;

import java.util.Arrays;

public class ComputeDistance {

    /*
    * from a given array of natural numbers, return the distance between two closest numbers
    */
    int computeDistanceBetweenClosestNumbers(int[] numbers) {
        if (numbers.length < 2 ) {
            throw new IllegalArgumentException("input array should contain more that 1 elements.");
        }

        Arrays.sort(numbers);

        int finalDiff = Math.abs(numbers[1] - numbers[0]);
        int diff;

        for (int i = 1; i < numbers.length - 1; ++i ) {
            diff = numbers[i + 1] - numbers[i];

            if (diff < finalDiff) {
                finalDiff = diff;
            }
        }

        return finalDiff;
    }
}
