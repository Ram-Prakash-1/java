package com.wipro.java.oops.encapsulation;

public class Animal {

	public Animal(String name, String types, int age) {
		super();//calls the root parent class=object
		this.name = name;
		this.types= types;
        this.age = age;

	}
	
	private String name;
	private String types;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age>0) {
			this.age=age;
		}
		else
		System.out.println("Age must be positive");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String name) {
		this.types = types;
	}
 
	
	public static void main(String a[]) {
		
		Animal p1=new Animal("Cat","Mammal", 24);
		System.out.println(p1.getName());
		System.out.println(p1.getTypes());
		System.out.println(p1.getAge());
		
		
		p1.setAge(30);
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		p1.setAge(-2);
		
		
	}
	
}