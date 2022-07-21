package com.chernova.homework_8;

import java.util.Scanner;

/**
 * Создать класс и объекты описывающие Банкомат.
 * Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
 * количеством купюр номиналом 20 50 100.
 * <p>
 * Сделать методы для добавления денег в банкомат.
 * Сделать функцию снимающую деньги.
 * <p>
 * На вход передается сумма денег.
 * На выход – булевское значение (операция удалась или нет).
 * <p>
 * При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
 * <p>
 * Создать конструктор с тремя параметрами – количеством купюр.
 */

public class ATM {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Money byn = new Money(1, 2, 5);
        Money byn = new Money(1, 0, 0);
        System.out.println(byn);
        int total = byn.cash100 * 100 + byn.cash50 * 50 + byn.cash20 * 20;
        System.out.println(total + " BYN");

        System.out.println("Do you want to withdraw money from an ATM or deposit cash in an ATM?");
        System.out.println("enter 'w' or 'd'");

        String s = sc.nextLine();

        switch (s) {
            case "w":
                withdraw(byn, total);
                break;
            case "d":
                deposit();
                break;
            default:
                System.out.println("I don't understand what do you want");
        }


    }

    public static void moneyInATM(int total, int m) {
        System.out.println("Money in ATM: " + (total + m) + " BYN");
    }



    public static void withdraw(Money byn, int total) {
        System.out.println("How much do you want to withdraw?");
        int m = sc.nextInt();
        // надо ж проверить или можно снять такую сумму
        // хз как
        if ((m <= total) && (m % 20 == 0 || m % 50 == 0 || m % 70 == 0)) {
            System.out.println("можно снять");
            System.out.println("Ok. Here your money: " + m);
            moneyInATM(total, -m);
        }else{
            System.out.println("нельзя снять");
        }



    }

    public static void deposit() {
        System.out.println("deposite");
    }

    private static class Money {
        private int cash100;
        private int cash50;
        private int cash20;

        private Money(int cash100, int cash50, int cash20) {
            this.cash100 = cash100;
            this.cash50 = cash50;
            this.cash20 = cash20;
        }

        @Override
        public String toString() {
            return "Money{" +
                    "cash100=" + cash100 +
                    ", cash50=" + cash50 +
                    ", cash20=" + cash20 +
                    '}';
        }
    }
}
