package com.tunahankarakok._03_;

import java.util.Objects;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        // VEKTOR
        //EĞER NESNE YANINDA TÜRÜ BELİRTMEZSEN İSTEDİĞİN ŞEYİ GİRERSİN
        Vector vectorList = new Vector<>();
        vectorList.add(10);
        vectorList.add("Barış");
        vectorList.add(null);
        vectorList.add(14.53);
        vectorList.add(1.23f);
        vectorList.add(Boolean.TRUE);

        System.out.println(vectorList);
        System.out.println(vectorList.size());
        System.out.println(vectorList.firstElement());
        System.out.println(vectorList.lastElement());
        //System.out.println(vectorList.getFirst);
        //System.out.println(vectorList.getLast);
        System.out.println(vectorList.capacity());
        System.out.println(vectorList.isEmpty());
        System.out.println(vectorList.subList(2,3));


        for (int i = 0; i < vectorList.size(); i++) {
            if(vectorList.get(i) !=null){
                System.out.println("İndex : "+i+" "+vectorList.get(1).getClass());
            } else {
                System.out.println("İndex : "+i+" "+"\tbu değer null ");
            }
        }






    }
}
