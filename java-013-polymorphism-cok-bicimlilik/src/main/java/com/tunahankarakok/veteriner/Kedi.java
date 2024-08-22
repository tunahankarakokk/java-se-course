package com.tunahankarakok.veteriner;

import com.tunahankarakok.base.Hayvan;

public class Kedi extends Hayvan {
    public Kedi() {
        System.out.println("Kedi");
    }

    @Override
    public void sesVer(){
        System.out.println("Kedi : Miyav miyav");
    }

}

