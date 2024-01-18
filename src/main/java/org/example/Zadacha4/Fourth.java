package org.example.Zadacha4;

import java.util.ArrayList;
import java.util.Collections;

import org.example.User.*;

//Создать список, из нескольких объектов User (можно задать в коде, без ввода с клавиатуры) и вывести на экран.
//Пройтись циклом for (с индексной переменной) и вывести на экран только пользователей, чей возраст больше определенного.
public class Fourth {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Collections.addAll(users,
                new User("RBeda",39),
                new User("SevAlieva",38),
                new User("MRyabov",55),
                new User("GAmidi",32));

        int count = 1;
        for (int i = 0; i < users.size(); i++) {
            System.out.printf("Пользователь %d: %s, Возраст: %d\n", count, (users.get(i)).getName(), (users.get(i)).getAge());
            count++;
        }
        System.out.println();
        System.out.println("Пользователи, чей возраст больше 35 лет:");
        for (int i =0; i < users.size();i++) {
            if ((users.get(i)).getAge() > 35) {
                System.out.printf("%s, Возраст: %d\n", (users.get(i)).getName(), (users.get(i)).getAge());
            }
        }
    }
}

