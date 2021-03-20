package general.statsperform;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComputeDistanceTest {
    private final ComputeDistance cd = new ComputeDistance();

    @Test
    public void shouldComputeDistanceForArrayOfPositiveNumbers() {
        assertEquals(18, cd.computeDistanceBetweenClosestNumbers(new int[] {4, 23, 66, 87, 123, 141, 177}));
    }

    @Test
    public void shouldComputeDistanceForArrayOfPositiveAndNegativeNumbers() {
        assertEquals(2, cd.computeDistanceBetweenClosestNumbers(
            new int[] {5, 555, 55, 888, 8, 88, -6, -66, -666, -4, -44, -444}));
    }

    @Test
    public void shouldComputeDistanceForLastElements() {
        assertEquals(1, cd.computeDistanceBetweenClosestNumbers(
            new int[] {5, 555, 55, 888, 8, 88, 889}));
    }
}
