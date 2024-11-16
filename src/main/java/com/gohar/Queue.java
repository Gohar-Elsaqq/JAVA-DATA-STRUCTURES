package com.gohar;


import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<String> queue = new LinkedList<>();
        queue.add("task 1");
        queue.add("task 2");
        queue.add("task 3");
        queue.add("task 4");
        queue.add("task 5");
        System.out.println("all task  : "+queue );
        String processedTask = queue.poll();

        System.out.println("Request processed: " + processedTask);
        System.out.println(queue);
        if(queue.isEmpty()) {
            System.out.println("Queue is  empty");
        }else {
            System.out.println("Remaining tasks: " + queue);
        }
    }
}
