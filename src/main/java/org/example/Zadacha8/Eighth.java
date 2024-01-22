package org.example.Zadacha8;
//То-же самое что в задаче 7, но результат сохранить в массив.

import org.example.User.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eighth {
    public static void main(String[] args) throws UserException {
        List<User> usersList = new ArrayList<>();
        usersList.add(new User("Alex", 22));
        usersList.add(new User("Mark", 12));
        usersList.add(new User("Ashot", 14));
        usersList.add(new User("Nina", 33));
        usersList.add(new User("Tom", 30));
        usersList.add(new User("Jim", 31));
        System.out.println("User list:\n" + usersList);

        String[] array = usersList.stream()
                //преобразуем к стрингу
                .map(user -> "User: " + user.getName() + "," + " age " + user.getAge())
                .toArray(String[]::new);
        System.out.println("User array:\n" + Arrays.toString(array));
    }
}
