package org.example.Zadacha4;

import java.util.ArrayList;
import java.util.Collections;

import org.example.User.*;

//Создать список, из нескольких объектов User (можно задать в коде, без ввода с клавиатуры) и вывести на экран.
//Пройтись циклом for (с индексной переменной) и вывести на экран только пользователей, чей возраст больше определенного.
public class Fourth {
    public static void main(String[] args) throws UserException {
        ArrayList<User> users = new ArrayList<>();
        Collections.addAll(users,
                new User("RBeda",39),
                new User("SevAlieva",38),
                new User("MRyabov",55),
                new User("GAmidi",32));
        System.out.println("User list:\n" + users);
        System.out.println();
        System.out.println("Пользователи, чей возраст больше 35 лет:");
        for (User user : users) {
            if (user.getAge() > 35) {
                System.out.printf("%s, Возраст: %d\n", user.getName(), user.getAge());
            }
        }
    }
}

