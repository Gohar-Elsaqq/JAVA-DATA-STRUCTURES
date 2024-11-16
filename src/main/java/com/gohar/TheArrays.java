package com.gohar;

import java.util.Arrays;

public class TheArrays {

    static String[] colors = new String[5];

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "black";
        colors[3] = "yellow";


        System.out.println("Colors array: " + Arrays.toString(colors));


        System.out.println("Colors length: " + colors.length);

        System.out.println("Iterating using for-each loop:");
        for (String color : colors) {
            if (color != null) {
                System.out.println(color);
            } else {
                System.out.println("No color assigned.");
            }
        }


        System.out.println("Iterating in reverse order:");
        for (int i = colors.length - 1; i >= 0; i--) {
            if (colors[i] != null) {
                System.out.println(colors[i]);
            } else {
                System.out.println("No color assigned.");
            }
        }


        int[] numbers = {100, 200};
        System.out.println("Numbers array: " + Arrays.toString(numbers));
    }
}
