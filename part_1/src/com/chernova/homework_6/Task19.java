package com.chernova.homework_6;

/**
 * Имеетсястрока с текстом. Подсчитать количество слов в тексте.
 * Слова могут разделяться несколькими пробелами.
 * В начале и конце текста тоже могут быть пробелы.
 */

public class Task19 {
    public static void main(String[] args) {
        String s = "  Дана строка    с    несколькими пробелами между   словами     ";
        System.out.println(s);

        s = s.trim();
        char[] c = s.toCharArray();

        s = "";
        for (int i = 0; i < c.length; i++) {
            s += c[i];

            while ((c[i] == ' ') && (c[i + 1] == ' ')) {
                i++;
            }
        }

        System.out.println("Количество слов в строке: " + s.split(" ").length);

    }
}

