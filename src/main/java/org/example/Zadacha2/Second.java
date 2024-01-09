package org.example.Zadacha2;

//Создать список из пяти элементов и вывести на экран. Добавить один элемент, удалить другой элемент и вывести на экран.
import java.util.ArrayList;
import java.util.Random;

public class Second {
    public static void main(String[] args) {
        System.out.println("Изначальный список:");
        ArrayList<Integer> nums3 = printList(new ArrayList<>());
        System.out.println("Список после добавления элемента 777:");
        nums3.add(777);
        System.out.println(nums3.toString());
        System.out.println("Список после удаления 4го элемента:");
        nums3.remove(3);
        System.out.println(nums3.toString());
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
