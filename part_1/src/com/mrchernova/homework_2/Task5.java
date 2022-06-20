package com.mrchernova.homework_2;

/**
 * Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
 * различны?
 */

public class Task5 {
    public static void main(String[] args) {

        int n = 1134;

        if (n >= 1000 && n <= 9999) {
            System.out.println("Вы ввели число " + n);

            int x1 = n % 10;
            int x2 = n / 10 % 10;
            int x3 = n / 100 % 10;
            int x4 = n / 1000 % 10;

            if (x1 != x2 && x1 != x3 && x1 != x4 && x2 != x3 && x2 != x4 && x3 != x4) {
                System.out.println("Все цифры числа " + n + " различны");
            } else {
                System.out.println("В числе " + n + " есть одинаковые цифры");
            }

        } else {
            System.out.println("Введенное число не 4-х значное или не натуральное");
        }

    }
}