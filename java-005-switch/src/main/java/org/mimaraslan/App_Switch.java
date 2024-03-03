package org.mimaraslan;

public class App_Switch {
    public static void main(String[] args) {
    /*
        if( ŞARTI )){
        }else if(){

        } else if (){

        } else if () {

        } else if () {

        }else{

        }
*/
        int secilen=8;

        switch (secilen){

            case  0:
                System.out.println("Gidilecek menu : " + secilen);
            break;
            case  1:
                System.out.println("Gidilecek menu: " + secilen);
                break;
            case  2:
                System.out.println("Gidilecek menu: " + secilen);

                break;
            case  3:
                System.out.println("Gidilecek menu: " + secilen);
                break;
            case  4:
                System.out.println("Gidilecek menu: " + secilen);
                break;
            default:
                System.out.println("Ana menuye gidilecek");
                break;
        }

    }
}