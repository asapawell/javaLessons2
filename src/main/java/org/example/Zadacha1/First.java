package org.example.Zadacha1;

import java.util.Random;
//Создать массив из пяти элементов, содержащий целые числа и вывести на экран.

public class First {
    public static void main(String[] args) {
        int array[] = printArray(new int[5]);
    }

    public static int[] printArray(int[] array) {
        for (int i : array) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}