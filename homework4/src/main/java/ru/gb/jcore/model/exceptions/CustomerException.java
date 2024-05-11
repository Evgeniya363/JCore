package ru.gb.jcore.model.exceptions;

import java.io.IOException;

public class CustomerException extends RuntimeException {
    public CustomerException(String name) {
        super(String.format("Покупатель \"%s\" не зарегистрирован", name));
    }
}
