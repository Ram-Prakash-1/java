package com.wipro.java.interface1;

public class Cow implements Animal {
	
	public void makeSound() {
		System.out.println("moos");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cow1 = new Cow();
		cow1.makeSound();

	}

}
