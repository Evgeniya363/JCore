package ru.gb.jcore;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import java.util.List;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Manager extends Employee{
    public Manager(String name, String midName, String surName, String post, String phone, int salary, int birthdYear, int birthdMonth, int birthdDay) {
        super(name, midName, surName, post, phone, salary, birthdYear, birthdMonth, birthdDay);
    }

    public static void raiseSalary(List<Employee> employees, int age, int value) {
        for(Employee employee: employees) {
            if( !(employee instanceof Manager) && (employee.getAge() > age) ) {
                employee.raiseSalary(value);
//                System.out.println(employee instanceof Manager);
            }
        }
    }
}
