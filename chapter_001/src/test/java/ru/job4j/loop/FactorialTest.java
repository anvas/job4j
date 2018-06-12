package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест - вычисления факториала.
 *
 *@author Andrey Vasiliev (admsocs@yandex.ru).
 *@version $Id$
 *@since 0.1
 */

public class FactorialTest {

    /**
     * Тест, проверяющий, что факториал для числа 5 равен 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial calculate = new Factorial();
        int result = calculate.calc(5);
        assertThat(result, is(120));
    }

    /**
     * Тест, проверяющий, что факториал для числа 0 равен 1.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial calculate = new Factorial();
        int result = calculate.calc(0);
        assertThat(result, is(1));
    }
}