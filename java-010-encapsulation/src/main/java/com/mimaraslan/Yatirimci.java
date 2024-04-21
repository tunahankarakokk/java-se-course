package com.mimaraslan;

public class Yatirimci {
    private String adi;
    private String soyadi;
    private String subesi;

    private long hesapNo;
    private String ibanNo;
    private Float hesapTutari;

    public Yatirimci(String tunahan,String karakök,String merkez, long hesapNo,String number, float v) {
        System.out.println("Yatırımcı oluşturuldu - parametresiz.");
    }


    public Yatirimci(String adi, String soyadi, String subesi,
                     long hesapNo, String ibanNo, Float hesapTutari) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.subesi = subesi;
        this.hesapNo = hesapNo;
        this.ibanNo = ibanNo;
        this.hesapTutari = hesapTutari;
        System.out.println("Yatırımcı oluşturuldu - parametreli. 6 tane");
    }

    public Yatirimci(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
        System.out.println("Yatırımcı oluşturuldu - parametreli 2 tane");
    }

    public Yatirimci() {

    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    public long getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(long hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getIbanNo() {
        return ibanNo;
    }

    public void setIbanNo(String ibanNo) {
        this.ibanNo = ibanNo;
    }

    public Float getHesapTutari() {
        return hesapTutari;
    }

    public void setHesapTutari(Float hesapTutari) {
        this.hesapTutari = hesapTutari;
    }
}
