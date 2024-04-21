package com.tunahankarakok;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class _06_MyQueue {
    public static void main(String[] args) {

        // QUEUE
        //null kabul etmez
        Queue <String> myQueue = new ArrayBlockingQueue<>(55);
        myQueue.add("Abdullah");
        myQueue.add("Fevzi");
        myQueue.add("İsmail");
        myQueue.add("Furkan");
        myQueue.add("Gözde");
        myQueue.add("Veysel");
       // myQueue.add(null);//olur
        myQueue.add("Barış");
        myQueue.add("Barış");
        myQueue.add("Abdullah");
        myQueue.add("Barış");
        myQueue.add("Öykü");


        System.out.println(myQueue);

        //PriorityQueue
        //KAYITLARI SIRALAR
        //NULL ALMAZ

        System.out.println("---------------------");
        Queue <String> myQueue2 = new PriorityQueue<>(25);
        myQueue2.add("Abdullah");
        myQueue2.add("Fevzi");
        myQueue2.add("İsmail");
        myQueue2.add("Furkan");
        myQueue2.add("Gözde");
        myQueue2.add("Veysel");
        // myQueue.add(null);//olur
        myQueue2.add("Barış");
        myQueue2.add("Barış");
        myQueue2.add("Abdullah");
        myQueue2.add("Barış");
        myQueue2.add("Öykü");


        System.out.println(myQueue2);




    }
}
