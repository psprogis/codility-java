package codility.lesson02.cyclicrotation;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] A, int K) {
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
}
