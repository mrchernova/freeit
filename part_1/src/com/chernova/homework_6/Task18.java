package com.chernova.homework_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 */

public class Task18 {
    public static void main(String[] args) {

        String s = "Найти в строке не только запятые, но и другие знаки препинания... Подсчитать общее их количество.";
        int n = 0;
        int mn = 0;
        char c;

        System.out.println("Дана строко:");
        System.out.println(s);

        // ищем многоточие
        Pattern p = Pattern.compile("[.]{3}");
        Matcher m = p.matcher(s);
        while (m.find()) mn = mn + 2;

        // ищем остальные знаки препинания
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '.' || c == ',' || c == ':' || c == ';' || c == '-' || c == '(' || c == ')' || c == '!' || c == '?' || c == '\"') {
                n++;
            }
        }
        System.out.println("Знаков препинания в строке = " + (n - mn));

    }
}
