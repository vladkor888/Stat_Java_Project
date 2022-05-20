package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calcAverValue(int[] sales) {
        int sum = 0;
        int aver = 0;
        for (int sale : sales) {
            sum = sum + sale;
            aver = sum / 12;
        }
        return aver;

    }

    public int maxSales(int[] sales) {
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

    public int minSales(int[] sales) {
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

    public int minAverMonth(int[] sales) {
        int numberMonth = 0;
        int aver = calcAverValue(sales);
        for (long sale : sales) {
            if (sale < aver) {

            numberMonth = numberMonth + 1;
            }
        }
        return numberMonth;
    }

    public int maxAverMonth(int[] sales) {
        int numberMonth = 0;
        int aver = calcAverValue(sales);
        for (long sale : sales) {
            if (sale > aver) {

                numberMonth = numberMonth + 1;
            }
        }
        return numberMonth;
    }


}


