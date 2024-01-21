package org.example.Zadacha1;

import java.util.Arrays;
import java.util.Random;
//Создать массив из пяти элементов, содержащий целые числа и вывести на экран.

public class First {
    public static void main(String[] args) {

        printArray(new int[5]);
        System.out.println();
        //через toString
        Random rnd = new Random();
        int[] array =
                {rnd.nextInt(25), rnd.nextInt(25), rnd.nextInt(25), rnd.nextInt(25), rnd.nextInt(25)};
        System.out.println(Arrays.toString(array));
        //вариант через поток
        var arr = rnd
                .ints(5, 0, 100)
                .toArray();
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(100);
            System.out.print(array[i] + " ");
        }
    }
}