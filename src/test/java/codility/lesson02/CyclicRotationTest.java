package codility.lesson02;

import static codility.lesson02.cyclicrotation.CyclicRotation.solution;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CyclicRotationTest {

    @Test
    public void shouldRotateArrayWithBigRotationNumber() {
        assertArrayEquals(new int[]{3, 5, 1, 1, 2},
                solution(new int[] {1, 1, 2, 3, 5}, 42));
    }

    @Test
    public void shouldRotateArrayByOneElement() {
        assertArrayEquals(new int[]{6, 3, 8, 9, 7},
                          solution(new int[] {3, 8, 9, 7, 6}, 1));
    }

    @Test
    public void shouldRotateArrayByThreeElements() {
        assertArrayEquals(new int[]{9, 7, 6, 3, 8},
                          solution(new int[] {3, 8, 9, 7, 6}, 3));
    }

    @Test
    public void shouldRotateArrayWithZeros() {
        assertArrayEquals(new int[]{0, 0, 0},
                          solution(new int[] {0, 0, 0}, 1));
    }

    @Test
    public void shouldReturnIdenticalArrayIfArrayLengthIsEqualToRotationNumber() {
        assertArrayEquals(new int[]{1, 2, 3, 4},
                          solution(new int[] {1, 2, 3, 4}, 4));
    }

    @Test
    public void shouldRotateArrayOfOneElement() {
        assertArrayEquals(new int[]{200},
                          solution(new int[] {200}, 5));
    }

    @Test
    public void shouldRotateEmptyArray() {
        assertArrayEquals(new int[]{},
                          solution(new int[] {}, 2));
    }

    @Test
    public void additionalBoundaryTest() {
        assertArrayEquals(new int[]{4, 5, 1, 2, 3},
                          solution(new int[] {1, 2, 3, 4, 5}, 12));
    }
}
