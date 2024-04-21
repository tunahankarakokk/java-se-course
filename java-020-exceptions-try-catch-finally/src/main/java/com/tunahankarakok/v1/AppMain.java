package com.tunahankarakok.v1;

public class AppMain {
    public static void main(String[] args) {
        try {
            int sonuc = 2/0;
            System.out.println(sonuc);
            if (true){

            }
        }catch (Exception e){
            //code
            //logs
            System.out.println("Hata : " + e);
            System.out.println("Hata : " + e.getMessage());




        }
        System.out.println("-----------------------------------------------");
        try {
            sifiraBolmehatasi();
        }catch (Exception e){
            //code
            //logs
            System.out.println("Hata : " + e);

        }finally {
            System.out.println("Teşekkür ederiz");
            //scope her zaman çalışacak kodlar
        }
    }

    private static void sifiraBolmehatasi() {
        int sonuc = 2/0;
        //throw new ArithmeticException("Aritmetic Exception meydana geldi:");
    }
}