package ru.gb.jcore;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Barsik", "black", 2020));
        animals.add(new Cat("Murzik", "white"));
        animals.add(new Dog("Muha", "black", 2019));
        animals.add(new Dog("Dick", "white"));
        animals.add(new Bird("Charli", "green",2023));
        animals.add(new Cat("Markiz", "gray"));
        for(Animal animal: animals) {
            System.out.println(animal.getInfo());
//            animal.voice();
//            animal.jump();
            System.out.println(animal.jump(4));
            System.out.println(animal.run(800));
            System.out.println(animal.swim(90));
        }
    }
}