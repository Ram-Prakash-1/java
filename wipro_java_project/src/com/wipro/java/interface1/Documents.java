package com.wipro.java.interface1;

public class Documents implements Showable,Printable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Documents doc1 = new Documents();
		doc1.show();
		doc1.print();

	}

}
