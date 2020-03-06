package ru.netology.stats;

public class StatsService {

    public static class StatisticsService {
        public long calculateSum(long[] sales) {
            long sum = 0;
            for (long sale : sales) {
                sum = sum + sale;
            }
            return sum;

        }

        public long findMean(long[] sales) {
            long sum = 0;
            for (long sale : sales) {
                sum = sum + sale;

            }

            long mean = sum / 12;

            return mean;
        }

        public long findTop(long[] sales) {
            long currentMax = sales[0];
            long month = 0;
            long monthMax = 0;
            for (long sale : sales) {
                month = month + 1;
                if (currentMax <= sale) {
                    currentMax = sale;
                    monthMax = month;
                }

            }

            return monthMax;
        }

        public long findMin(long[] sales) {
            long currentMax = sales[0];
            long month = 0;
            long monthMin = 0;
            for (long sale : sales) {
                month = month + 1;
                if (currentMax > sale) {
                    currentMax = sale;
                    monthMin = month;
                }

            }

            return monthMin;
        }

        public long findUpperMean(long[] sales) {
            long sum = 0;
            for (long sale : sales) {
                sum = sum + sale;

            }

            long mean = sum / 12;
            long month = 0;
            for (long sale : sales) {
                if (mean < sale) {
                    month = month + 1;
                }

            }

            return month;
        }

        public long findUnderMean(long[] sales) {
            long sum = 0;
            for (long sale : sales) {
                sum = sum + sale;

            }

            long mean = sum / 12;
            long month = 0;
            for (long sale : sales) {
                if (mean > sale) {
                    month = month + 1;
                }

            }

            return month;
        }
    }

}
