package com.tunahankarakok._04_;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack <String> stackList = new Stack<>();

        stackList.push("Fevzi");
        stackList.push("Furkan");
        stackList.push("Gözde");
        stackList.push("Barış");

        stackList.add("Eyüp");
        stackList.add(2,"Abdullah");

        System.out.println(stackList);

        stackList.pop();//en üstteki en son eklenen öğeyi çıkarır

        System.out.println(stackList);

        System.out.println(stackList.peek());//en sonda duranı alıyor
        System.out.println(stackList.search("Fevzi"));//arama yapar
        System.out.println(stackList.empty());//boş mu
        System.out.println(stackList.isEmpty());//boş mu


    }

}
