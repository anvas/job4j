package ru.job4j.max;

/**
 * Программа - Максимум из 2-х чисел.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Max {

    /**
     * Отвечает на вопросы.
     * @param first Первое число.
     * @param second Второе число.
     * @return Ответ.
     */
    public int max(int first, int second) {
        return (first == second) ? first : (first < second) ? second : first;
    }
}