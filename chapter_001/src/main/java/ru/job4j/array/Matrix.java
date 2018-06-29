package ru.job4j.array;

/**
 * Программа создания матрицы.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Matrix {

    /**
     * Создает матрицу заданного размера.
     * @param size Размер матрицы.
     * @return Заполненная матрица.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}