package ru.job4j.array;

/**
 * Программа для сортировки массива методом перестановки.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort {

    /**
     * Метод, выполняющий сортировку.
     * @param array - несортированный массив.
     * @return отсортированный массив.
     */
    public int[] sort(int[] array) {
        for (int y = 0; y < array.length; y++) {
            for (int i = 0; i < array.length - y - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}