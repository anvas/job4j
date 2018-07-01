package ru.job4j.array;

/**
 * Программа, проверки элементов квадратного массива.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class MatrixCheck {

    /**
     * Метод проверяет, элементы в массиве являются true или false.
     *
     * @param data - исходный массив.
     * @return результат.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1] || data[i][data.length - 1 - i] != data[i][i]) {
                result = false;
            }
        }
        return result;
    }
}