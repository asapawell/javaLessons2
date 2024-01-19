package org.example.Zadacha5;

import org.example.User.*;

import java.util.ArrayList;
import java.util.Collections;

//Создать список, из нескольких объектов User и вывести на экран.
// Пройтись циклом forEach и удалить пользователей меньше определенного возраста. Вывести измененный список на экран.
public class Fifth {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Collections.addAll(users,
                new User("RBeda", 39),
                new User("SevAlieva", 38),
                new User("MRyabov", 55),
                new User("GAmidi", 32));

        System.out.println("User list:\n" + users);
        System.out.println();
        //через лямбду
        users.removeIf(user -> user.getAge() < 40);
        System.out.println("User list, where users 're older 40:\n" + users);

    }
}

