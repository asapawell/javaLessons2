package org.example.Zadacha9;
//Создать список из нескольких объектов User и вывести на экран.
//Используя stream, увеличить возраст всех пользователей в 2 раза. Исходный список вывести на экран.

import org.example.User.*;
import java.util.ArrayList;
import java.util.List;

public class Nineth {
    public static void main(String[] args) throws UserException {
        List<User> users = new ArrayList<>();
        users.add(new User("Pavel", 27));
        users.add(new User("Anton", 33));
        users.add(new User("Dima", 12));
        users.add(new User("Anna", 25));
        users.add(new User("Michael", 35));
        users.add(new User("Stepa", 21));
        users.add(new User("Maria", 31));
        System.out.println("User list: \n" + users);
        System.out.println("Age raised by 2:");
        users.stream()
                .map(user -> {
                    try {
                        return new User(user.getName(),user.getAge() * 2);
                    } catch (UserException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toList()
                .forEach(System.out::println);
    }
}
