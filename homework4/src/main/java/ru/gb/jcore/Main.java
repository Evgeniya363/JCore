package ru.gb.jcore;
/*
1. Написать классы покупатель (ФИО, возраст, телефон), товар (название, цена) и
заказ (объект покупатель, объект товар, целочисленное количество).
2. Создать массив покупателей (инициализировать 2 элемента), массив товаров
(инициализировать 5 элементов) и массив заказов (пустой на 5 элементов).
3. Создать статический метод «совершить покупку» со строковыми параметрами,
соответствующими полям объекта заказа. Метод должен вернуть объект заказа.
4. Если в метод передан несуществующий покупатель – метод должен выбросить
исключение CustomerException, если передан несуществующий товар, метод
должен выбросить исключение ProductException, если было передано отрицательное
 или слишком больше значение количества (например, 100), метод
должен выбросить исключение AmountException.
5. Вызвать метод совершения покупки несколько раз таким образом, чтобы заполнить массив покупок возвращаемыми значениями. Обработать исключения следующим образом (в заданном порядке):
– если был передан неверный товар – вывести в консоль сообщение об ошибке,
не совершать данную покупку;
– если было передано неверное количество – купить товар в количестве 1;
– если был передан неверный пользователь – завершить работу приложения
с исключением.
6. Вывести в консоль итоговое количество совершённых покупок после выполнения основного кода приложения.


 1. В класс покупателя добавить перечисление с гендерами, добавить в сотрудника свойство «пол» со значением созданного перечисления. Добавить геттеры,
сеттеры.
 2. Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля), написать метод, принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом, женщин с 8 марта,
а мужчин с 23 февраля, если сегодня соответствующий день
 */

import ru.gb.jcore.model.Gender;
import ru.gb.jcore.model.Holiday;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import static ru.gb.jcore.model.Gender.MALE;

public class Main {

    private static final Controller cp = new Controller();
    private static final DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException {

        cp.addCustomer("Jane", "Folk", df.parse("01.01.1990"),  "8(906)6758493");
        cp.addCustomer("Bob", "Brown", df.parse("02.02.1980"), "8(906)2130609");
        cp.addCustomer("Anna", "Voit", df.parse("31.12.1982"), "8(906)2130111");
        cp.addCustomer("Andrey", "Fedrs", df.parse("29.11.1978"), "8(906)2131212");
        cp.addCustomer("Olga", "Voit", df.parse("20.06.1960"), "8(906)4141111");
        cp.addCustomer("Anonim", "Customer", null, "no phone");


        cp.addProduct("Chicken", 5f, 10);
        cp.addProduct("Milk", 3f, 2);
        cp.addProduct("Meat", 8f, 5);
        cp.addProduct("eggs", 2f, 5);
        cp.addProduct("Bread", 1f, 2);
        cp.addProduct("Pies", 2f,  5);


        System.out.println(Controller.addOrder("Jane Folk", "Chicken",3));
        // System.out.println(cp.addOrder("Uqine God", "Meat",100));  // Исключение CustomerException роняет прогрпмму
        System.out.println(Controller.addOrder("Anna Voit", "Chicken",-1));  // AmountException - заказ 1 единицы
        System.out.println(Controller.addOrder("Bob Brown", "pet",3));  // ProductException - возвращает null
        System.out.println(Controller.addOrder("Bob Brown", "Chicken",100));  //AmountException  - заказ 1 единицы

        // Задаем пол покупателям
        cp.setGender("Jane Folk", Gender.FEMALE);
        cp.setGender("Uqine God", MALE);  // CustomerException - предусмотрен вывод сообщения
        cp.setGender("Anna Voit", Gender.FEMALE);
        cp.setGender("Bob Brown", MALE);
        cp.setGender("Andrty Fedrs", MALE);
        cp.setGender("Olga Voit", Gender.FEMALE);

        // Также используем конструктор с полным набором параметров
        cp.addCustomer("Dmitriy", "Dmitriev", df.parse("13.08.1977"), "8(906)5657782", MALE);

        // Выводим список покупателей
        System.out.println();
        System.out.println("Customers list:" + System.lineSeparator() + Controller.customersList());

        // Поздравляем покупателей с чем-нибудь (8 марта, Новый год, 23 февраля, Доброе утро))
        System.out.println();
        System.out.print("Поздравим покупателей сегодня! Введите текущую дату: ");
        Scanner scanner = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Holiday today;
        try {
            today = Holiday.getHoliday(df.parse(scanner.nextLine()));
            System.out.println(today);
            System.out.println(Controller.generateCongratulation(Controller.getCustomers(), today));
        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
        }
    }
}