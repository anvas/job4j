package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест.
 *
 *@author Andrey Vasiliev (admsocs@yandex.ru).
 *@version $Id$
 *@since 0.1
 */

public class MaxTest {

    /**
     * Когда first меньше second.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Когда first больше second.
     */
    @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(3, 1);
        assertThat(result, is(3));
    }

    /**
     * Когда first равен second.
     */
    @Test
    public void whenSecondEqualsFirst() {
        Max maxim = new Max();
        int result = maxim.max(2, 2);
        assertThat(result, is(2));
    }

}