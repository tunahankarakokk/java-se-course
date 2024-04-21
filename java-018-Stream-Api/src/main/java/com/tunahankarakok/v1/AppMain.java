package com.tunahankarakok.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AppMain {
    public static void main(String[] args) {
        Stream <String> bosKayit = Stream.empty();//Stream için boş kayıt
        System.out.println(bosKayit);
        System.out.println("--------------------------------------");

        Stream <String> tekKayit = Stream.of("Ramazan");//Stream için boş kayıt
        System.out.println(tekKayit);
        System.out.println("--------------------------------------");

        Stream <String> cokluKayit = Stream.of("Ramazan","İlyas","Eyüp","Emre");//Stream için boş kayıt
        System.out.println(cokluKayit);
        System.out.println("--------------------------------------");

        //List <String> ogrenciListesi = new ArrayList<>();
        List<String> ogrenciListesi = List.of("Ramazan","İlyas","Eyüp","Emre");
        System.out.println("Öğrenci Listesi " + ogrenciListesi);
        System.out.println("--------------------------------------");

        Stream <String> ogrencilerStream = ogrenciListesi.stream();

        //ogrencilerStream.forEach(System.out::println);
        ogrencilerStream.forEach(ogrenci -> System.out.println(ogrenci));

        System.out.println("--------------------------------------");

        var kelimeDizisi = new String[] {"Barış","İbrahim","Seren","Hasan","Dilşat","Emre"};

        for(String kelime : kelimeDizisi){
            System.out.println(kelime);
        }



    }
}
