package org.example.Zadacha3;
//Создать список из N элементов, содержащий объекты User(String name, int age).
// Значение N программа должна запросить с клавиатуры, данные пользователей User программа также должна запрашивать с клавиатуры. Вывести результат на экран.

import java.util.ArrayList;
import java.util.Scanner;

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
        for (User u : users) {
            System.out.println(u.getName() + " " + u.getAge());
        }
    }
}

class User {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //вопрос как использовать сеттер при конструкторе
    public void setAge(int age) {
        if (age > 0 && age < 110) {
            this.age = age;
        } else
            System.out.println("Введите число от 0 до 110!");
    }
}
