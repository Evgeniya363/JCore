package ru.gb.jcore.model.exceptions;

public class GenderException extends RuntimeException {
    public GenderException(String name) {
        super(String.format("Не задан пол для покупателя \"%s\"", name));
    }
}
