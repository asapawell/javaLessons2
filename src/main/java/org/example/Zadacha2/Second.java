package org.example.Zadacha2;

//Создать список из пяти элементов и вывести на экран. Добавить один элемент, удалить другой элемент и вывести на экран.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Second {
    public static void main(String[] args) {
        System.out.println("User list:");
        ArrayList<Integer> nums3 = printList(new ArrayList<>());
        System.out.println("List after adding 777:");
        nums3.add(777);
        System.out.println(nums3.toString());
        System.out.println("List after deleting fourth element:");
        nums3.remove(3);
        System.out.println(nums3.toString());
        System.out.println();
        //второй способ
        List<Integer> listOfNums = new ArrayList<>();
        Collections.addAll(listOfNums,3,32,33,21,5);
        System.out.println(listOfNums);
    }

    public static ArrayList<Integer> printList(ArrayList<Integer> list) {
        Random rnd = new Random();
        ArrayList<Integer> nums2 = new ArrayList<>();
        //цикл for до 5 тк капасити не задает длину списка, а задает максимальную вместимость. for each не знаю как использовать
        for (int i = 0; i < 5; i++) {
            nums2.add(rnd.nextInt(100));
        }
        System.out.println(nums2.toString());
        return nums2;
    }
}
