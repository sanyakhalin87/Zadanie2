package ru.netology.stats;
import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import ru.netology.stats.StatsService;



public class StatsServiceTest {
    @Test
    public void calculateMinimumSalesMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int actualDay = service.minSales(sales);
        TestCase Assertions = null;
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void calculateMaxSalesMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 8;
        int actualDay = service.maxSales(sales);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void calcSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.calcSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calculateMonthlyAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 15;
        int actualSum = service.calcAverageSum(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calculateBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMouth = 5;
        int actualMouth = service.calculateBelowAverageSales(sales);
        Assertions.assertEquals(expectedMouth, actualMouth);
    }

    @Test
    public void calculateUpAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMouth = 5;
        int actualMouth = service.calculateUpAverageSales(sales);
        Assertions.assertEquals(expectedMouth, actualMouth);
    }
}

