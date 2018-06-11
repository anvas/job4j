package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест - сумма четных чисел из диапазона.
 *
 *@author Andrey Vasiliev (admsocs@yandex.ru).
 *@version $Id$
 *@since 0.1
 */

public class CounterTest {

    /**
     * Тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }

    /**
     * Тест, проверяющий, что сумма чётных чисел от 5 до 20 при вызове метода counter.add будет равна 104.
     */
    @Test
    public void whenSumEvenNumbersFromFiveToTwentyThenHundredfour() {
        Counter counter = new Counter();
        int result = counter.add(5, 20);
        assertThat(result, is(104));
    }
}