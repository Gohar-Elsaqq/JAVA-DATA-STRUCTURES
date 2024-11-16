package com.gohar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsAPI {


    public static void main(String[] args) {


        List<Integer> numbers = IntStream.rangeClosed(5, 40).boxed().collect(Collectors.toList());

        List<Integer> evenNumbers  = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);
        List<Integer> squaredNumbers  = evenNumbers.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);
        int num = evenNumbers.stream().reduce(0,Integer::sum);
        System.out.println("Sum of even numbers: " + num);
        int average = (int) evenNumbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average of even numbers: " + average);
        int referenceValue =30;
        List<Integer> filteredNumbers = numbers.stream().filter(number -> number==referenceValue).collect(Collectors.toList());
        System.out.println("Numbers equal to reference value: " + filteredNumbers);

    }
}
