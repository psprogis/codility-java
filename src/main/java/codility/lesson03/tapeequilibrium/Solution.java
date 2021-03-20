package codility.lesson03.tapeequilibrium;

import java.util.Arrays;

/*
* https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
* A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
* Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1]
* and A[P], A[P + 1], ..., A[N − 1].
* The difference between the two parts is the value of:
* |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
*
* In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
*
* given a non-empty array A of N integers, returns the minimal difference that can be achieved.
*
* N is an integer within the range [2..100,000];
* each element of array A is an integer within the range [−1,000..1,000].
*/
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        int result = s.solution(new int[] {-2, -3, -4, -1});
        System.out.println(result);
    }

    public int solution(int[] A) {
        int sum = Arrays.stream(A).map(Math::abs).sum();
        int left = 0;
        int right = sum;
        int diff = Integer.MAX_VALUE;
        int currentDiff;

        // TODO: should stop earlier, do not need all iterations
        for (int number : A) {
            left += number;
            right -= number;

            currentDiff = Math.abs(left - right);

            if (currentDiff < diff) {
                diff = currentDiff;
            }
        }


        return diff;
    }
}
