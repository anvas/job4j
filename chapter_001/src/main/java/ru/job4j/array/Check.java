package ru.job4j.array;

/**
 * Программа, проверки элементов массива.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Check {

    /**
     * Метод проверяет, что все элементы в массиве являются true или false.
     * @param data - исходный массив.
     * @return результат.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}