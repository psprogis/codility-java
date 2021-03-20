package general.statsperform;

/*
* You are given the prices of a stock, in the form of an array of integers, prices.
* Let's say that prices[i] is the price of the stock on the i-th day (0-based index).
* Assuming that you are allowed to buy and sell the stock only once, your task is to find
* the maximum possible profit (the difference between the buy and sell prices).
*
* Note: you can assume there are no fees associated with buying or selling the stock.
*
*/

public class FakeStocks {
    int buyAndSellStock(int[] prices) {

        if (prices.length <= 1) {
            return 0;
        }

        int bestDiff = prices[1] - prices[0];
        int currentDiff = 0;

        for (int i = 0; i < prices.length - 1; ++i) {
            for (int j = i + 1; j < prices.length; ++j) {

                currentDiff = prices[j] - prices[i];

                if (currentDiff > bestDiff) {
                    bestDiff = currentDiff;
                }
            }
        }

        if (bestDiff < 0) {
            return 0;
        }

        return bestDiff;
    }
}
