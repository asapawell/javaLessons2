package org.example.Zadacha12;
//То же что в задаче №11, но удалить все записи с возрастом меньше среднего.
import org.example.User.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Twelveth {
    public static void main(String[] args) {
        Map<User, Integer> users = new HashMap<>();
        users.put(new User("Pavel"), 22);
        users.put(new User("Tom"), 29);
        users.put(new User("Oleg"), 33);
        users.put(new User("Dima"), 22);
        users.put(new User("Anton"), 40);
        users.put(new User("Max"), 28);
        System.out.println("Карта до удаления:");
        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            System.out.println(entry.getKey().getName() + ":" + entry.getValue());
        }

        //находим средний возраст
        int sumAllNums = 0;
        int count = 0;
        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            sumAllNums += entry.getValue();
            count++;
        }
        double avgAge = (double) sumAllNums / count;

        for (Iterator<Map.Entry<User, Integer>> it = users.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<User, Integer> entry = it.next();
            if (entry.getValue() < avgAge) {
                it.remove();
            }
        }
        System.out.println("Карта после удаления записей с возрастом меньше среднего:");
        for (Map.Entry<User, Integer> entry : users.entrySet()) {
            System.out.println(entry.getKey().getName() + ":" + entry.getValue());
        }
    }

}


