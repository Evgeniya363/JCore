package ru.gb.jcore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1. Написать прототип компаратора - метод внутри класса сотрудника,
 сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
 без использования условного оператора.

2. Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя,
модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
кроме руководителей. В основной программе создайте руководителя и поместите его
в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите,
чтобы зарплата руководителя не повысилась.
 */

/**
 * Класс Main создает список сотрудников Employee, сортирует, выводит в консоль,
 * рассчитывает среднюю зп, средний возраст, увеличивает зп на 5000
 * всем сотрудникам, кроме Manager
 */

public class Main {
    private static final List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        // Инициализация списка сотрудников, вывод в консоль
        initEmployeesList();
        showEmployees( System.lineSeparator() + "List of employees");

        // Увеличиваем зп всем, кроме управляющего
        Manager.raiseSalary(employees, 45, 5000);
        showEmployees(System.lineSeparator() + "List of employees after salary increase");

        // Средний возраст, средняя зарплата
        System.out.println(System.lineSeparator() + "Average age: " + avgAge());
        System.out.println("Average salary: " + avgSalary());

        // Сортируем по возрасту вар.1 (по убыванию, используя интерфейс Comparable)
        Collections.sort(employees);
        showEmployees(System.lineSeparator() + "The list of employees sorted by age");

        // Сортируем по возрасту вар.2 (по убыванию, исп. интерфейс Comparator)
        employees.sort(new EmployeeDateComparator());
        showEmployees(System.lineSeparator() + "The list of employees sorted by age");
    }

    private static void showEmployees(String title) {
        System.out.println(title);
        employees.forEach(n -> System.out.println(n.toString()));
    }

    private static void initEmployeesList() {
        employees.add(new Employee("Ann", "Sergeevna", "Ivanova", "accountant", "+7(912)123-45-67", 30000, 1990, 1,1));
        employees.add(new Employee("Jane", "Sergeevna", "Ivanova", "programmer", "+7(912)123-99-65", 35000, 1976, 2,2));
        employees.add(new Employee("Bob", "Vladimirovich", "Kusto", "electronic", "+7(919)123-44-00", 40000, 1973,3,3));
        employees.add(new Manager("Lidia", "Borisovna", "Isakova", "mamager", "+7(920)123-20-01", 50000, 1978, 4, 4));
        employees.add(new Employee("Aleksey", "Ivanovich", "Chernov", "designer", "+7(920)123-88-11", 33000, 1999,5,5));
    }


    public static float avgAge() {
        int avgAge = 0;
        for(Employee employee: employees) {
            avgAge += employee.getAge();
        }
        return (float) avgAge / employees.size();
    }

    public static float avgSalary() {
        int avgS = 0;
        for (int i = 0; i < employees.size(); i++) {
            avgS += employees.get(i).getSalary();
        }
        return (float) avgS / employees.size();
    }


}
