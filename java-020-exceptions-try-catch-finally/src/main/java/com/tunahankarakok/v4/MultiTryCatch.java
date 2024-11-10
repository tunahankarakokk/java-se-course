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

                //TODO bölme işlemini sağlıklı yapın -- CEVAP AŞAĞIDAKİ İF - ELSE ve try-catch bloğu
                /*
                if(sayi2!=0){
                    bolme = (float)sayi1 / (float)sayi2;
                    System.out.println("bolme : " + bolme);
                }else{
                    System.out.println("Bir sayı 0 a bölünemez.\n" +
                            "Lütfen farklı bir sayı ile tekrar deneyiniz !");
                }
                */
                try{
                    if(sayi2 ==0){
                        throw new ArithmeticException("Bölme işleminde bölen 0 olamaz");
                    }
                    bolme = (float) sayi1 / (float) sayi2;
                }catch (ArithmeticException e){
                    System.out.println(e.getMessage());
                }

               // hataDurumuFlag = false;


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
