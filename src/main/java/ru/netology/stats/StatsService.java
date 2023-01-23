package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int calcSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAverageSum(long[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int calculateBelowAverageSales(long[] sales) {
        int count = 0;
        int averageSum = calcAverageSum(sales);
        for (long sale : sales) {
            if (sale < averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calculateUpAverageSales(long[] sales) {
        int count = 0;
        int averageSum = calcAverageSum(sales);
        for (long sale : sales) {
            if (sale > averageSum) {
                count = count + 1;
            }
        }
        return count;
    }
}

