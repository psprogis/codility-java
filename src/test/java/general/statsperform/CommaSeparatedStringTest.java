package general.statsperform;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CommaSeparatedStringTest {
    private final CommaSeparatedString css = new CommaSeparatedString();

    @Test
    public void shouldWorkInBasicCase() {
        assertEquals("1,Two,3", css.toCommaSeparatedString(new String[]{"1", "Two", "3"}));
    }

    @Test
    public void shouldIgnoreNullValues() {
        assertEquals("one,Two,3",
                     css.toCommaSeparatedString(new String[]{"one", null, "Two", "3", null}));
    }

    @Test
    public void shouldIgnoreEmptyAndWhitespacesValues() {
        assertEquals(" one ,Two ,3",
                     css.toCommaSeparatedString(new String[]{" one ", "", "Two ", "3", "    ", "  "}));
    }

    @Test
    public void shouldIgnoreCommaValues() {
        assertEquals("one,Two",
                     css.toCommaSeparatedString(new String[]{"one", ",", "Two", ","}));
    }

    @Test
    public void shouldNotIgnoreCommaAsPartOfValues() {
        assertEquals("one,,Two,,,finish",
                     css.toCommaSeparatedString(new String[]{"one,", ",", "Two,,", "finish"}));
    }

    @Test
    public void shouldIgnoreSeveralCommasValues() {
        assertEquals("one,two",
                     css.toCommaSeparatedString(new String[]{"one", ",,,", "two", ", ,"}));
    }

    @Test
    public void shouldReturnEmptyStringForEmptyArray() {
        assertEquals("",
                     css.toCommaSeparatedString(new String[]{}));
    }

    @Test
    public void shouldReturnEmptyStringForEmptyElementsInArray() {
        assertEquals("",
                     css.toCommaSeparatedString(new String[]{"", "  ", "    "}));
    }
}
