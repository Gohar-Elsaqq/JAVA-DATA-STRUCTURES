package com.gohar;

import java.util.Random;

public class HashSet {
    //The second issue: Write a program that
    // creates a HashSet and adds some random numbers between 1 and 100 to it,
    // and then prints the numbers from 1 to 100 only.
    public static void main(String[] args) {
        java.util.HashSet<Integer> number = new java.util.HashSet<>();
        Random random = new Random();
        while (number.size() < 100) {
             int  numberRandom = random.nextInt(100) + 1;
            number.add(numberRandom);
            System.out.println("Generated random number: " + numberRandom);
        }
        System.out.println("\nUnique random numbers:");
        for (int num : number) {

            System.out.println(num);
        }
    }

//        for(int i=1;i<100;i++){
//            number.add(i);
//
//        }
//        for (int i =1 ; i <=100;i++){
//            System.out.println(i);
//        }
//    }
//    public static void main(String[] args) {
//        java.util.HashSet<Integer> number = new java.util.HashSet<>();
//
//        for (int i = 1; i <= 100; i++) {
//            number.add(i);
//        }
//
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
}
