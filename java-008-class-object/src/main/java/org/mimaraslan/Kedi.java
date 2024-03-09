package org.mimaraslan;

public class Kedi {//sınıflar birer kalıptır. --parantezlerin içi kapsam = scope demektir
    //declaration - bildirmek deklere etmek demektir
    int yas = 0;
    String rengi = "Belirtilmedi";


    //Constructor - yapıcı metod - hazırlayıcı metod - ilk hazırlık bir kere
    public Kedi(int yas, String rengi) {
        this.yas = yas;
        this.rengi = rengi;
    }


    /*
    //setter metodları
     'set' ler uygulama çalışırken(runtimeda) bu değerlerini dışarıdan değiştirebilmemizi sağlar.
    */
    public void setYas(int yas) {
        this.yas = yas;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public int getYas() {
        return yas;
    }

    public String getRengi() {
        return rengi;
    }

    public static void main(String[] args) {
        Kedi kedi1 = new Kedi(5, "Siyah");
        Kedi kedi2 = new Kedi(10, "Sari");
        Kedi kedi3 = new Kedi(15, "Beyaz");


        System.out.println("Kedi1 Özellikleri  -----> Yaş: " + kedi1.yas + " Rengi : " + kedi1.rengi);
        System.out.println("Kedi2 Özellikleri  -----> Yaş: " + kedi2.yas + " Rengi : " + kedi2.rengi);
        System.out.println("Kedi3 Özellikleri  -----> Yaş: " + kedi3.yas + " Rengi : " + kedi3.rengi);

        Kedi kedi4 = new Kedi(13, "");
        kedi4.setRengi("Alacalı");
        System.out.println("Kedi4 Özellikleri  -----> Yaş: " + kedi4.yas + " Rengi : " + kedi4.rengi);


        kedi1.setYas(6);//uygulama çalışırken değiştirdik
        kedi1.setRengi("Gri");//uygulama çalışırken değiştirdi
        //Ulke.Sehir.Semt.Mah.Cad.Sokak.Apartman
        System.out.println("set : Kedi1 Özellikleri  -----> Yaş: " + kedi1.yas + " Rengi : " + kedi1.rengi);

        //hiçbir değişken normal çağırılmaz onun yerine get metodu ile çağırılır.
        System.out.println("get : Kedi2 Özellikleri  -----> Yaş: " + kedi2.getYas() + " Rengi : " + kedi2.getRengi());
        System.out.println("get : Kedi3 Özellikleri  -----> Yaş: " + kedi3.getYas() + " Rengi : " + kedi3.getRengi());




    }
}
