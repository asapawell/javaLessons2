package org.example.Zadacha6;
// Создать список, из нескольких объектов User и вывести на экран.
// Используя stream и его функции, найти средний и максимальный возраст пользователей. Вывести найденные значения на экран.

import java.util.ArrayList;
import java.util.List;

import org.example.User.*;

public class Sixth {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Pavel", 27));
        users.add(new User("Anton", 33));
        users.add(new User("Dima", 12));
        users.add(new User("Anna", 25));
        users.add(new User("Michael", 35));
        users.add(new User("Stepa", 21));
        users.add(new User("Maria", 31));
        System.out.println("User list: \n" + users);

        //Найдём средний возраст, создав поток с типом double
        double avgAge = users.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);
        System.out.printf("Average age of users is: %2f\n", avgAge);
        //Найдем максимальный возраст, создав поток с типом int
        int maxAge = users.stream()
                .mapToInt(User::getAge)
                .summaryStatistics()
                .getMax();
        System.out.println("Maximum age is: " + maxAge);
    }
}

