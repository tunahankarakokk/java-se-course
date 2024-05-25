package com.tunahankarakok.v1;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamdenListeye {
    public static void main(String[] args) {

        Stream <String> nyStream1 = Stream.of("Bariş","Emre","İbrahim","Emre","Seren","Hasan","Dilşat",
                "Çağdaş","Şener");
        TreeSet <String> myTreeSet1 = nyStream1.collect(TreeSet::new,TreeSet::add,TreeSet::addAll);
        System.out.println(myTreeSet1);
        System.out.println("------------------------------");

        Stream <String> nyStream2 = Stream.of("Bariş","Emre","İbrahim","Emre","Seren","Hasan","Dilşat",
                "Çağdaş","Şener");

        TreeSet <String> myTreeSet2 = nyStream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myTreeSet2);
        System.out.println("------------------------------");


        Stream <String> nyStream3 = Stream.of("Bariş","Emre","İbrahim","Emre","Seren","Hasan","Dilşat",
                "Çağdaş","Şener");
/*
        myStream3
                .sorted()
                .foreach(System.out::println);
  */


        TreeSet <String> myTreeSet3 = nyStream3.collect(Collectors.toCollection(TreeSet::new));

        System.out.println(myTreeSet3);

        //HATA VER?R CUNKU KULLANILDI.STREAM TEK KULLANIMLIKTIR.
        //TreeSet <String> myTreeSet4 = nyStream3.collect(Collectors.toCollection(TreeSet::new));
        //System.out.println(myTreeSet4);

        System.out.println("------------------------------");

        Stream <String> myStream4 = Stream.of("Bariş","Emre","İbrahim","Emre","Seren","Hasan","Dilşat",
                "Çağdaş","Şener");

        myStream4.sorted()
                .distinct()
                .forEach(System.out::println);

        System.out.println("--------MyStream5------------");

        Stream <String> myStream5 = Stream.of("Bariş","Emre","İbrahim","Emre","Seren","Hasan","Dilşat",
                "Çağdaş","Şener");

        myStream5
                //.sorted()
                //.distinct()
                .filter(isim -> isim.contains("e"))
                .forEach(System.out::println);

        System.out.println("---------MYstream6--------");

        Stream <String> myStream6 = Stream.of("Bariş","Emre","İbrahim","Emre","Seren","Hasan","Dilşat",
                "Çağdaş","Şener");

        myStream6
                //.sorted()
                //.distinct()
                .filter(isim -> !isim.contains("e") || isim.startsWith("S"))
                .forEach(System.out::println);

        System.out.println("---------MYstream7--------");

        Stream <String> myStream7 = Stream.of("Bariş","Emre","İbrahim","Emre","Seren","Hasan","Dilşat",
                "Çağdaş","Şener");

        HashSet <String> myHashSet = myStream7
                //.sorted()
                //.distinct()
                .filter(isim -> !isim.contains("e") || isim.startsWith("S"))
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(myHashSet);




        //TODO myHashSet bunu  foreach ile yazdır.

        System.out.println("--------------------------------");










        System.out.println("------------------------------");





    }




}
