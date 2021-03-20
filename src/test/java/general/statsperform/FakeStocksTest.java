package general.statsperform;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FakeStocksTest {

    private final FakeStocks fs = new FakeStocks();

    // TODO: use data providers / parameterized class ?

    @Test
    public void shouldWorkWithSimpleExample() {
        assertEquals(4, fs.buyAndSellStock(new int[] {6, 3, 1, 2, 5, 4}));
    }

    @Test
    public void shouldReturnZeroForBadPrices() {
        assertEquals(0, fs.buyAndSellStock(new int[] {8, 5, 3, 1}));
    }

    @Test
    public void shouldFindBestPrice() {
        assertEquals(97, fs.buyAndSellStock(new int[] {3, 100, 1, 97}));
    }

    @Test
    public void shouldReturnZeroForFlatPrices() {
        assertEquals(0, fs.buyAndSellStock(new int[] {3, 3, 3, 3, 3, 3}));
    }

    @Test
    public void shouldHandleSmallDiff() {
        assertEquals(1, fs.buyAndSellStock(new int[] {4, 3, 3, 3, 3, 4}));
    }

    @Test
    public void shouldHandleOneElementArray() {
        assertEquals(0, fs.buyAndSellStock(new int[] {1_000_000}));
    }

    @Test
    public void shouldHandleSimpleInput() {
        assertEquals(5, fs.buyAndSellStock(new int[] {1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void shouldHandleNormalInput() {
        assertEquals(82, fs.buyAndSellStock(new int[] {18, 74, 69, 100, 71, 10, 8, 13, 86, 9, 56, 76, 70, 29,
                                                       17, 33, 55, 44, 82, 48}));
    }

    @Test
    public void shouldHandleNormalInput2() {
        assertEquals(84, fs.buyAndSellStock(new int[] {98, 35, 94, 48, 19, 53, 32, 35, 11, 50, 27, 6, 83, 70,
                                                       24, 90, 21, 61, 65, 42}));
    }

    @Test
    public void shouldHandleNormalInput3() {
        assertEquals(73, fs.buyAndSellStock(new int[] {97, 97, 98, 82, 4, 68, 4, 41, 59, 11, 14, 4, 43, 4,
                                                       15, 34, 62, 53, 77, 35}));
    }

    @Test
    public void shouldHandleNormalInput4() {
        assertEquals(82, fs.buyAndSellStock(new int[] {20, 99, 16, 61, 23, 16, 98, 28, 50, 40, 61, 10, 21, 70,
                                                       46, 88, 84, 67, 44, 42}));
    }

    @Test
    public void shouldHandleNormalInput5() {
        assertEquals(79, fs.buyAndSellStock(new int[] {40, 41, 16, 77, 55, 60, 85, 89, 46, 73, 78, 30, 95, 18,
                                                       75, 64, 75, 45, 86, 46}));
    }

//    @Test
//    public void shouldHandleVeryBigInput() {
//        assertEquals(73, fs.buyAndSellStock(new int[] {}));
//    }
}
