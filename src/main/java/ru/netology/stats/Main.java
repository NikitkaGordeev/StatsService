package ru.netology.stats;


public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long minMonth = service.minSales(sales);
        long maxMonth = service.maxSales(sales);
        long sumMonth = service.sumSales(sales);
        long averageMonth = service.averageSales(sales);
        long belowTheAverageMonth = service.belowTheAverageSales(sales);
        long aboveTheAverageMonth = service.aboveTheAverageSales(sales);
        System.out.println("В " + minMonth + " месяце минимум продаж");
        System.out.println("В " + maxMonth + " месяце максимум продаж");
        System.out.println("Сумма продаж за год: " + sumMonth);
        System.out.println("Средняя сумма продаж за год: " + averageMonth);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + belowTheAverageMonth);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + aboveTheAverageMonth);

    }
}
