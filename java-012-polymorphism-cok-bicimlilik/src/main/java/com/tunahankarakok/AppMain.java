package com.tunahankarakok;

import com.tunahankarakok.base.Personel;
import com.tunahankarakok.departman.Mudur;
import com.tunahankarakok.departman.Muhasebeci;
import com.tunahankarakok.departman.Yazilimci;

public class AppMain {
    public static void main(String[] args) {
    Mudur mudur = new Mudur();
    mudur.setAdi("Seren");
    mudur.setSoyadi("Aşkın");
    mudur.setTahsilDurumu("Lisans");
    mudur.setMakamAraci(true);
    mudur.setSicilNo(123_456);

    mudur.bilgisiniYaz(mudur);

        System.out.println("-----------------------------------");

        Yazilimci yazilimci=new Yazilimci();
        yazilimci.setAdi("Yasemin");
        yazilimci.setSoyadi("Basan");
        yazilimci.setTahsilDurumu("Yüksek Lisans");
        yazilimci.setCalismaDurumu("Uzaktan");
        yazilimci.setSicilNo(777_456);
        yazilimci.setTecrubeYili((short) 5);
        yazilimci.setDepartmani("ARGE");
        yazilimci.setTelefonno("011231246565");

        Muhasebeci muhasebeci=new Muhasebeci();
        muhasebeci.setAdi("Mustafa");
        muhasebeci.setSoyadi("Şenyurt");
        muhasebeci.setTahsilDurumu("Lisans");
        muhasebeci.setSicilNo(999_999);
        muhasebeci.setTecrubeYili((short) 12);
        muhasebeci.setDepartmani("Muhasebe");
        muhasebeci.setTelefonno("666666");
        muhasebeci.setUnvani("Mali Müşavir");
        muhasebeci.setYeminDurumu(Boolean.TRUE);

        System.out.println(muhasebeci);

        muhasebeci.bilgisiniYaz(muhasebeci);
        System.out.println("---------------------");

        Personel personel = new Personel();
        personel.hesapla((short) 10,10,10);
    }
}
