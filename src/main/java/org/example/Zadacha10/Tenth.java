package org.example.Zadacha10;

import org.example.User.*;
import java.util.HashMap;
import java.util.Map;

//Создать карту в которой ключом должно являться имя, а значением возраст пользователя. Добавить несколько значений, вывести на экран.
public class Tenth {
    public static void main(String[] args) {
        Map<User, Integer> people = new HashMap<>();
        people.put(new User("Alex"), 28);
        people.put(new User("Tom"), 12);
        people.put(new User("Jim"), 44);
        for (Map.Entry<User, Integer> item : people.entrySet()){
            System.out.printf("Имя: %s, Возраст: %d\n",item.getKey().getName(), item.getValue());
        }
    }
}

