package org.mimaraslan;

public class App_If {
    public static void main(String[] args) {

        System.out.println("----- IF ---------");
        int sayi = 3;
        if (5 < sayi) {
            System.out.println("Benim sayım : " + sayi);
        }


        System.out.println("----- IF ELSE ---------");
        int yas = 14;


        if (18 <= yas) {
            System.out.println("SAĞLIYOR , yas durumu : " + yas);
        } else {
            System.out.println("SAĞLAMIYOR , yas : " + yas);
        }

        System.out.println("----- IF ELSE-IF ELSE ---------");

        int puan = 56;

        if (puan >= 85 && puan <= 100) { //ŞART1
            System.out.println("5");

        } else if (puan >= 70 && puan <= 84) { //ŞART2
            System.out.println("4");

        } else if (puan >= 55 && puan <= 69) {//ŞART3
            System.out.println("3");

        } else if (puan >= 45 && puan <= 54) {
            System.out.println("2");

        } else {//HİÇBİRİ DEĞİLSE
            System.out.println("1");
        }


    }
}