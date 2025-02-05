package com.wipro.java.collection;
import java.util.HashMap;
import java.util.Map;

public class MapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap where Integer is the key and string is the value
		Map<Integer, String> map = new HashMap<>();
		
		//Adding key-value pairs to the map
		map.put(1,  "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		//Accessing values by key
		System.out.println("Key 1: "+map.get(1)); // O/P: Apple
		System.out.println("Key 2: "+map.get(2)); // O/P: Banana
		
		//checking if a key exists in the map
		if(map.containsKey(2)) {
			System.out.println("Key 3 exists with the value : "+map.get(3)); //O/P: Cherry
			
		}
		
		//Iterating over the map using for-each loop
		System.out.println("\nIterating through the map : ");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
			
		}
		
		//Removing a key-Value pair
		map.remove(2); // Removes the key 2 (and its associated value)
		
		//Display the map after removal
		System.out.println("\nMap after removal of key 2 : ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
