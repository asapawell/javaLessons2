package org.example.Zadacha8;
//То-же самое что в задаче 7, но результат сохранить в массив.

import org.example.User.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eighth {
    public static void main(String[] args) {
        List<User> usersList = new ArrayList<>();
        usersList.add(new User(new Name("Alex"), new Age(22)));
        usersList.add(new User(new Name("Mark"), new Age(12)));
        usersList.add(new User(new Name("Ashot"), new Age(14)));
        usersList.add(new User(new Name("Nina"), new Age(33)));
        usersList.add(new User(new Name("Tom"), new Age(30)));
        usersList.add(new User(new Name("Jim"), new Age(31)));
        System.out.println("User list:\n" + usersList);

        String[] array = usersList.stream()
                //преобразуем к стрингу
                .map(user -> "User: " + user.getName().getName() + "," + " age " + user.getAge().getAge())
                .toArray(String[]::new);
        System.out.println("User array:\n" + Arrays.toString(array));
    }
}
