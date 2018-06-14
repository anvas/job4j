package ru.job4j.array;

/**
 * Программа - Поиска элемента в массиве перебором.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class FindLoop {

    /**
     * Метод поиска элемента.
     * @param el - искомый элемент.
     * @return индекс элемента.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}