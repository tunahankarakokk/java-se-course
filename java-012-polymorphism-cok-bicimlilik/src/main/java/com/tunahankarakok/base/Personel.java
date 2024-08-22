package com.tunahankarakok.base;

import lombok.*;
import org.w3c.dom.ls.LSOutput;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@ToString
@EqualsAndHashCode


public class Personel {
    private String adi;
    private String soyadi;
    private String telefonno;
    private String departmani;
    private int sicilNo;
    private String tahsilDurumu;
    private short tecrubeYili;

    public void bilgisiniYaz(Personel personel) {
        System.out.println("Adı :" + personel.getAdi());
        System.out.println("Soyadı : " + personel.getSoyadi());
        //TODO bu kısma gelecek şeyler var.
        System.out.println("Tecrübe Yılı : " + personel.getTecrubeYili());


    }

    public void hesapla() {

    }

    public void hesapla(int yil) {

    }

    public void hesapla(int yil,int ay) {   //int int

    }
    public void hesapla(short ay,int yil) {   //int int

    }
    public void hesapla(int yil,int ay,int gun) {   //int int int

    }
    public void hesapla(short ay,int yil,int gun) {   //short,int int

    }
    public void hesapla(int yil,int ay,short gun) {   //int,int short

    }
    public void hesapla(int yil,short ay,short gun) {   //int,short,int

    }
    public void hesapla(short yil,int ay,short gun) {   //short,int,short

    }
    public String hesapla(short yil,short ay,short gun) {   //short,short,short
        return "Selam";
    }




}
