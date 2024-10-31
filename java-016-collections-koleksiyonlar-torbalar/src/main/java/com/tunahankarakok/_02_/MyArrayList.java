package com.tunahankarakok._02_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> listStudent = new ArrayList<>();
        listStudent.add("Uğur");
        listStudent.add("Kürşat");
        listStudent.add("Mustafa");
        listStudent.add("Abdullah");
        listStudent.add("Burak");

        Collections.sort(listStudent); // a dan z ye sırala
        Collections.sort(listStudent, Collections.reverseOrder()); // z den a ya sıralama

        //-----------MÜLAKATTA ÇIKAR KAĞIDA YAZDIR DÖNGÜ DÖNMEYİ VE LİSTELEMEYİ ----------------------------

        //babadan kalma for
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }

        System.out.println("-------------------------");

        //for each - dizi liste gezmek için kullanılır
        for(String student : listStudent){
            System.out.println(student);
        }
        System.out.println("----------------------------");
        //lambda ile yazdırmak
        listStudent.forEach(student -> System.out.println(student));

        System.out.println("--------------------------------");

        String searchName;
        //ITERATOR
        Iterator<String> iterator = listStudent.iterator();

        while (iterator.hasNext()){
            searchName = iterator.next();
            if((searchName==iterator.next()) || (searchName.equals("Uğur")) ){
                iterator.remove();
            }

        }

        System.out.println(listStudent);


    }
    
}
