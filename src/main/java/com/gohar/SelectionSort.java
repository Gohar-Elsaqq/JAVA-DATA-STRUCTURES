package com.gohar;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {15, 62, 63, 64, 5, 88, 7, 6, 5, 4, 4, 9, 44, 44, 55, 66, 4};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    //  Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            //Find the smallest element in the arranged matrix

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            //Switch smaller element with first element

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
