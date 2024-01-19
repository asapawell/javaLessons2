package org.example.Zadacha14;
//В карте из задачи №13 добавить/удалить значения из списка имен. Вывести итоговую карту на экран.

import java.util.*;

public class Fourteenth {
    public static void main(String[] args) {

        Map<Integer, ArrayList<String>> humans = new HashMap<>();
        humans.put(22, new ArrayList<>(Arrays.asList("Pavel", "Dima", "Max")));
        humans.put(23, new ArrayList<>(Arrays.asList("Ramzan", "Habib", "Antony")));
        humans.put(24, new ArrayList<>(Arrays.asList("Ilya", "Mitya", "Anatoly")));
        int count = 1;
        for (Map.Entry<Integer, ArrayList<String>> i : humans.entrySet()) {
            System.out.println(count + "." + "Age:" + i.getKey() + " people:" + i.getValue());
            count++;
        }
        //добавляем значение Andrey в первую запись и удалим значение Antony из второй записи
        //Создать список из всех ключей Map
        ArrayList<Integer> keys = new ArrayList<>(humans.keySet());
        //создаем переменные, где храним нужные ключи
        Integer firstKey = keys.get(0);
        Integer secondKey = keys.get(1);
        //создаем переменные для каждого ключа и значения Map
        for (Map.Entry<Integer, ArrayList<String>> i : humans.entrySet()) {
            Integer key = i.getKey();
            ArrayList<String> value = i.getValue();
            //обращаемся к ключу. если ключ равен первому ключу, то добавить в список значение с помощью метода add
            // класса ArrayList
            if (key.equals(firstKey)) {
                value.add("Andrey");
            }
            //если ключ равен второму ключу, то удалить значение с помощью remove
            else if (key.equals(secondKey)) {
                value.remove("Antony");
            }
        }
        System.out.println("Map after adding Andrey in first key and deleting Antony in second key:");
        int count1 = 1;
        for (Map.Entry<Integer, ArrayList<String>> i : humans.entrySet()) {
            System.out.println(count1 + "." + "Age:" + i.getKey() + " people:" + i.getValue());
            count1++;
        }


    }
}
