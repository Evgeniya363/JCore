package ru.gb.jcore.operations;
/**
 * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
 */
public class Decorator {
    /**
     * ункция декорирования числа для вывода в консоль
     * в виде строки с преамбулой 'Вот Ваше число'
     * @param a число, требующее декорации
     * @return Отформатированная строка.
     */
    public static String decorate(int a) {
        return String.format("Here is your number: %d.", a);

    }
}
