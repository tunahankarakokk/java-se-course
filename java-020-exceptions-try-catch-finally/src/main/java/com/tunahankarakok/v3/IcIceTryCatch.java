package com.tunahankarakok.v3;

public class IcIceTryCatch {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 0;
        int toplam = 0;
        int bolme = 0;

        try {
            try {

                bolme = sayi1 / sayi2;
                System.out.println("İç Bölme sonucu : " + toplam);

            }catch (ArithmeticException e){
                System.out.println("İç Hata :" + e);
            }

            toplam = sayi2 + sayi2;
            System.out.println("Dış Toplama sonucu : " + toplam);

            bolme = sayi1 / sayi2;
            System.out.println("Dış Bölme sonucu : " + toplam);

        }catch (Exception e){
            System.out.println("Dış Hata :" + e);
        }finally {

        }
    }
}
