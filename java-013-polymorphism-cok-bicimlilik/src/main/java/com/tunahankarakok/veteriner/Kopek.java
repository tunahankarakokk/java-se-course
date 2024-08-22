package com.tunahankarakok.veteriner;

import com.tunahankarakok.base.Hayvan;

public class Kopek extends Hayvan {
    public Kopek() {
        super();
        System.out.println("Köpek");
    }

    @Override
    public void sesVer(){
        System.out.println("Köpek : Hav hav");
    }
}