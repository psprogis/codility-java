package codility.lesson03.lesson03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import codility.lesson03.permmissingelement.Solution;
import org.junit.jupiter.api.Test;

public class PermMissingElementTest {

    private final Solution s = new Solution();

    @Test
    public void shouldWorkWithExample(){
        assertEquals(4, s.solution(new int[]{2, 3, 1, 5}));
    }

}
