package org.mimaraslan;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        int sayi1 = 15;
        int sayi2 = 35;
        int sonuc = sayi1 + sayi2;

        System.out.println("Sayı 1 : " + sayi1);
        System.out.println("Sayı 2 : " + sayi2);
        System.out.println("Sonuc : " + sonuc);

        System.out.println("Toplama : " + (sayi1 + sayi2));
        System.out.println("Çıkarma : " + (sayi2-sayi1));
        System.out.println("Bölme : " + (sayi1 / sayi2));
        System.out.println("Çarpma : " + (sayi1 * sayi2));

        ChromeOptions options = new ChromeOptions();
        options.AddArguments("--remote-allow-origins="*");


    }
}