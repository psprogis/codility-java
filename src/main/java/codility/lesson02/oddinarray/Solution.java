package codility.lesson02.oddinarray;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 *
 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements,
 * and each element of the array can be paired with another element that has the same value,
 * except for one element that is left unpaired.
 *
 * N is an odd integer within the range [1..1,000,000];
 * each element of array A is an integer within the range [1..1,000,000,000];
 * all but one of the values in A occur an even number of times.
 */
public class Solution {

    public int solution(int[] A) {

        if (A.length == 1) {
            return A[0];
        }

        // TODO: do not sort original array, create a copy/clone
        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i += 2) {
            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }

        // return the last element if nothing found before
        return A[A.length - 1];
    }
}
