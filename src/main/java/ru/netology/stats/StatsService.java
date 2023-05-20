package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            sumMonth = (int) (sumMonth + sales[i]);
        }
        return sumMonth;
    }

    public int averageSales(long[] sales) {
        int averageMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            averageMonth = (int) (averageMonth + sales[i]);
        }
        return averageMonth / 12;
    }

    public int belowTheAverageSales(long[] sales) {
        int belowTheAverageMonth = 0;
        int averageSales = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                belowTheAverageMonth++;
            }
        }

        return belowTheAverageMonth;
    }

    public int aboveTheAverageSales(long[] sales) {
        int aboveTheAverageMonth = 0;
        int averageSales = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                aboveTheAverageMonth++;
            }
        }

        return aboveTheAverageMonth;
    }
}
