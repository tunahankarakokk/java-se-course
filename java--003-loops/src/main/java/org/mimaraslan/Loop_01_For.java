package org.mimaraslan;

public class Loop_01_For {
    public static void main(String[] args){
/*
        int a  = 10;


        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
*/
/*
                int b = 20;
             //başlangıç            SINIR                  ARTIŞ_MİKTARI
        for (   int i = 0;           i < 8;               i++) {
            System.out.println(b);
        }
*/

        String firstName = "Uğur";
        String lastName = "Semiz";
        //başlangıç            SINIR                  ARTIŞ_MİKTARI
        for (   int counter = 1;           counter<=5;               counter++) {
            System.out.println(counter + " - " + firstName + ' ' +  lastName);
        }

        System.out.println("----------KADEMELİ ARTTIRMA-----------------");


        for(int i = 0;i<180;i=i+4){ //i+=4
            System.out.println(i);
        }
//i++; = i=i+1;

        System.out.println("---------------AZALTMA---------------------");


        for(int i = 50;0<=i;i--){
            System.out.println(i);
        }
        System.out.println("----------KADEMELİ AZALTMA---------------------");


        for(int i = 50;0<=i;i=i-8){ //i-=8
            System.out.println(i);
        }

    }
}