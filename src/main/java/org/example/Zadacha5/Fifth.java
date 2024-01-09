package org.example.Zadacha5;

import java.util.ArrayList;
//Создать список, из нескольких объектов User и вывести на экран.
// Пройтись циклом forEach и удалить пользователей меньше определенного возраста. Вывести измененный список на экран.
public class Fifth {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        User rBeda = new User();
        rBeda.setName("Beda");
        rBeda.setAge(22);
        users.add(rBeda);

        User sevAlieva = new User();
        sevAlieva.setName("Alieva");
        sevAlieva.setAge(77);
        users.add(sevAlieva);

        User gAmidi = new User();
        gAmidi.setName("Amidi");
        gAmidi.setAge(35);
        users.add(gAmidi);

        User mRyabov = new User();
        mRyabov.setName("Ryabov");
        mRyabov.setAge(45);
        users.add(mRyabov);

        int count = 1;
        for (User u : users) {
            System.out.printf("Пользователь %d: %s, Возраст: %d\n", count, u.getName(), u.getAge());
            count++;
        }
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

class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        if (age1 > 0 && age1 < 110)
            this.age = age1;
    }
}