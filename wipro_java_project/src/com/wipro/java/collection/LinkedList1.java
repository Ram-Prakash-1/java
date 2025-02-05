package com.wipro.java.collection;

import java.util.List;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//size of the LinkedList
		int n = 5;
		
		//Declaring the List with initial size n
		List<Integer> l1 = new LinkedList<Integer>();
		
		//Appending the new elements
		// at the end of the list
		//1,2,3,4:1
		for(int i=1; i<=n; i++) {
			l1.add(i);
		}
		//printing elements
		System.out.println(l1);
		
		//Remove elements at index
		l1.remove(3); // index
		
		//Displaying the list after deletion
		System.out.println(l1);
		
		//printing elements one by one
		for(int i=0;i<l1.size();i++)
			System.out.println(l1.get(i) + " ");

	}

}
