package com.wipro.java.oops.polymorphism;

public class Turtles extends Animal {
	public void animalDetail() {
		System.out.println("Animal Type : "+getType());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Turtles();
		animal.setType("Reptiles");
		animal.animalDetail();

	}

}
