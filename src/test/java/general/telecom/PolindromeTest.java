package general.telecom;

import static general.telecom.Polindrome.isPolindrome;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PolindromeTest {

    @Test
    public void shouldPassBasicTest() {
        assertTrue(isPolindrome("abccba"));
        assertFalse(isPolindrome("abcdba"));
    }

    @Test
    public void shouldBeCaseInsensitive() {
        assertTrue(isPolindrome("ABCcba"));
    }

    @Test
    public void shouldIgnoreWhitespaces() {
        assertTrue(isPolindrome("ab dc  cd    ba"));
    }

    @Test
    public void shouldWorkWithRealWorldExamples() {
        assertTrue(isPolindrome("Step on no pets"));
        assertTrue(isPolindrome("Eva, can I see bees in a cave?"));
    }

    @Test
    public void shouldWorkWithDots() {
        assertTrue(isPolindrome("Mr. Owl ate my metal worm"));
    }
}
