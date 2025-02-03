package com.wipro.java.oops.polymorphism;

public class Ford extends Car {

		public void carDetail() {
			System.out.println("Company : "+ getCompany());
			System.out.println("Body Type : "+ getBodyType());
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Ford();
		car.setBodyType("Sedan");
		car.setCompany("Ford");
		car.carDetail();

	}

}
