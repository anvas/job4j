package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест, проверяющий поиск элемента в массиве перебором.
 *
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class FindLoopTest {

    /*
     * Тест, находящий элемент 5 с индексом 0.
     */
    @Test
    public void whenArrayHasLength5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /*
     * Тест, ненаходящий элемент 4.
     */
    @Test
    public void whenArrayHasLength8Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 8, 3};
        int value = 4;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    /*
     * Тест, находящий элемент 23 с индексом 3.
     */
    @Test
    public void whenArrayHasLength23Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {4, 10, 5, 23, 3};
        int value = 23;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }
}