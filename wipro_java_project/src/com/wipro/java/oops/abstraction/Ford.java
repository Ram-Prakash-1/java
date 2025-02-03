package com.wipro.java.oops.abstraction;

public class Ford extends Car {

	@Override
	void BodyType() {
		// TODO Auto-generated method stub
		System.out.println("Sedan");
	}

	@Override
	void fuel() {
		// TODO Auto-generated method stub
		System.out.println("Petrol");
		
	}
	public static void main(String args[]) {
		Ford ford=new Ford();
		ford.BodyType();
		ford.fuel();
	}

}
