package com.tunahankarakok;

public interface SanayiTeknolojiBakanligiKurallari {
    public void fiseTak();
    public void cipNo();

    public default void bakimHizmetiAl(){//bu şekil interface i bir adım abstract classlara yaklaştırdılar
        System.out.println("interface : bakimHizmetiAl");
    }
}
