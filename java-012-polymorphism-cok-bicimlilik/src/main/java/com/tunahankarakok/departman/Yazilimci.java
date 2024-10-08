package com.tunahankarakok.departman;

import com.tunahankarakok.base.Personel;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Yazilimci extends Personel {
    private String calismaDurumu;
    /*
    public Yazilimci(String adi,
                     String soyadi,
                     String telefonNo,
                     String departmani,
                     int sicilNo,
                     String tahsilDurumu,
                     short tecrubeYili,
                     String calismaDurumu) {
        super(adi, soyadi, telefonNo, departmani, sicilNo, tahsilDurumu, tecrubeYili);
        this.calismaDurumu = calismaDurumu;
    }
    */

    public void bilgisiniYaz(Yazilimci yazilimci){
        System.out.println("Adı: " + yazilimci.getAdi() );
        System.out.println("Soyadı: " + yazilimci.getSoyadi() );
        // TODO bu kısma gelecek şeyler var.

        System.out.println("Çalışma Durumu: " + yazilimci.getCalismaDurumu());
    }
}

