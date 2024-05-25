package com.tunahankarakok.impl;
class MyBaseThread implements Runnable {

    @Override
    public void run() {
        System.out.println("MyBaseThread is running : " + Thread.currentThread().getName());
    }


}
public class AppMain {

    public static void main(String[] args) {
        MyBaseThread myBaseThread = new MyBaseThread();
        System.out.println("Main thread started");
        myBaseThread.run();
    }
}
