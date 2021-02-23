package com.latitude.stock;

/* Solution 2:
    1. Initialize maxProfit variable to min value and minPrice variable to max value
    2. Iterate through the array linearly
    3. Get the minimum price using Math.min and maxProfit using Math.max
    4. Return the max profit
* */
public class Solution2 {

    public int getMaxProfit(int[] stockPrices) {
        int maxProfit = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;

        for (int stockPrice : stockPrices) {

            // There should be atleast 2 prices for comparison so that buy and sell are not in the same time step. If not, return 0 profit. (Assumption)
            if (stockPrices.length < 2) {
                return 0;
            }

            if (stockPrice >= 0) {
                minPrice = Math.min(minPrice, stockPrice);
                maxProfit = Math.max(maxProfit, stockPrice - minPrice);
            }
        }
        return maxProfit;
    }
}
