package com.mimaraslan;

public class AppMain {
    public static void main(String[] args) {
        Yatirimci yatirimci1 = new Yatirimci();


        Yatirimci yatirimci2 = new Yatirimci("Tunahan", "Karakök", "Merkez",
                123456789L, "6541656516516516553", 1_000_000.55F);

        Yatirimci yatirimci3 = new Yatirimci("Barış", "Tatar");

        System.out.println(yatirimci1);
        System.out.println(yatirimci2);
        System.out.println(yatirimci3);
    }


}
