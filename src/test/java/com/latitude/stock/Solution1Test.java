package com.latitude.stock;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class Solution1Test {

    private Solution1 solution1;

    private int[] stockPrices1;
    private int[] stockPrices2;
    private int[] stockPrices3;

    @BeforeEach
    void setUp() {
        solution1 = new Solution1();
        stockPrices1 = new int[]{10, 7, 5, 8, 11, 9};
        stockPrices2 = new int[]{2, -8, -5, 0, 11, 15, 20};
        stockPrices3 = new int[]{2};
    }

    @Test
    @DisplayName("Returns correct max profit")
    void testGetMaxProfit() {
        final int actual = solution1.getMaxProfit(stockPrices1);
        assertThat(actual).isEqualTo(6);
    }

    @Test
    @DisplayName("Returns correct max profit by filtering out negative prices from the array")
    void testGetMaxProfitWhenNegativePrices() {
        final int actual = solution1.getMaxProfit(stockPrices2);
        assertThat(actual).isEqualTo(20);
    }

    @Test
    @DisplayName("Returns zero max profit if prices array have less than 2 prices")
    void testMaxProfitZeroForSinglePrice() {
        final int actual = solution1.getMaxProfit(stockPrices3);
        assertThat(actual).isEqualTo(0);
    }
}