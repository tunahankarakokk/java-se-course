package com.tunahankarakok._07_;

import java.util.*;

public class MyMap {

    public static void main(String[] args) {


        //KV(KEY VALUE) - ANAHTAR KELİMELER
        //kafasına göre gitmiş sıralamış
        //null girebiliriz
        //keyden 2 tane girersen son girdiğini alır
        //key değerleri 1 kere girilmeli value değeri ona göre alınır
        // Map mapList1 = new HashMap();
        Map<String, String> mapList1 = new HashMap();
        // Map<String,Integer> mapList1 = new HashMap();


        mapList1.put(null, "02");
        mapList1.put("Ankara", "006");
        mapList1.put("Konya", "42");
        mapList1.put("İzmir", "35");
        mapList1.put("Trabzon", "61");
        mapList1.put(null, "01");
        mapList1.put("Ağrı", null);
        //mapList1.put("Ankara" , "1453");
        mapList1.put(null, null);


        System.out.println("HashMap : " + mapList1);

        System.out.println("---------------------------------");
        Map<String, String> mapList2 = new LinkedHashMap<>();
        // Map<String,Integer> mapList1 = new HashMap();


        mapList2.put(null, "02");
        mapList2.put("Ankara", "006");
        mapList2.put("Konya", "42");
        mapList2.put("İzmir", "35");
        mapList2.put("Trabzon", "61");
        mapList2.put(null, "01");
        mapList2.put("Ağrı", null);
        //mapList2.put("Ankara" , "1453");
        mapList2.put(null, null);


        System.out.println("LinkedHashMap : " + mapList2);
        System.out.println("---------------------------------");

        Map<String, String> mapList3 = new TreeMap<>();
        // Map<String,Integer> mapList1 = new HashMap();

//treeMap
        //KEYLER NULL OLAMAZ

        // mapList3.put(null , "02");
        mapList3.put("Ankara", "006");
        mapList3.put("Konya", "42");
        mapList3.put("İzmir", "35");
        mapList3.put("Trabzon", "61");
        //mapList3.put(null,"01");
        mapList3.put("Ağrı", null);
        mapList3.put("Ankara", "1453");
        // mapList3.put(null,null);


        System.out.println("TreeMap : " + mapList3);
        System.out.println("---------------------------------");
        //FIXME plaka nolarının önündeki sıfır olacak
        // şekilde sıralanacak
        Map<Integer, String> mapList4 = new TreeMap<>();
        // Map<String,Integer> mapList1 = new HashMap();

//treeMap
        //KEYLER NULL OLAMAZ

        // mapList3.put(null , "02");
        mapList4.put(06, "Ankara");
        mapList4.put(42, "Konya");
        mapList4.put(35, "İzmir");
        mapList4.put(61, "Trabzon");
        //mapList3.put(null,"01");
          mapList4.put(04,"Ağrı");
        mapList4.put(1453, "Ankara");
        // mapList4.put(null,null);


        System.out.println("TreeMap : " + mapList4);
        System.out.println("---------------------------------");

        Map<String, String> mapList5 = new TreeMap<>();

        mapList5.put("06", "Ankara");
        mapList5.put("42", "Konya");
        mapList5.put("35", "İzmir");
        mapList5.put("61", "Trabzon");
        //mapList3.put(null,"01");
        mapList5.put("04","Ağrı");
        mapList5.put("1453", "Ankara");
        // mapList4.put(null,null);
        mapList5.remove("35");


        System.out.println("TreeMap : " + mapList5);
        for(String anahtar : mapList5.keySet()){
            System.out.println(anahtar+ " " + mapList5.get(anahtar));
        }

        System.out.println("-----------------------");
        Map<String, String> mapList6 = new Hashtable<>();
        //bunda keyde null olamaz value de nullolamaz

    //    mapList1.put(null, "02");
        mapList6.put("Ankara", "006");
        mapList6.put("Konya", "42");
        mapList6.put("İzmir", "35");
        mapList6.put("Adana", "06");
        mapList6.put("Çankırı", "18");
        mapList6.put("Kastamonu", "37");
        mapList6.put("Trabzon", "61");
       // mapList6.put(null, "01");
       // mapList6.put("Ağrı", null);
        //mapList6.put("Ankara" , "1453");
      //  mapList6.put(null, null);

        System.out.println("Hashtable : " + mapList6);
        //TODO sort yapılacak
        //a'dan z'ye z'den A'ya sıralama yap
        //0'dan 9'a  9'dan A'ya
    }
}
