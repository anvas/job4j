package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест программы сортировки массива методом перестановки.
 *
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class BubbleSortTest {

    /*
     * Тест для массива с 10 элементами.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort element = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = element.sort(input);
        int[] expect = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));
    }

    /*
     * Тест для массива с 20 элементами.
     */
    @Test
    public void whenSortArrayWithTwentyElementsThenSortedArray() {
        BubbleSort element = new BubbleSort();
        int[] input = new int[] {6, 5, 14, 2, 3, 1, 2, 8, 0, 5, 4, 9, 11, 10, 3, 7, 6, 1, 17, 13};
        int[] result = element.sort(input);
        int[] expect = new int[] {0, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10, 11, 13, 14, 17};
        assertThat(result, is(expect));
    }
}