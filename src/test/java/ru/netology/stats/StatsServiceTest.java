package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void calculateSum() {
        StatsService.StatisticsService service = new StatsService.StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);

        System.out.println("Total:" + actual);
    }


    @Test
    void findMean() {
        StatsService.StatisticsService service = new StatsService.StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.findMean(sales);
        long expected = 15;

        assertEquals(expected, actual);

        System.out.println("Mean: " + actual);

    }

    @Test
    void findTop() {
        StatsService.StatisticsService service = new StatsService.StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.findTop(sales);
        long expected = 8;

        assertEquals(expected, actual);

        System.out.println("Month with max sales: " + actual);

    }

    @Test
    void findMin() {
        StatsService.StatisticsService service = new StatsService.StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.findMin(sales);
        long expected = 9;

        assertEquals(expected, actual);

        System.out.println("Month with min sales: " + actual);

    }

    @Test
    void findUpperMean() {
        StatsService.StatisticsService service = new StatsService.StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.findUpperMean(sales);
        long expected = 5;

        assertEquals(expected, actual);

        System.out.println("Number of months with above average sales: " + actual);

    }

    @Test
    void findUnderMean() {
        StatsService.StatisticsService service = new StatsService.StatisticsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.findUnderMean(sales);
        long expected = 5;

        assertEquals(expected, actual);

        System.out.println("Number of months with below average sales: " + actual);

    }

}