package com.wipro.java.collection.usecase;

public class Employee {
	private int id;
	private String name;

	// Constructor
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// toString() method for printing objects
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name;
	}
}