package ru.gb.jcore.model.exceptions;

public class AmountException extends RuntimeException {
    public AmountException(int value, int maxValue) {
        super(String.format("Некорректное количество товара: %d. Доступный диапазон [1: %d]", value, maxValue));
    }
}
