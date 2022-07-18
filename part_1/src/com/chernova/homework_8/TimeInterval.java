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


        t.add(new Time(120));
        t.add(new Time(1, 30, 500));

        for (int i = 0; i < t.size(); i++) {
            if ((t.get(i).seconds > 60 | t.get(i).minutes > 60)) {
                int seconds = t.get(i).seconds;
                t.get(i).seconds = seconds % 60;
                int minutes = ((seconds - t.get(i).seconds) / 60) + t.get(i).minutes;
                t.get(i).minutes = minutes % 60;
                t.get(i).hours = ((minutes - t.get(i).minutes) / 60) + t.get(i).hours;
                System.out.println(t.get(i));
            }
        }

/*
        Time a = new Time(1,10,5405);
        if ((a.seconds > 60 | a.minutes > 60)) {
            int seconds = a.seconds;
            a.seconds = seconds % 60;                                   // получили секунды
            int minutes = ((seconds - a.seconds) / 60) + a.minutes;     // к полученным минутам прибавляются введенные, если есть
            a.minutes = minutes % 60;                                   // получили минуты
            a.hours = ((minutes - a.minutes) / 60) + a.hours;           // получили часы
            System.out.println(a);
        }
*/

    }

    public static class Time {
        private int hours;
        private int minutes;
        private int seconds;

        public Time(int hours, int minutes, int seconds) {
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
            return "Time: " +
                    hours + " h " +
                    minutes + " min " +
                    seconds + " sec";
        }
    }
}
