package com.tunahankarakok;

import lombok.*;

@Getter
@Setter
public class Mudur extends Personel{
private  Boolean  makamAraci;

    public Mudur() {
        //FIXME BU kısma gelir
    }


    public Mudur(String adi, String soyadi, String telefonno, String departmani,
                 int sicilNo, String tahsilDurumu, short tecrubeYili,
                 Boolean makamAraci) {
        super(adi, soyadi, telefonno, departmani, sicilNo, tahsilDurumu, tecrubeYili);
        this.makamAraci = makamAraci;
    }
    public void bilgisiniYaz(Mudur mudur){
        System.out.println("Adı : " + this.getAdi());
        System.out.println("Soyadı : " + this.getSoyadi());
        System.out.println("Sicil No :" + this.getSicilNo());
        //TODO bu kısma gelecek şeyler var;

        System.out.println("Soyadı : " + this.getMakamAraci());
    }

}
