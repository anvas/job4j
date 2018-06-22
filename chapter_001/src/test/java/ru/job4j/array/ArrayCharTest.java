package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест, проверяет, что слова начинаются в определенной последовательности.
 *
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class ArrayCharTest {

    /*
     * Тест проверяет, что слова совпадают.
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }

    /*
     * Тест проверяет, что слова не совпадают.
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }

    /*
     * Тест проверяет, что слова не совпадают.
     */
    @Test
    public void whenNotWordWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("World");
        boolean result = word.startWith("Worbd");
        assertThat(result, is(false));
    }

    /*
     * Тест проверяет, что слова совпадают.
     */
    @Test
    public void whenWordWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("World");
        boolean result = word.startWith("World");
        assertThat(result, is(true));
    }
}