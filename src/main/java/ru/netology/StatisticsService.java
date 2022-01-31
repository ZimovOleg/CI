package ru.netology;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) { // максимальное значение
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income);
               //current_max = income;
        return current_max;
    }

    public long findMin(long[] incomes) { // минимальное значение
        long current_min_index = 0;
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min > income)
                current_min = income;
        return current_min;
    }

    public long Total(long[] incomes) { // сумма значений
        long sum = 0;
        for (long income : incomes) {
            sum += income;
        }
        return sum;
    }
}

