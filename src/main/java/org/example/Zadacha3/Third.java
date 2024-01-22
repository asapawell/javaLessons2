package org.example.Zadacha3;
//Создать список из N элементов, содержащий объекты User(String name, int age).
// Значение N программа должна запросить с клавиатуры, данные пользователей User программа также должна запрашивать с клавиатуры. Вывести результат на экран.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.example.User.*;

public class Third {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int sizeOfList;
            String name;
            int age;
            try {
                System.out.println("Enter size of list:");
                sizeOfList = scanner.nextInt();
                ArrayList<User> users = new ArrayList<>();
                for (int i = 0; i < sizeOfList; i++) {
                    System.out.println("Enter name:");
                    name = scanner.next();
                    System.out.println("Enter age:");
                    age = scanner.nextInt();
                    User user = new User(name, age);
                    users.add(user);
                }
                System.out.println("User list:\n" + users);
            } catch (UserException e) {
                System.out.println("Error:" + e.getMessage());
                continue;
            }
            catch (InputMismatchException e){
                System.out.println("Enter a number!");
                continue;
            }
            break;
        }
    }
}