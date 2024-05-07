package ru.gb.jcore;

import java.time.LocalDateTime;

public class Cat extends Animal{
    static int count;
    private int id;
    public Cat(String name, String color, int birthdYear) {
        super(name, color, birthdYear);
        id = ++count;
    }

    public Cat(String name, String color) {
        this(name, color, LocalDateTime.now().getYear());
    }

    @Override
    void voice() {
        System.out.println(name + " meow");
    }

    @Override
    public String getInfo() {
        return  "id: " + id
                +", "+ super.getInfo();
    }

    @Override
    public boolean swim(int distance) {
        System.out.println(name + ": I'm afraid of water");
        return false;
    }
}
