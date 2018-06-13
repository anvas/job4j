package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест, проверяющий заполнение массива степенями чисел.
 *
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class SquareTest {

    /**
     * Тест, проверяющий заполнение массива степенями 3-х чисел.
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * Тест, проверяющий заполнение массива степенями 5-ти чисел.
     */
    @Test
    public void whenBoundThen1491625() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }

    /**
     * Тест, проверяющий заполнение массива степенями 8-ми чисел.
     */
    @Test
    public void whenBoundThen1491625364964() {
        int bound = 8;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49, 64};
        assertThat(rst, is(expect));
    }
}