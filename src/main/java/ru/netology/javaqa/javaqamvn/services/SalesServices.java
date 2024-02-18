package ru.netology.javaqa.javaqamvn.services;

public class SalesServices {

    public long sumSales(long[] sales) { // cумма продаж
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long averageSumMonth(long[] sales) { // средняя сумма месячных продаж
        long result = sumSales(sales);
        return result / 12;
    }

    public int maxSales(long[] sales) { // номер месяца с максимальными продажами
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

    public int minSales(long[] sales) { // номер месяца с минимальными продажами
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int underAverage(long[] sales) { // кол-во месяцев с продажами ниже среднего
        int counter = 0;
        long averageSales = averageSumMonth(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public int upperAverage(long[] sales) { // кол-во месяцев с продажами выше среднего
        int counter = 0;
        long averageSales = averageSumMonth(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}
