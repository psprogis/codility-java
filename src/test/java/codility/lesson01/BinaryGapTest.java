package codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import codility.lesson01.binarygap.Solution;
import org.junit.jupiter.api.Test;

public class BinaryGapTest {

    private final Solution s = new Solution();

    @Test
    public void shouldFindBinaryGapForSmallNumbers() {
        assertEquals(2, s.solution(9));
        assertEquals(4, s.solution(529));
        assertEquals(1, s.solution(20));
        assertEquals(5, s.solution(1041));
    }

    @Test
    public void shouldReturnZeroInNumberHasNoGaps() {
        assertEquals(0, s.solution(15));
        assertEquals(0, s.solution(32));
    }

    @Test
    public void shouldFindBinaryGapForBigNumbers() {
        assertEquals(3, s.solution(561892));
        assertEquals(4, s.solution(74901729));
        assertEquals(5, s.solution(1376796946));


    }

}
