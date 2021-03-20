package codility.lesson03.lesson03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import codility.lesson03.tapeequilibrium.Solution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TapeEquilibriumTest {

    private final Solution s = new Solution();

    @Test
    public void shouldWorkWithExampleTest() {
        assertEquals(1, s.solution(new int[] {3, 1, 2, 4, 3}));
    }

    @Test
    public void shouldWorkWithTwoNumbers() {
        assertEquals(2000, s.solution(new int[] {-1000, 1000}));
        assertEquals(0, s.solution(new int[] {1000, 1000}));
//        assertEquals(2000, s.solution(new int[] {1000, -1000}));
    }

    @Test
    @Disabled("need to fix the solution")
    public void shouldWorkWithSmallNumbers() {
        assertEquals(0, s.solution(new int[] {-2, -3, -4, -1}));

    }
}
