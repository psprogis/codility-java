package codility.lesson03.permmissingelement;

import java.util.Arrays;

/*
* https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
*
* An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
* which means that exactly one element is missing. Your goal is to find that missing element.
*
* N is an integer within the range [0..100,000];
* the elements of A are all distinct;
* each element of array A is an integer within the range [1..(N + 1)].
*/
public class Solution {
    public int solution(int[] A) {

        // strange but true
        if (A.length == 1) {
            return A[0] > 1 ? A[0] - 1 : A[0] + 1;
        }

        // for an empty array
        if (A.length == 0) {
            return 1;
        }

        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i + 1] != A[i] + 1) {
                return A[i] + 1;
            }
        }

        // strange but true
        return A[0] == 1 ? A[A.length - 1] + 1 : A[0] - 1;
    }
}
