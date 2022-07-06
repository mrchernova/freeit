package com.chernova.homework_7;

/**
 * Отсортировать записи в записной книжке по времени их добавления и вывеси в этом порядке в консоль
 */

import java.text.SimpleDateFormat;
import java.util.*;

public class NotebookSortByDate {
    public static void main(String[] args) {
        ArrayList<Notebook> notes = new ArrayList<Notebook>();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String s = "";
        System.out.println("Запишите задачу или нажмите \".\", если хотите перейти к списку");

        s = sc.nextLine();
        while (!s.equals(".")) {
            notes.add(new Notebook(s, new Date(122, rand.nextInt(13) + 1, rand.nextInt(32) + 1)));
            s = sc.nextLine();
        }

        // дополнительные задачи для примера
        notes.add(new Notebook("Покормить кота", new Date(122, rand.nextInt(13) + 1, rand.nextInt(32) + 1)));
        notes.add(new Notebook("Вынести мусор", new Date(122, rand.nextInt(13) + 1, rand.nextInt(32) + 1)));


        System.out.println("список задач до сортировки:");
        for (Notebook i : notes) {
            System.out.println(i);
        }

        Collections.sort(notes);

        System.out.println("\nсписок задач после сортировки:");
        for (Notebook i : notes) {
            System.out.println(i);
        }

    }


    public static class Notebook implements Comparable<Notebook> {
        private String note;
        private Date date;

        public Notebook(String note, Date date) {
            this.note = note;
            this.date = date;
        }


        // Сортировка сначала по дате, а потом по алфавиту
        @Override
        public int compareTo(Notebook o) {

            int result = this.date.compareTo(o.date);
            if (result == 0) {
                result = this.note.compareTo(o.note);
            }
            return result;
        }


        @Override
        public String toString() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            return sdf.format(date) + " | " + note;
        }
    }
}
