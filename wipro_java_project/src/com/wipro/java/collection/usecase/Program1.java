package com.wipro.java.collection.usecase;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program1 {
    public static void main(String[] args) {
        // Creating a TreeMap with some sample data
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Cherry");
        treeMap.put(5, "Mango");
        treeMap.put(4, "Orange");

        // Displaying the TreeMap (sorted order)
        System.out.println("TreeMap (Sorted): " + treeMap);
        
        // Converting TreeMap to HashMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);
        
        // Displaying the HashMap (Unordered)
        System.out.println("HashMap (Unordered): " + hashMap);
    }
}
