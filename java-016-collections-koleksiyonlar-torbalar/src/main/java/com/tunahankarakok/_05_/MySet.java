package com.tunahankarakok._05_;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        //-----SET----
        //TEKRAR EDEN KAYIT YOK
        //HASHSETTE SENİN GİRDİĞİN SIRANIN önemi yok kafasına göre
        // BİR ÖNEMİ YOKTUR O KAFASINA GÖRE SIRALAR

        Set <String> studentList1 = new HashSet<>();
        HashSet <String> studentList2 = new HashSet<>();

        Set<String> studentList3 = new TreeSet<>();
        TreeSet<String> studentList4 = new TreeSet<>();

        Set<String> studentList5 = new LinkedHashSet<>();
        LinkedHashSet <String> studentList6 = new LinkedHashSet<>();

        studentList2.add("Fevzi");
        studentList2.add("İsmail");
        studentList2.add("Furkan");
        studentList2.add("Gözde");
        studentList2.add("Veysel");
        studentList2.add(null);//olur
        studentList2.add("Barış");
        studentList2.add("Barış");
        studentList2.add("Abdullah");
        studentList2.add(null);//olur
        studentList2.add("Barış");
        studentList2.add("Öykü");
        studentList2.add(null);//olur

        System.out.println("HashSet : " + studentList2);

        //treesette varsayılan olarak alfabeye göre sıralar yalnız türkçe karakter sıralamasında sıkıntı var
        //null değeri treesette olmaz

        //----TREESET----

        studentList4.add("Fevzi");
        studentList4.add("İsmail");
        studentList4.add("Furkan");
        studentList4.add("Gözde");
        studentList4.add("Veysel");
        studentList4.add("Abdullah");
        studentList4.add("Barış");
        studentList4.add("Barış");
        studentList4.add("Öykü");
        //studentList4.add(null);//olmaz



        System.out.println("TreeSet : " + studentList4);

//----LINKEDHASHSET----
        //senin girdiğin sıraya göre çıktı verir
        //veri tekrarı olmaz
        //NULL değeri alabilir
        studentList6.add("Fevzi");
        studentList6.add("İsmail");
        studentList6.add("Furkan");
        studentList6.add("Gözde");
        studentList6.add(null);//olmaz
        studentList6.add("Veysel");
        studentList6.add("Abdullah");
        studentList6.add("Barış");
        studentList6.add(null);//olmaz
        studentList6.add("Barış");
        studentList6.add("Öykü");
        studentList6.add(null);//oLur


        System.out.println("LinkedHashSet : " + studentList6);


    }

}
