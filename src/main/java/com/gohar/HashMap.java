package com.gohar;


import java.util.List;
import java.util.Map;

public class HashMap {
    //Write a program that creates a HashMap with employee names as keys and salaries as values.
    // Then, sort the employees based on their salaries from lowest to highest.
    //Requirements:
    //
    //Use HashMap.
    //Print employees in order of their salaries.
    public static void main(String[] args) {

//        java.util.HashMap<String,Integer> emp = new java.util.HashMap<>();
//        emp.put("ahmed",50000);
//        emp.put("ali",60000);
//        emp.put("mohammad",45000);
//        emp.put("sara",50000);
//        List<Map.Entry<String, Integer>> list = new java.util.ArrayList<>(emp.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//
//        for (Map.Entry<String, Integer> entry : list) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
        // Add your own employees and salaries here.
        //Create a map (HashMap) to store employees' data so that it is:
        //The key is the employee number (ID).
        //Value is the employee's name.
        //Add 5 staff to the map.
        //Find an employee using the employee number (ID).
        //Print all staff in order to add data.
        //Delete an employee using the employee number (ID) and print the map after deletion.

        java.util.HashMap<Integer, String> employees = new java.util.HashMap<>();
        // Add 5 employees to the map
        employees.put(1, "Mohamed");
        employees.put(2, "Ali");
        employees.put(3, "Ahmed");
        employees.put(4, "Sara");
        employees.put(5, "Abdo");

        // Print all employees
        System.out.println("All employees:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Employee Name: " + entry.getValue());
        }

        // Search for an employee using the employee ID
        int searchId = 3;
        if (employees.containsKey(searchId)) {
            System.out.println("\nThe employee with ID " + searchId + " is: " + employees.get(searchId));
        } else {
            System.out.println("\nThe employee with ID " + searchId + " does not exist.");
        }

        // Remove an employee using the employee ID
        int removeId = 4;
        if (employees.containsKey(removeId)) {
            employees.remove(removeId);
            System.out.println("\nThe employee with ID " + removeId + " has been removed.");
        } else {
            System.out.println("\nThe employee with ID " + removeId + " does not exist.");
        }

        // Print the map after removing an employee
        System.out.println("\nEmployees after removal:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Employee Name: " + entry.getValue());
        }
    }
}