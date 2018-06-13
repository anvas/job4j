package ru.job4j.array;

/**
 * Программа - Заполнение массива степенями чисел.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Square {

    /**
     * Метод, заполняющий массив элементами.
     * @param bound - последний входящий элемент.
     * @return заполненный массив.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int calc = 0; calc < bound; calc++) {
            rst[calc] = (int) Math.pow(calc + 1, 2);
        }
        return rst;
    }
}