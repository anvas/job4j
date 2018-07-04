package ru.job4j.array;

import java.util.Arrays;

/**
 * Программа удаления дубликатов в массиве.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicate {

    /**
     * Метод, убирающий все дубликаты строк из массива.
     *
     * @param array - исходный массив.
     * @return Массив без дублей.
     */
    public String[] remove(String[] array) {
        int element = array.length;
        for (int i = 0; i < element; i++) {
            for (int j = i + 1; j < element; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[element - 1];
                    element--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, element);
    }
}