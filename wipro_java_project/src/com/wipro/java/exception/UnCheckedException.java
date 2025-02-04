package com.wipro.java.exception;

public class UnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int res=50/0;
		}
		catch(ArithmeticException e){
			System.out.println("Unchecked Exception : "+e.getMessage());
			
		}

	}

}
