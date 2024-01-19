package org.example.User;

public class User {
    private final String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        setAge(age);
    }
    public User(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 1 && age < 110) {
            this.age = age;
        }
        else {
            System.out.println("Введите возраст от 1 до 110!");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "User: " + name + ", age " + age;
    }
}
