package org.example.Zadacha13;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Создать карту, где ключом является возраст, а значением - список имен (людей с таким возрастом).
// Добавить несколько записей. Должны быть люди с одинаковым возрастом. Вывести на экран.
public class Thirteenth {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> humans = new HashMap<>();
        humans.put(22, new ArrayList<>(Arrays.asList("Pavel", "Dima", "Max")));
        humans.put(23, new ArrayList<>(Arrays.asList("Ramzan", "Habib", "Antony")));
        humans.put(24, new ArrayList<>(Arrays.asList("Ilya", "Mitya", "Anatoly")));
        int count = 1;
        for (Map.Entry<Integer, ArrayList<String>> i:humans.entrySet()){
            System.out.println(count + "." + "Возраст:" + i.getKey() + " У людей:" + i.getValue());
            count++;
        }
    }
}
