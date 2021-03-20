package codility.lesson02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import codility.lesson02.oddinarray.Solution;
import org.junit.jupiter.api.Test;

public class OddsInArrayTest {
    private Solution s = new Solution();

    @Test
    public void shouldFindOddInExampleArray() {
        assertEquals(7, s.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
    }

    @Test
    public void shouldHandleArrayWithOneElement() {
        assertEquals(2, s.solution(new int[] {2}));
    }

    @Test
    public void shouldFindOddInLastPosition() {
        assertEquals(4, s.solution(new int[] {2, 2, 3, 3, 4}));
    }
}
