package com.tunahankarakok._01_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        //arrayler sınırlıdır.Fakat listelerde böyle bir durum yoktur.Bir torba var bu ram o dolana kadar işlem yapılabilir.
/*      //Random erişimlerde ArrayList kullanılır.
        //Sıralı erişim yapacaksak LinkedList ile yapılır.          // *İş Mülakatı*
        Integer myNumber1;
        Integer myNumber2;
        Integer myNumber3;

        Integer [] myNumber;
*/
        /*
        List<Integer> mylist;//nesne referansı

        mylist = new ArrayList<>();

        System.out.println(mylist);
        */
        /*
        //Kalıp Sınıf            Personel
        int sira;
        String soyIsim;

    obj1 new  1-Eyüp Kaan
    obj2 new  2-Tarık Kamat
    obj3 new  3-Burak Çimtay
    objListesi = 0
*/
        ArrayList<Integer> myList1 = new ArrayList<>();//parantez içinde oluşturulacak max alan(initial Capacity) sayısını belirleyebiliriz


        myList1.add(10); //index 0
        myList1.add(8); //index 1
        myList1.add(20); //index 2
        myList1.add(7); //index 3
        myList1.add(7); //index 4
        myList1.add(7); //index 5
        myList1.add(null); //index 6
        //Liste hiçbir şey girmeyede izin verir.


        //ArrayList benim girdiğim sıraya göre kayıtları ekler.
        //

        System.out.println("Liste 1 Elemanları " + myList1);

        System.out.println("-------------------------------");
        ArrayList<String> myList2 = new ArrayList<>();
        myList2.add("Burak");//index 0
        myList2.add("Emre");//index 1
        myList2.add("Uğur");//index 2
        myList2.add("Emre");//index 3
        myList2.add("Emre");//index 4
        myList2.add("Emre");//index 5
        myList2.add("Emre");//index 6
        myList2.add(null); //index 7




        System.out.println("Liste 2 Elemanları "+myList2);
        System.out.println("--------------------------------------------");

        System.out.println("Liste 1 İçinde Arama :  "+myList1.contains(7));
        System.out.println("Liste 2 İçinde Arama : " + myList2.contains("Öykü"));
        System.out.println("Liste 2 İçinde Arama : " + myList2.contains("Emre"));

        System.out.println("-----------------------------------------------");

        System.out.println("Liste 1 ve Liste2 eşit mi ?: "+myList1.equals(myList2));

        ArrayList<String> myList3 = new ArrayList<>();
        myList3.add("Burak");//index 0
        myList3.add("Emre");//index 1
        myList3.add("Uğur");//index 2
        myList3.add("Emre");//index 3
        myList3.add("Emre");//index 4
        myList3.add("Emre");//index 5
        myList3.add("Emre");//index 6
        myList3.add(null); //index 7

        System.out.println("Liste 2 ve Liste3 equals eşit mi ? : "+myList2.equals(myList3));

        System.out.println("Liste 2 ve Liste3 == eşit mi ? : "+(myList2 == myList3));//bellekte durduğu adreslere bile baktığı için false çıkar

        ArrayList<String> myList4 = new ArrayList<>(100);



        System.out.println("Liste1  boyutu eleman sayısı: " + myList1.size());
        System.out.println("Liste2  boyutu eleman sayısı: " + myList2.size());
        System.out.println("Liste3  boyutu eleman sayısı: " + myList3.size());
        System.out.println("Liste4  boyutu eleman sayısı: " + myList4.size());

        System.out.println("Liste 1 dolu mu ? :" + !myList1.isEmpty());
        System.out.println("Liste 2 dolu mu ? :" + !myList2.isEmpty());
        System.out.println("Liste 3 dolu mu ? :" + !myList3.isEmpty());
        System.out.println("Liste 4 dolu mu ? :" + !myList4.isEmpty());

        System.out.println("------------------------------------------------");
        myList3.add("Abdullah");
        myList3.add("Kaan");
        myList3.add("Öykü");
        myList3.add("Kürşat");
        myList3.add("Emre");
        System.out.println(myList2.size() + " myList2 boyutu");
        System.out.println(myList3.size() + " myList3 boyutu");

        System.out.println(myList2);
        System.out.println(myList3);

        myList3.removeAll(myList2);
        System.out.println("Fark : " + myList3);
        System.out.println("Fark : " + myList3.size());

        System.out.println("Hash Code1 : " + myList1.hashCode());
        System.out.println("Hash Code2 : " + myList2.hashCode());
        System.out.println("Hash Code3 : " + myList3.hashCode());
        System.out.println("Hash Code4 : " + myList4.hashCode());

        myList4.add(0,"Barış");
        //myList3.add(3,"Barış");
        System.out.println(myList4);
        // myList4.add(50,"Barış"); var olmayan bir indexe veri ekleyemezsin oraya gidemezsin
        System.out.println("Hash Code4 : " + myList4.hashCode());

        myList4.add("Barış");
        //myList3.add(3,"Barış");
        System.out.println(myList4);
        // myList4.add(4,"Barış"); var olmayan bir indexe veri ekleyemezsin oraya gidemezsin
        System.out.println("Hash Code4 : " + myList4.hashCode());

        myList4.add("Dilşat");
        //myList3.add(3,"Barış");
        System.out.println(myList4);
        // myList4.add(4,"Barış"); var olmayan bir indexe veri ekleyemezsin oraya gidemezsin
        System.out.println("Hash Code4 : " + myList4.hashCode());

        myList4.add("Mustafa");
        //myList3.add(3,"Barış");
        System.out.println(myList4);
        // myList4.add(4,"Barış"); var olmayan bir indexe veri ekleyemezsin oraya gidemezsin
        System.out.println("Hash Code4 : " + myList4.hashCode());

        //myList4.remove(85); olmayan bir diziyi silemezsin
        System.out.println(myList4);
        System.out.println("Hash Code4 : " + myList4.hashCode());

        myList4.clear();
        System.out.println(myList4);
        System.out.println("Hash Code4 : " + myList4.hashCode());





    }
}
