package com.tunahankarakok;

public class AppMain {
    public static void main(String[] args) {
    Mudur mudur = new Mudur();
    mudur.setAdi("Seren");
    mudur.setSoyadi("Aşkın");
    mudur.setTahsilDurumu("Üniversite");
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

    }
}
