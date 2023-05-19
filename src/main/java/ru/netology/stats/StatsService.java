package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
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
