package ru.job4j.array;

/**
 * Программа, переворачивающая массив.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Turn {

    /**
     * Метод
     * @param array - исходный массив.
     * @return перевернутый массив.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}