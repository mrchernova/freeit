package com.chernova.homework_2;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 */

public class Task4 {
    public static void main(String[] args) {
        int n = 1030;
        int x;
        int a = 0;

        if (n >= 1000 && n <= 9999) {
            System.out.println("Вы ввели число " + n);
            for (int i = 0; i < 4; i++) {
                x = n % 10;
                a = a * 10 + x;
                n = n / 10;
            }
            System.out.println("Ваше число в обратном порядке = " + a);
        } else {
            System.out.println("Введенное число не 4-х значное или не натуральное");
        }
    }
}
