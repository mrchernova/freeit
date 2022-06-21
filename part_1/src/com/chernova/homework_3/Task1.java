package com.chernova.homework_3;

import java.util.Scanner;

/**
 * Написать программу, которая приветствует пользователя в зависимости от его пола и возраста
 * (имя, пол и возраст задаются при старте программы)
 */

public class Task1 {
    public static void main(String[] args) {
        int age = 0;
        String name = "";
        String sex;


        Scanner scAge = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        while (!scAge.hasNextInt()) {
            System.out.println("Корректно введите свой возраст ");
            scAge.next();
        }
        age = scAge.nextInt();
        while (age < 0) {
            System.out.println("Корректно введите данные ");
            age = scAge.nextInt();
        }


        Scanner scName = new Scanner(System.in);
        System.out.println("Введите свое имя: ");
        name = scName.nextLine();


        Scanner scSex = new Scanner(System.in);
        System.out.println("Укажите свой пол (м или ж)(m or f) ");
        do {
            sex = scSex.nextLine();
        } while (!sex.equals("м") && !sex.equals("ж") && !sex.equals("m") && !sex.equals("f"));


        switch (sex) {
            case "m":
            case "м":
                if (age > 50) {
                    System.out.print("Добрый день, уважаемый " + name);
                } else {
                    System.out.print("Привет, красавчик " + name);
                }
                break;
            case "f":
            case "ж":
                if (age > 50) {
                    System.out.print("Добрый день, уважаемая " + name);
                } else {
                    System.out.print("Привет, красавица " + name);
                }
                break;
        }

    }
}
