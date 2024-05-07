package ru.gb.jcore;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public abstract class Animal {
    static int pawsCount = 4;
    static int maxJampingHeight = 5;
    static int maxRunningDistance = 1000;
    static int maxSwimmingDistance = 100;
    static final int RANGES = 25;

    protected int jampingHeight;
    protected int runningDistance;
    protected int swimmingDistance;

    protected String name;
    private String color;
    private int birthdYear;

    public Animal(String name, String color, int birthdYear) {
        this.name = name;
        this.color = color;
        this.birthdYear = birthdYear;
        jampingHeight = randomValue(maxJampingHeight);
        runningDistance = randomValue(maxRunningDistance);
        swimmingDistance = randomValue(maxSwimmingDistance);
    }

    public Animal(String name, String color) {
        this(name, color, LocalDateTime.now().getYear());
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


    public int getAge() {
        return LocalDateTime.now().getYear() - birthdYear;
    }

    public String getInfo() {
        int age = getAge();
        return "name:" + name
                + ", color: " + color
                + ", age: "
                + ((age > 0) ? String.valueOf(age) : "less than a year")
                + ", JSR("
                + jampingHeight
                + "/" + runningDistance
                + "/" + swimmingDistance
                + ")";
    }

    void jump() {
        if(getAge() < 5) {
            System.out.println(name+" jumps");
        }
    }

    public boolean jump(int height) {
        return height <= jampingHeight;
    };
    boolean swim(int distance) {
        return distance <= swimmingDistance;
    };
    boolean run(int distance) {
        return distance <= runningDistance;
    };
    abstract void voice();
    private int randomValue(int value) {
        return new Random().nextInt(value * (100 - RANGES)/100, value + 1);
    }

}
