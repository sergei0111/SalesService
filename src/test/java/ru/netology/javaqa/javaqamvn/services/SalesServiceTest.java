package ru.netology.javaqa.javaqamvn.services;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SalesServiceTest {
    @Test
    public void calcSumSales() {
        SalesServices service = new SalesServices();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(sales);
        long expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    public void calcAverageSumMonth () {
        SalesServices service = new SalesServices();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSumMonth(sales);
        long expected = 180 / 12;

        assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        SalesServices service = new SalesServices();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSales(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        SalesServices service = new SalesServices();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void underAverage() {
        SalesServices service = new SalesServices();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.underAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void upperAverage() {
        SalesServices service = new SalesServices();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.upperAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}
