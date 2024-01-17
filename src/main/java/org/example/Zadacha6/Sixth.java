package org.example.Zadacha6;
// Создать список, из нескольких объектов User и вывести на экран.
// Используя stream и его функции, найти средний и максимальный возраст пользователей. Вывести найденные значения на экран.

import java.util.ArrayList;
import java.util.List;

import org.example.User.*;

public class Sixth {
    public static void main(String[] args) {
        //Optional - может быть, а может не быть
        List<User> users = new ArrayList<>();
        users.add(new User(new Name("Pavel"), new Age(27)));
        users.add(new User(new Name("Anton"), new Age(33)));
        users.add(new User(new Name("Dima"), new Age(12)));
        users.add(new User(new Name("Anna"), new Age(25)));
        users.add(new User(new Name("Michael"), new Age(35)));
        users.add(new User(new Name("Stepa"), new Age(21)));
        users.add(new User(new Name("Maria"), new Age(31)));
        System.out.println("User list: \n" + users);

        //Найдём средний возраст, создав поток с типом double
        double avgAge = users.stream()
                .mapToDouble(user -> user.getAge().getAge())
                .average()
                .orElse(0);
        System.out.printf("Average age of users is: %2f\n", avgAge);
        //Найдем максимальный возраст, создав поток с типом int
        int maxAge = users.stream()
                .mapToInt(user -> user.getAge().getAge())
                .summaryStatistics()
                .getMax();
        System.out.println("Maximum age is: " + maxAge);
    }
}

