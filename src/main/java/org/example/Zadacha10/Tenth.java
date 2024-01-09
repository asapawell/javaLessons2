package org.example.Zadacha10;

import java.util.HashMap;
import java.util.Map;

//Создать карту в которой ключом должно являться имя, а значением возраст пользователя. Добавить несколько значений, вывести на экран.
public class Tenth {
    public static void main(String[] args) {
        Map<Person, Integer> people = new HashMap<>();
        people.put(new Person("Alex"), 28);
        people.put(new Person("Tom"), 12);
        people.put(new Person("Jim"), 44);
        for (Map.Entry<Person, Integer> item : people.entrySet()){
            System.out.printf("Имя: %s, Возраст: %d\n",item.getKey().getName(), item.getValue());
        }
    }
}

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
