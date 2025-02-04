package com.wipro.java.exception;

public class JavaExceptionExample1 {
	static int i=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=35,b=0,data,c;
		try {
			c=a/b;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("It will always execute");
		}
		

	}

}
