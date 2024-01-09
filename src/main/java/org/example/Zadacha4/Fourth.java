package org.example.Zadacha4;

import java.util.ArrayList;

//Создать список, из нескольких объектов User (можно задать в коде, без ввода с клавиатуры) и вывести на экран.
//Пройтись циклом for (с индексной переменной) и вывести на экран только пользователей, чей возраст больше определенного.
public class Fourth {
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