package com.chernova.homework_8;

import java.util.ArrayList;

/**
 * Создать класс и объекты описывающие промежуток времени.
 * Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте,
 * сравнения двух объектов (метод должен работать аналогично compareTo в строках).
 * Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды по отдельности.
 * Сделать метод для вывода данных.
 */

public class TimeInterval {
    public static void main(String[] args) {
        ArrayList<Time> t = new ArrayList<>();
        ArrayList<Integer> sec = new ArrayList<>();

        Time a = new Time(120);
        Time b = new Time(1, 30, 5);

        correctDate(a);
        System.out.println("time a:    " + a);
        correctDate(b);
        System.out.println("time b:    " + b);

        secondsOnly(a);
        System.out.println("\nseconds a: " + a);
        secondsOnly(b);
        System.out.println("seconds b: " + b);

        Time c = new Time(Math.abs(a.compareTo(b)));
        correctDate(c);
        System.out.println("\nTime intervel between a and b = " + c);


    }

    // перевод каких бы то ни было введенных данных в нормальное представление часов, минут, секунд
    public static Time correctDate(Time t) {
        int seconds = t.seconds;
        t.seconds = seconds % 60;
        int minutes = ((seconds - t.seconds) / 60) + t.minutes;
        t.minutes = minutes % 60;
        t.hours = ((minutes - t.minutes) / 60) + t.hours;
        return t;
    }

    // метод для получения полного количества секунд в объекте
    public static int secondsOnly(Time t) {
        t.seconds = (t.seconds + t.minutes * 60 + t.hours * 3600);
        t.hours = 0;
        t.minutes = 0;
        return t.seconds;
    }


    private static class Time implements Comparable<Time> {
        private int hours;
        private int minutes;
        private int seconds;

        private Time(int hours, int minutes, int seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        public Time(int seconds) {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = seconds;
        }

        @Override
        public String toString() {
            return hours + " h " +
                    minutes + " min " +
                    seconds + " sec";
        }

        @Override
        public int compareTo(Time t) {
            return this.seconds - t.seconds;
        }
    }
}
