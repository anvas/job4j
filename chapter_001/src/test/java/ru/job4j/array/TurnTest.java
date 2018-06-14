package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест программы, переворачивающей массив.
 *
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class TurnTest {

    /*
     * Тест, проверяющий переворот массива с чётным числом элементов.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    /*
     * Тест, проверяющий переворот массива с нечётным числом элементов.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {5, 8, 6, 4, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 4, 6, 8, 5};
        assertThat(result, is(expect));
    }
}