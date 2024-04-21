package com.tunahankarakok.v1;

import java.util.ArrayList;

public class PersonelList<T> {
    T Bilgi;

    ArrayList<T> myArrayPersonList = new ArrayList();


    public void listeyeEkle(T veri) {
        myArrayPersonList.add(veri);
    }

    public ArrayList<T> listeyiGetir() {
        return myArrayPersonList;
    }
}
