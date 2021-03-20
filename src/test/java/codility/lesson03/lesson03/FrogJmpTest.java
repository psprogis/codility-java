package codility.lesson03.lesson03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import codility.lesson03.frogjmp.Solution;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class FrogJmpTest {
    private final Solution s = new Solution();

    @Test
    public void shouldWorkWithExampleTest() {
        assertEquals(3, s.solution(10, 85, 30));
    }

    @Test
    public void shouldWorkInBoundaryConditions() {
        assertEquals(9, s.solution(10, 100, 10));
    }

    @Test
    public void shouldReturnZeroIfXequalsY() {
        assertEquals(0, s.solution(90, 90, 30));
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void shouldCalculateBigJump() {
        assertEquals(142730189, s.solution(3, 999111321, 7));
    }
}
