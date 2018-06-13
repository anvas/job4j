package ru.job4j.loop;

/**
 * Программа - Построение пирамиды в псевдографике.
 * @author Andrey Vasiliev (admsocs@yandex.ru).
 * @version $Id$
 * @since 0.1
 */

public class Paint {

    /**
     * Рисует пирамиду.
     * @param height высота доски.
     * @return Пирамида в псевдографике.
     */
    public String pyramid(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }
}