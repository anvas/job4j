package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест, заполнения массива true или false.
 *
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class CheckTest {

    /*
     * Тест для чётного количества элементов в массиве.
     */
    @Test
    public void whenDataMonoByTrueThenTrueTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /*
     * Тест для чётного количества элементов в массиве.
     */
    @Test
    public void whenDataMonoByFalseFalseFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /*
     * Тест для нечётного количества элементов в массиве.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}