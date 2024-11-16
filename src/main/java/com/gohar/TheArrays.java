package com.gohar;

import java.util.Arrays;

public class TheArrays {

    static String[] colors=new String[5];

    public static void main(String[] args) {
        String [] colors = new String[5];
        colors[0]="red";
       // get element
        // System.out.println(Arrays.toString(colors));
        colors[1]="black";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);
        colors[3]="yellow";

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        int[] numbers={100,200};
        System.out.println("Coloers length : "+colors.length);
        System.out.println("sort + "+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        for (int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }
        System.out.println("sort - "+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        for (int i=colors.length-1;i>=0;i--){
            System.out.println(colors[i]);

        }
    }
    }

