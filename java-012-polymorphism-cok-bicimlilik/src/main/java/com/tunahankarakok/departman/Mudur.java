package com.tunahankarakok.departman;

import com.tunahankarakok.base.Personel;
import lombok.*;

@Getter
@Setter
public class Mudur extends Personel {
    private Boolean makamAraci;

    public Mudur() {

    }


    public Mudur(String adi, String soyadi, String telefonno, String departmani,
                 int sicilNo, String tahsilDurumu, short tecrubeYili,
                 Boolean makamAraci) {
        super(adi, soyadi, telefonno, departmani, sicilNo, tahsilDurumu, tecrubeYili);
        this.makamAraci = makamAraci;
    }

    public void bilgisiniYaz(Mudur mudur) {
        System.out.println("Adı : " + this.getAdi());
        System.out.println("Soyadı : " + this.getSoyadi());
        System.out.println("Sicil No :" + this.getSicilNo());
        System.out.println("Tahsil Durumu :" + this.getTahsilDurumu());
        System.out.println("Tecrube Yili :" + this.getTecrubeYili());
        //TODO bu kısma gelecek şeyler var --- HALLLEDİLDİ :);

        System.out.println("Makam Araç Durumu  " + mudur.getMakamAraci());
    }

}
