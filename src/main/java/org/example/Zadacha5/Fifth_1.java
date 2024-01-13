package org.example.Zadacha5;
//Создать список, из нескольких объектов User и вывести на экран.
//Пройтись циклом forEach и удалить пользователей меньше определенного возраста. Вывести измененный список на экран.

import java.util.ArrayList;
import java.util.Iterator;

//Второй вариант удаления элемента с помощью Iterator
public class Fifth_1 {
    public static void main(String[] args) {
        ArrayList<User1> users = new ArrayList<>();
        users.add(new User1("Pavel", 29));
        users.add(new User1("Dima", 28));
        users.add(new User1("Zaur", 34));
        users.add(new User1("Misha", 30));

        for (User1 u1:users){
            System.out.println(u1.getName()+ " " + u1.getAge());
        }
        //удаление пользователей, чей возраст меньше 30 лет
        Iterator<User1> iterator = users.iterator();
        //итератор смотрит есть ли еще элемент
        while (iterator.hasNext()) {
            //объявляем следующий элемент
            User1 next = iterator.next();
            if (next.getAge() > 29) {
                iterator.remove();
            }
        }
        System.out.println("Пользователи, которым меньше 30 лет:");
        for (User1 u1:users){
            System.out.println(u1.getName()+ " " + u1.getAge());
        }
    }
}

class User1 {
    private String name;
    private int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
