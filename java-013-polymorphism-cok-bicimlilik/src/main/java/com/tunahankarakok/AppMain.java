package com.tunahankarakok;

import com.tunahankarakok.bahce.Ayi;
import com.tunahankarakok.base.Hayvan;
import com.tunahankarakok.veteriner.Kedi;
import com.tunahankarakok.veteriner.Kopek;
import com.tunahankarakok.veteriner.Kus;

public class AppMain {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        System.out.println("------------");
        Kopek kopek = new Kopek();
        System.out.println("------------");
        Kus kus = new Kus();
        System.out.println("------------");


        kedi.sesVer();
        kopek.sesVer();
        kus.sesVer();


        if(kedi instanceof Hayvan){
            System.out.println("Evet : " + kedi);
        }
        else{
            System.out.println("Hayır : " + kedi);
        }
        Hayvan hayvan = new Hayvan();
        //hayvan.sesVer();
        System.out.println("------------");
        Ayi ayi = new Ayi();
        ayi.sesVer();


    }
}
