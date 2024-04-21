package com.mimaraslan;

public class Arac {


    public int yasi;
   public String marka = new String();

    private Motor motor = new Motor();
    private Ayna ayna = new Ayna();
    private Depo depo =  new Depo();
    private Direksiyon direksiyon = new Direksiyon();
    private Koltuk koltuk = new Koltuk();
    public Arac() {
        System.out.println("Araç oluşturuldu.");
    }

    //set get

    //metotlar

  public String calistir(){

        //depo durumu kontrolü
        //depo kendi içinde yakıta bakacak yakit var mı?
       return "Calisti";
    }
}
