package com.wipro.java.collection.usecase;


import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSort {
	public static void main(String[] args) {
		// Creating a LinkedList of Employee objects
		LinkedList<Employee> employees = new LinkedList<>();
		employees.add(new Employee(3, "Sree"));
		employees.add(new Employee(1, "Mani"));
		employees.add(new Employee(5, "Raju"));
		employees.add(new Employee(2, "Kiran"));
		employees.add(new Employee(4, "Jyothi"));

		// Sorting using the EmployeeIDComparator
		Collections.sort(employees, new EmployeeIDComparator());

		// Display sorted Employee list
		System.out.println("Sorted Employee List:");
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}