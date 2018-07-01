package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты, проверяющие программу проверки элементов квадратного массива.
 *
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class MatrixCheckTest {

    /*
     * Тест, проверяющий программу для нечетного количества элементов в массиве.
     */
    @Test
    public void whenDataMonoByTrueOddThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /*
     * Тест, проверяющий программу для нечетного количества элементов в массиве.
     */
    @Test
    public void whenDataNotMonoByTrueOddThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /*
     * Тест, проверяющий программу для четного количества элементов в массиве.
     */
    @Test
    public void whenDataMonoByTrueEvenThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false, true},
                {false, true, true, true},
                {true, true, true, false},
                {true, false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /*
     * Тест, проверяющий программу для четного количества элементов в массиве.
     */
    @Test
    public void whenDataMonoByTrueEvenThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false, false},
                {false, true, true, true},
                {true, true, true, false},
                {true, false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}