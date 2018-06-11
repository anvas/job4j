package ru.job4j.loop;

/**
 * Программа - Вычисление факториала.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Factorial {

    int factorial = 1;

    /**
     * Метод возвращает рассчитанный факториал для числа.
     * @param n Аргумент.
     * @return Рассчитанный факториал.
     */

    public int calc(int n) {
        for (int index = 1; index <= n; index++) {
            factorial = factorial * index;
        }
        return factorial;
    }
}