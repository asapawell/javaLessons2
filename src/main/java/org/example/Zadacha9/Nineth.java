package org.example.Zadacha9;
//Создать список из нескольких объектов User и вывести на экран.
//Используя stream, увеличить возраст всех пользователей в 2 раза. Исходный список вывести на экран.

import org.example.User.*;
import java.util.ArrayList;
import java.util.List;

public class Nineth {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(new Name("Pavel"), new Age(27)));
        users.add(new User(new Name("Anton"), new Age(33)));
        users.add(new User(new Name("Dima"), new Age(12)));
        users.add(new User(new Name("Anna"), new Age(25)));
        users.add(new User(new Name("Michael"), new Age(35)));
        users.add(new User(new Name("Stepa"), new Age(21)));
        users.add(new User(new Name("Maria"), new Age(31)));
        System.out.println("User list: \n" + users);
        System.out.println("Age raised by 2:");
        users.stream()
                .map(user -> new User(new Name(user.getName().getName()),new Age(user.getAge().getAge() * 2)))
                .toList()
                .forEach(System.out::println);
    }
}
