/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flowers {
	String flowername;
	String flowercolour;
	
	
	Flowers(String name, String colour) {
		// TODO Auto-generated constructor stub
		this.flowername=name;
		this.flowercolour=colour;
	}
	void display() {
		System.out.println("flowername:"+flowername+" and flower colour is :"+flowercolour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flowers flowerobject1=new  Flowers("Rose","Red");
		Flowers flowerobject2=new  Flowers("Sunflower","yellow");
		Flowers flowerobject3=new  Flowers("lily","white");
		flowerobject1.display();
		flowerobject2.display();
		flowerobject3.display();
		

	}

}
