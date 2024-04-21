package com.tunahankarakok.v2;

public class Personel {
    public void ekranaYaz(){
        System.out.println("Ekrana Yaz");
    }
/*
    public void ekranaYaz(Integer sira, String ad) {
        System.out.println("Sıra " + sira  + " Ad " + ad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
    }


    public void ekranaYaz(Integer sira, String ad, String soyad) {
        System.out.println("Sıra " + sira  + " Ad " + ad + " Soyad : " + soyad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
        System.out.println(soyad.getClass());

    }

    public void ekranaYaz(String ad, String soyad,Integer sira) {
        System.out.println(" Ad " + ad + " Soyad : " + soyad + " Sıra " + sira);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
        System.out.println(soyad.getClass());

    }
    */
public <GelenTip1,GelenTip2> void ekranaYaz(GelenTip1 sira, GelenTip2 ad) {
    System.out.println("Sıra " + sira  + " Ad " + ad);
    System.out.println(sira.getClass());
    System.out.println(ad.getClass());
}
    public<GelenTip1,GelenTip2,GelenTip3> void ekranaYaz(GelenTip1 sira, GelenTip2 ad, GelenTip3 soyad) {
        System.out.println("Sıra " + sira  + " Ad " + ad + " Soyad : " + soyad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
        System.out.println(soyad.getClass());

    }
}
