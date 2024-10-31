package com.tunahankarakok;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
        fizzBuzz(i);
        }
    }
    static void fizzBuzz(int n){
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");

        }else if(n % 3 ==0){
            System.out.println("Fizz");
        }
        else if(n % 5 ==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(n);
        }
    }


}