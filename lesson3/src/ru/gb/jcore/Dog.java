package ru.gb.jcore;

public class Dog extends Animal{
    public Dog(String name, String color, int birthdYear) {
        super(name, color, birthdYear);
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    void voice() {
        System.out.println(name + " barks");
    }
}
