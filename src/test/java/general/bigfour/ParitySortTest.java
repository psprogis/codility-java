package general.bigfour;

import static general.bigfour.ParitySort.paritySort;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ParitySortTest {

    @ParameterizedTest
    @MethodSource("provideValidInputArrays")
    void shouldWorksCorrectlyForValidInputs(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, paritySort(input));
    }

    private static Stream<Arguments> provideValidInputArrays() {
        return Stream.of(
                Arguments.of(Arrays.asList(3, 1, 2, 4), Arrays.asList(2, 4, 3, 1))
        );
    }
}
