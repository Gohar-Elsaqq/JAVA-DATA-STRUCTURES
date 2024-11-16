package com.gohar;

import java.util.Collections;

public class ArrayList {
    //The first task: Write a program that creates an ArrayList containing the names of students, then sorts the names alphabetically.
    //
    //Requirements:
    //
    //Use ArrayList.
    //Sort alphabetically using Collections.sort().
    //Ensure that the program handles case-insensitive sorting.
    public static void main(String[] args) {

        java.util.ArrayList<String> name= new java.util.ArrayList<>();
        name.add("zyaed");
        name.add("dinal");
        name.add("mohamed");
        name.add("ahmed");

        Collections.sort(name);
        System.out.println(name);
    }
}
