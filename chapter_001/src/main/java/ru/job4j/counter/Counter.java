package ru.job4j.counter;

/**
 * Программа - Сумма четных чисел из диапазона start ... finish.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Counter {

    int sum = 0;

    /**
     * Метод определяет сумма четных чисел из диапазона start ... finish.
     * @param start Первое число диапазона.
     * @param finish Последнее число диапазона.
     * @return сумма четных чисел из диапазона start ... finish.
     */

    public int add(int start, int finish) {
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum += index;
            }
        }
        return sum;
    }
}