package com.wipro.java.exception;

public class JavaExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=35,num2=0,res;
		try {
			res=num1/num2;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("It will always execute");
		}
		System.out.println("");
	}

}
