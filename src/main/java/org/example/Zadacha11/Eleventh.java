package org.example.Zadacha11;
//В карте из задачи №10 удалить записи с определенным возрастом, который запрашивается с клавиатуры. Вывести измененную карту на экран.

import org.example.User.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Map<User, Integer> users = new HashMap<>();
        users.put(new User("Pavel"), 22);
        users.put(new User("Tom"), 29);
        users.put(new User("Oleg"), 33);
        users.put(new User("Dima"), 22);
        users.put(new User("Anton"), 40);
        users.put(new User("Max"), 28);
        System.out.println("Карта до удаления:");
        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            System.out.println(entry.getKey().getName() + ":" + entry.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст к удалению:");
        int age = scanner.nextInt();
        users.entrySet().removeIf(entry -> entry.getValue() == age);
        System.out.println("Карта после удаления");
        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            System.out.println(entry.getKey().getName() + ":" + entry.getValue());
        }
    }
}

