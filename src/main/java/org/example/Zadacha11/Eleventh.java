package org.example.Zadacha11;
//В карте из задачи №10 удалить записи с определенным возрастом, который запрашивается с клавиатуры. Вывести измененную карту на экран.

import org.example.User.*;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) throws UserException {
        Map<User, Integer> users = new HashMap<>();
        users.put(new User("Pavel"), 22);
        users.put(new User("Tom"), 29);
        users.put(new User("Oleg"), 33);
        users.put(new User("Dima"), 22);
        users.put(new User("Anton"), 40);
        users.put(new User("Max"), 28);
        System.out.println("Map before deleting:");
        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            System.out.println(entry.getKey().getName() + ":" + entry.getValue());
        }
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int age;
            try {
                System.out.println("Enter age to delete:");
                age = scanner.nextInt();
                if (users.containsValue(age)) {
                    users.entrySet().removeIf(entry -> entry.getValue() == age);
                } else {
                    System.out.println("Enter the age, that contains in map!");
                    continue;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Enter a number!");
                continue;
            }
            System.out.println("Map after deleting");
            for (Map.Entry<User, Integer> entry : users.entrySet()) {
                System.out.println(entry.getKey().getName() + ":" + entry.getValue());
            }
            break;
        }
    }
}