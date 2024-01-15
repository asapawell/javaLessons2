package org.example.Zadacha6;

public class User {
    private Name name;
    private Age age;

    public User(Name name, Age age) {
        this.name = name;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Пользователь: " + name + ", возраст " + age;
    }
}
