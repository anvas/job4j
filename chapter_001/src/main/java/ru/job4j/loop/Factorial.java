package ru.job4j.loop;

/**
 * Программа - Вычисление факториала.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Factorial {

    /**
     * Метод возвращает рассчитанный факториал для числа.
     * @param n Аргумент.
     * @return Рассчитанный факториал.
     */

    public int calc(int n) {
        int factorial = 1;
        for (int index = 1; index <= n; index++) {
            factorial *= index;
        }
        return factorial;
    }
}