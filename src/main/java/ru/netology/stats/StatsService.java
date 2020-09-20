package ru.netology.stats;

public class StatsService {
    public int calculateSumSales(int[] sales) { //сумма всех продаж
        int sum = 0;
        for (int sale : sales) {
         sum +=sale;
     }
     return sum;
    }

    public int calculateAverageSumSales(int[] sales) { //средняя сумма продаж за 1 месяц
        return calculateSumSales(sales) / sales.length;
    }

    public int findMonthMax(int[] sales) { //месяц с максимальными продажами
        int currentMax = sales[0];
        int month = 0;
        int monthMax = 0;
        for (int i : sales) {
            month += 1;
            if (currentMax <= i) {
                currentMax = i;
                monthMax = month;
            }
        }
        return monthMax;
    }
    public int findMonthMin(int[] sales) { //месяц с минимальными продажами
        int currentMin = sales[0];
        int month = 0;
        int monthMin = 0;
        for (int i : sales) {
            month += 1;
            if (currentMin >= i) {
                currentMin = i;
                monthMin = month;
            }
        }
        return monthMin;
    }
    public int monthsBelowAverage(int[] sales) { //количество месяцев с продажами ниже среднего
        int numberOfMonths = 0;
        for (int i : sales) {
            if (i < calculateAverageSumSales(sales)) {
                numberOfMonths += 1;
            }
        }
        return numberOfMonths;
    }

    public int monthsOverAverage(int[] sales) { //количество месяцев с продажами выше среднего
        int numberOfMonths = 0;
        for (int i : sales) {
            if (i > calculateAverageSumSales(sales)) {
                numberOfMonths += 1;
            }
        }
        return numberOfMonths;
    }
}




