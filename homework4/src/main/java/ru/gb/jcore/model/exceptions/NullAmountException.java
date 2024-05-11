package ru.gb.jcore.model.exceptions;

public class NullAmountException extends  RuntimeException{
    public NullAmountException(String name) {
        super(String.format("Нулевой остаток товара \"%s\" на складе", name));
    }
}
