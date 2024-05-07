package ru.gb.jcore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Класс ”Сотрудник”с полями: ФИО, должность, телефон, зарплата, возраст;
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee>{
    private String name;
    private String midName;
    private  String surName;
    private String post;
    private String phone;
    private  int salary;
    private int birthYear;
    private  int birthMonth;
    private  int birthDay;

    @Override
    public String toString() {
        return  "name: '" + name + '\'' +
                ", midName: '" + midName + '\'' +
                ", surName: '" + surName + '\'' +
                ", post: '" + post + '\'' +
                ", phone: '" + phone + '\'' +
                ", salary: " + salary +
                ", age: " + getAge();
    }

    public int getAge() {
        return LocalDateTime.now().getYear()- birthYear;
    }

    public void raiseSalary(int value) {
        salary += value;
    }

    @Override
    public int compareTo(Employee o) {
        return birthYear *1000000 + birthMonth *100 + birthDay - o.birthYear *1000000 + o.birthMonth*100 + o.birthDay;
    }

}
