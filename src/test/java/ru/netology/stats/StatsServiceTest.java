package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test
    void sumSale() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.saleSum(sale);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void averageSale() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.averageSale(sale);

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void maxSaleMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMax = 8;
        int actualMonthMax = service.maxSaleMonth(sale);

        assertEquals(expectedMonthMax, actualMonthMax);
    }

    @Test
    void minSaleMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthMin = 9;
        int actualMonthMin = service.minSaleMonth(sale);

        assertEquals(expectedMonthMin, actualMonthMin);
    }

    @Test
    void belowAverage() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.countBelowAverage(sale);

        assertEquals(expected, actual);
    }

    @Test
    void AboveAverage() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.countAboveAverage(sale);

        assertEquals(expected, actual);
    }
}
