package org.example.Zadacha5;
//Создать список, из нескольких объектов User и вывести на экран.
//Пройтись циклом forEach и удалить пользователей меньше определенного возраста. Вывести измененный список на экран.
import org.example.User.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Второй вариант удаления элемента с помощью Iterator
public class Fifth_1 {
    public static void main(String[] args) throws UserException {
        ArrayList<User> users = new ArrayList<>();
        Collections.addAll(users,
                new User("RBeda",39),
                new User("SevAlieva",38),
                new User("MRyabov",55),
                new User("GAmidi",32));

        for (User u1:users){
            System.out.println(u1.getName()+ " " + u1.getAge());
        }
        //удаление пользователей, чей возраст меньше 30 лет
        Iterator<User> iterator = users.iterator();
        //итератор смотрит есть ли еще элемент
        while (iterator.hasNext()) {
            //объявляем следующий элемент
            User next = iterator.next();
            if (next.getAge() > 29) {
                iterator.remove();
            }
        }
        System.out.println("Пользователи, которым меньше 30 лет:");
        for (User u1:users){
            System.out.println(u1.getName()+ " " + u1.getAge());
        }
    }
}

