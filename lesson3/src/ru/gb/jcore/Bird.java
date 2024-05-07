package ru.gb.jcore;

public class Bird extends Animal {
    static int pawsCount = 2;

    public Bird(String name, String color, int birthdYear) {
        super(name, color, birthdYear);
    }

    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    void voice() {
        System.out.println(name + " tweets");
    }
}
