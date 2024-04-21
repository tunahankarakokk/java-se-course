package com.tunahankarakok.v4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTryCatch {
    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 0;
        int toplam = 0;
        Float bolme;
        boolean hataDurumuFlag = true;
        Scanner scanner = new Scanner(System.in);



        do{
            try {
                System.out.println("Lütfen 1.sayıyı giriniz : ");
                sayi1 = scanner.nextInt();
                System.out.println("Lütfen 2.sayıyı giriniz : ");
                sayi2 = scanner.nextInt();

                toplam = sayi1 + sayi2;
                System.out.println("toplam : " + toplam);

                bolme = (float)sayi1 / (float)sayi2;
                System.out.println("bolme : " + bolme);

               // hataDurumuFlag = false;

                //TODO bölme işlemini sağlıklı yapın
            }catch (ArithmeticException e){
                System.out.println("Hata Durumu "+ e);
                hataDurumuFlag = false;
            }catch (InputMismatchException e){
                System.out.println("Hata Durumu "+ e);
                hataDurumuFlag = false;
            }catch (RuntimeException e){
                System.out.println("Hata Durumu "+ e);
                hataDurumuFlag = false;
            }catch (Exception e){
                System.out.println("Hata Durumu "+ e);
                hataDurumuFlag = false;

            }
            finally {
                System.out.println("Teşekkürler....");
                hataDurumuFlag = false;


            }



        }while(hataDurumuFlag);{//false

        }
    }



}
