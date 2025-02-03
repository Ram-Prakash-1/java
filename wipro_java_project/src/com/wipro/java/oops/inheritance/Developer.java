/**
 * 
 */
package com.wipro.java.oops.inheritance;

/** Parent class Employee
 * Child class is Developer
 * extends is a Keyword
 */
public class Developer extends Employee	 {

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String a[]) {
	
	//Child object is instantiated from child constructor
	//Parent class consumes the prop and behaviors of child class
	
	//Developer developer = new Developer();
	//Developer developer1=(Developer) new Employee();
	Employee employee = new Developer();
	employee.setEmpId(002);
	employee.setEmpAge(21);
	employee.setEmpDesignation("Developer");
	employee.setEmpName("Ajay");
	employee.setEmpContact(935139930);
	
	System.out.println(employee.getEmpId());
	System.out.println(employee.getEmpName());
	System.out.println(employee.getEmpAge());
	System.out.println(employee.getEmpDesignation());
	System.out.println(employee.getEmpContact());
}

}
