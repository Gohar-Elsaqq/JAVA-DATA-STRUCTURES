package com.gohar;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class List {
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
        name.add("lolo");
        name.add("ffofofo");
        name.add("sara");
        name.add("ffofofo");
        name.add("taha");
        name.add("angy");
        Set<String> uniqueSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();
        for (String item : name) {
            if (!uniqueSet.add(item)) {
                duplicateSet.add(item);
            }
        }
        System.out.println(duplicateSet);
    }
}
