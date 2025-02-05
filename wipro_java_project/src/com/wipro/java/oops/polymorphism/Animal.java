package com.wipro.java.oops.polymorphism;

public class Animal {
	private String Type;

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	public void animalDetail() {
		System.out.println("Animal Type : "+Type);
	}
	

}
