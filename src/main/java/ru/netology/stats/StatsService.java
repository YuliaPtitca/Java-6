package ru.netology.stats;

public class StatsService {
    public long saleSum(long[] sale) {
        int sum = 0;
        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

    public long averageSale(long[] sale) {
        return saleSum(sale) / 12;
    }

    public int maxSaleMonth(long[] sale) {
        int maxSale = (int) sale[0];
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxSale]) {
                maxSale = i;
            }
        }
        return maxSale + 1;
    }

    public int minSaleMonth(long[] sale) {
        int minSale = (int) sale[0];
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[minSale]) {
                minSale = i;
            }
        }
        return minSale+1;
    }

    public int countBelowAverage(long[] sale) {
        int count = 0;
        for (long purchase : sale) {
            if (purchase < averageSale(sale)) {
                count++;
            }
        }
        return count;
    }
    public int countAboveAverage(long[] sale) {
        int count = 0;
        for (long purchase : sale) {
            if (purchase > averageSale(sale)) {
                count++;
            }
        }
        return count;
    }
}

