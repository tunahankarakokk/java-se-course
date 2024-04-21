package com.tunahankarakok;

public abstract class Hayvan extends Canli {
    public void yemekYe() {
        System.out.println("Hayvan : Yemek Ye");
    }

    public abstract void sesVer();

    protected abstract void hareketEt();

    protected abstract void bilgisiniGetir();
    //abstract classların gövdesiz olan metodlarında abstract kelimesi bulunur
    //abstract class yeni bir nesne oluşmaz
    //abstract classın içinde abstract class olur
    //miras alınır o zamanda class gibi davranır
    //bu en fazla miras alınır
    //javada çoklu miras alınamaz



    public void suIc(){
        System.out.println("Hayvan : Su iç");
    }
}
