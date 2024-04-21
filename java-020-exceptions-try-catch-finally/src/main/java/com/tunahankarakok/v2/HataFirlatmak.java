package com.tunahankarakok.v2;

public class HataFirlatmak {

    public static void main(String[] args) {


        try {
            int sonuc = urunlerinSayisiniAlUnchecked(22);
            //int sonuc = urunlerinSayisiniAlchecked(0);
            System.out.println("Ürün Sayısı : " + sonuc);
        }catch(Exception e) {
            System.out.println("Hata : " + e.getMessage());
            //throw new RuntimeException();//bu koda gerek yok
        }finally {
            System.out.println("Teşekkürler");
        }



    }
    //Unchecked
    private static int urunlerinSayisiniAlUnchecked(int siloNo) {

        int uretilenUrunSayisi = 123;

        if(siloNo<1 || siloNo>25){
            throw new ArithmeticException("Silo sayısını lütfen doğru giriniz....");
        }
        else{
            return uretilenUrunSayisi;
        }

    }
    //Checked
    private static int urunlerinSayisiniAlchecked(int siloNo) throws Exception{

        int uretilenUrunSayisi = 123;

        if(siloNo<1 || siloNo>25){
            throw new ArithmeticException("Silo sayısını lütfen doğru giriniz....");
        }
        else{
            return uretilenUrunSayisi;
        }

    }


}
