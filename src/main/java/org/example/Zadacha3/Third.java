package org.example.Zadacha3;
//Создать список из N элементов, содержащий объекты User(String name, int age).
// Значение N программа должна запросить с клавиатуры, данные пользователей User программа также должна запрашивать с клавиатуры. Вывести результат на экран.

import java.util.ArrayList;
import java.util.Scanner;
import org.example.User.*;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность списка:");
        int sizeOfList = scanner.nextInt();
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++) {
            System.out.println("Введите имя:");
            String name = scanner.next();
            System.out.println("Введите возраст:");
            int age = scanner.nextInt();
            User user = new User(name, age);
            users.add(user);
        }
        System.out.println("User list:\n" + users);
    }
}

