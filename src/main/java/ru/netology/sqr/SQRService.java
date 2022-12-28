package ru.netology.sqr;


public class SQRService {
    /**
     *
     * @param lowerRangeLimit нижняя граница диапазона
     * @param upperRangeLimit верхняя граница диапазона
     * @return количество вхождений квадратов чисел от 10 до 99 в диапазон
     */
    public int findRangeEntriesAmount(long lowerRangeLimit, long upperRangeLimit) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            long currentMultiplicationValue = i * i;
            if (currentMultiplicationValue >= lowerRangeLimit && currentMultiplicationValue <= upperRangeLimit) {
                counter++;
            }
        }
        return counter;
    }
}
