package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * Тесты, проверяющие удаление дубликатов в массиве.
 *
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicateTest {

    /*
     * Тест, проверяющий удаление дубликатов строк из массива строк.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Новый", "Супер", "Мир", "Привет", "Мир"};
        String[] except = {"Привет", "Новый", "Супер", "Мир"};
        ArrayDuplicate array = new ArrayDuplicate();
        String[] result = array.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    /*
     * Тест, проверяющий удаление дубликатов строк из массива строк при одинаковых строках.
     */
    @Test
    public void whenRemoveDuplicatesAllDuplicateThenArrayWithoutDuplicate() {
        String[] input = {"Привет", "Привет", "Привет", "Привет", "Привет"};
        String[] except = {"Привет"};
        ArrayDuplicate array = new ArrayDuplicate();
        String[] result = array.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}