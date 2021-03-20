package codility.lesson02.cyclicrotation;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 *
 * Rotate an array to the right by a given number of steps.
 * Given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 *
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 */
public class CyclicRotation {

    // first, brute force solution
    public static int[] solution2(int[] A, int K) {
        int rotationNumber = K;
        final int arrayLength = A.length;
        final int lastElementIdx = arrayLength - 1;
        int[] result;

        result = Arrays.copyOf(A, arrayLength);  // copyArray(A, result);

        if (rotationNumber < 0 || rotationNumber > 100) {
            throw new IllegalArgumentException("rotation number should be in range 0..100.");
        }

        if (arrayLength > 100) {
            throw new IllegalArgumentException("array length should be less than or equal 100.");
        }

        // nothing to do, return the same array
        if (arrayLength == 0) {
            return result;
        }

        // the following 2 check can be switched or combined together
        // nothing to do, return the same array
        if (rotationNumber % arrayLength == 0) {
            return result;
        }

        // process rotationNumber
        if (rotationNumber > arrayLength) {
            rotationNumber = rotationNumber / arrayLength; // - should be % instead of /
        }

        int lastElement;

        for (int i = 0; i < rotationNumber; ++i) {

            lastElement = result[lastElementIdx];

            for(int j = lastElementIdx; j > 0; --j) {
                result[j] = result[j - 1];
            }

            result[0] = lastElement;
        }

        return result;

    }

    // final solution
    public static int[] solution(int[] A, int K) {
        int rotationNumber = K;
        final int arrayLength = A.length;
        int[] result = new int[A.length];

        if (rotationNumber < 0 || rotationNumber > 100) {
            throw new IllegalArgumentException("rotation number should be in range 0..100.");
        }

        if (arrayLength > 100) {
            throw new IllegalArgumentException("array length should be less than or equal 100.");
        }

        // nothing to do, return the same array
        if (arrayLength == 0) {
            return result;
        }

        // nothing to do, return the same array
        if (rotationNumber % arrayLength == 0) {
            return Arrays.copyOf(A, arrayLength);
        }

        // process rotationNumber
        if (rotationNumber > arrayLength) {
            rotationNumber = rotationNumber % arrayLength;
        }

        for (int i = 0; i < arrayLength; ++i) {
            result[(i + rotationNumber) % arrayLength] = A[i];
        }

        return result;
    }

    private static void copyArray(int[] src, int[] dest) {
        for (int i = 0; i < src.length; ++i) {
            dest[i] = src[i];
        }
    }
}
