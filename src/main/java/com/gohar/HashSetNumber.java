package com.gohar;

import java.util.HashSet;

public class HashSetNumber {
    public static void main(String[] args) {


        java.util.HashSet<Integer> number = new java.util.HashSet<>();
        number.add(1101010);
        number.add(1101011);
        number.add(1101012);
        number.add(1101013);
        number.add(1101014);
        System.out.println(number+"طباعه المجموعه الاول قبل اضافه اى شى ");

        System.out.println(   number.add(1101014)+" : لم يتم الاضافه لانه موجود بلفعل : ");

        Integer search = 1101013;
        if (number.contains(search)) {
            System.out.println("الرقم " + search + " موجود في المجموعة.");
        } else {
            System.out.println("الرقم " + search + " غير موجود في المجموعة.");
        }
    }
}
