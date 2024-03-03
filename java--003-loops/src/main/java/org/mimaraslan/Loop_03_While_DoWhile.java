package org.mimaraslan;

public class Loop_03_While_DoWhile {
    public static void main(String[] args) {
        System.out.println("------------FOR---------------");
        for (int i = 0; i < 4 ; i++) {
            System.out.println(i);
        }
        System.out.println("----------WHILE----------------");
        int i = 0; //BAŞLANGIÇ

        while(i<4){
            System.out.println(i);
            i++;//ARTIŞ YADA AZALTIM MİKTARI
        }
        System.out.println("----------DO WHILE-------------");
        int j = 0; //BAŞLANGIÇ

        do{//EN AZ 1 KERE ÇALIŞIR
            System.out.println(j);
            j++;//ARTIŞ YADA AZALTIM MİKTARI
        }
        while(5<j);//ŞART
    }
}
