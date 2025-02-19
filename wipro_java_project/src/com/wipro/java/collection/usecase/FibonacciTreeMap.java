package com.wipro.java.collection.usecase;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FibonacciTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        
        TreeMap<Integer, Long> fibonacciMap = new TreeMap<>();

        generateFibonacci(n, fibonacciMap);

        // Print the stored Fibonacci series
        System.out.println("\nFibonacci Series stored in TreeMap:");
        for (Map.Entry<Integer, Long> entry : fibonacciMap.entrySet()) {
            System.out.println("Term " + entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
    private static void generateFibonacci(int n, TreeMap<Integer, Long> map) {
        long first = 0, second = 1;
        
        for (int i = 1; i <= n; i++) {
            map.put(i, first); 
            long next = first + second;
            first = second;
            second = next;
        }
    }
}