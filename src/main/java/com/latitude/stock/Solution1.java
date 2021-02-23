package com.latitude.stock;

import java.util.Arrays;

/* 1. Initialize a maxProfit variable.
 *2. Filter for prices which are negative in the stockPrices array
 *3. Sort the stockPrices array in ascending order such that buy is before sell(stockPrices[0] = buy and stockPrices[stockPrices.length] = sell)
 *4. Subtract the buy and sell to get the max profit
 * */
public class Solution1 {

    public int getMaxProfit(int[] stockPrices) {
        int maxProfit;
        int buy;
        int sell;

        // There should be atleast 2 prices for comparison so that buy and sell are not in the same time step. If not, return 0 profit. (Assumption)
        if (stockPrices.length < 2) {
            return 0;
        }

        final int[] sortedPrices = Arrays.stream(stockPrices)
            .filter(s -> s >= 0)
            .sorted()
            .toArray();

        buy = sortedPrices[0];
        sell = sortedPrices[sortedPrices.length - 1];

        maxProfit = Math.abs(buy - sell);
        return maxProfit;
    }
}
