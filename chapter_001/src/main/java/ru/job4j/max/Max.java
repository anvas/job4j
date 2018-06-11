package ru.job4j.max;

/**
 * Программа - Определение максимального числа.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Max {

    /**
     * Метод определяет максимальное из 2-х чисел.
     * @param first Первое число.
     * @param second Второе число.
     * @return Большее число.
     */
    public int max(int first, int second) {
        return first < second ? second : first;
    }

    /**
     * Метод определяет максимальное из 3-х чисел.
     * @param first Первое число.
     * @param second Второе число.
     * @param third Третье число.
     * @return Большее число.
     */
    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}