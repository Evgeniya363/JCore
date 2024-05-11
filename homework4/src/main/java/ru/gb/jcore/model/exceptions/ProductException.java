package ru.gb.jcore.model.exceptions;

public class ProductException extends RuntimeException{
    public ProductException(String name) {
        super(String.format("Товар \"%s\" отсутствует на складе", name));
    }
}
