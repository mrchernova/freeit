package com.chernova.homework_2;
/**
 * Написать программу, результатом работы которой будет вывод результата сравнения двух введенных чисел
 */

public class Task1_JavaComparison {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;

        if (a == b) {
            System.out.println(a + " = " + b);
        } else if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " < " + b);
        }

    }

}
