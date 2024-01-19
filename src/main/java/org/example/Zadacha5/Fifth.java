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
                new User("RBeda",39),
                new User("SevAlieva",38),
                new User("MRyabov",55),
                new User("GAmidi",32));

        System.out.println("User list:\n" + users);
        System.out.println();
        System.out.println("Обновленный список пользователей, чей возраст менее 40 лет:");
        //создаем новый список "К удалению". в него добавляем пользователей, чей возраст больше 40 лет
        ArrayList<User> toRemove = new ArrayList<>();
        for (User u : users) {
            if (u.getAge() > 40) {
                toRemove.add(u);
            }
        }
        //на вход методу передаем список к удалению, который удалит пользователей из изначального списка Users
        users.removeAll(toRemove);
        for (User u : users) {
            System.out.printf("%s, Возраст: %d\n", u.getName(), u.getAge());
        }
    }
}

