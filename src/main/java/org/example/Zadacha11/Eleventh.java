package org.example.Zadacha11;
//В карте из задачи №10 удалить записи с определенным возрастом, который запрашивается с клавиатуры. Вывести измененную карту на экран.

import java.util.HashMap;
import java.util.Iterator;
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
        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            System.out.println(entry.getKey().getName() + ":" + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст к удалению:");
        int age = scanner.nextInt();
        for (Iterator<Map.Entry<User, Integer>> it = users.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<User, Integer> entry = it.next();
            if (entry.getValue().equals(age)) {
                it.remove();
            }
        }
        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            System.out.println(entry.getKey().getName() + ":" + entry.getValue());
        }
    }
}

class User {
    private final String name;

    User(String name) {this.name = name;}

    public String getName() {return name;}
}
