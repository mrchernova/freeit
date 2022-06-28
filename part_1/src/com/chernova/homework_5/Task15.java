package com.chernova.homework_5;

import java.util.Random;

/**
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив).
 */

public class Task15 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();


        System.out.println("Дан массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Перевернутый массив:");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


    }
}
