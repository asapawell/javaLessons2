package org.example.Zadacha7;
//Создать список, из нескольких объектов User и вывести на экран.
//Используя stream, отфильровать список по возрасту. Результат сохранить в новый список, который вывести на экран.

import org.example.User.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Seventh {
    public static void main(String[] args) {
        List<User> usersList = new ArrayList<>();
        usersList.add(new User(new Name("Alex"), new Age(22)));
        usersList.add(new User(new Name("Mark"), new Age(12)));
        usersList.add(new User(new Name("Ashot"), new Age(14)));
        usersList.add(new User(new Name("Nina"), new Age(33)));
        usersList.add(new User(new Name("Tom"), new Age(30)));
        usersList.add(new User(new Name("Jim"), new Age(31)));
        System.out.println("User list:\n" + usersList);

        List<User> filteredUsers = usersList.stream()
                .sorted(Comparator.comparing(user -> user.getAge().getAge()))
                .toList();
        System.out.println("Filtered user list by age: \n" + filteredUsers);
    }

}
