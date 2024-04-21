package com.tunahankarakok;

import com.tunahankarakok.tasit.Taksi;
import com.tunahankarakok.tasit.Ucak;

public class AppMain {
    public static void main(String[] args) {
        Ucak ucak = new Ucak();
        ucak.setMarka("Boeing");
        ucak.setKoltukSayisi((short) 200);
        ucak.setTekerSayisi((short) 20);

        System.out.println(ucak);
        System.out.println("Bakım Durumu : " + ucak.bakimDurumu());
        System.out.println("Taşıt Vergisi : " + ucak.Tasitvergisi());

        System.out.println("Dernek Üye Durumu: " + ((ucak.dernekUyeDurumu() ? "EVET" : "HAYIR")));

        System.out.println("Taşıt Vergisi : " + ucak.bakimDurumu());
        System.out.println("Taşıt Vergisi : " + ucak.hizSiniri());

        System.out.println("Taşıt Vergisi : " + ucak.yolcuKapasitesi());
        System.out.println("Taşıt Vergisi : " + ucak.vizeDurumu());

        Taksi taksi = new Taksi();
       System.out.println("Ruhsat Durumu : " + (taksi.ruhsatDurumu(Boolean.TRUE) ? "VAR" : "YOK"));
       System.out.println("Ehliyet Durumu : " + (taksi.ehliyetGecerlilikDurumu(Boolean.TRUE) ? "VAR" : "YOK"));



    }
}