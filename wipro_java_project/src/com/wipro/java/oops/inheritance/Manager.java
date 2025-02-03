/**
 * 
 */
package com.wipro.java.oops.inheritance;

/** Parent class is Employee
 * child class is Manager
 *  extends is a Keyword
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
public static void main(String a[]) {
	//Child object is instantiated from child constructor
	//Parent class consumes the prop and behaviors of child class
	
	//Manager manager = new Manager();
	//Manager manager1=(Manager) new Employee();
	Employee employee = new Manager();
	employee.setEmpId(001);
	employee.setEmpAge(30);
	employee.setEmpDesignation("Manager");
	employee.setEmpName("Ram");
	employee.setEmpContact(995139929);
		
	System.out.println(employee.getEmpId());
	System.out.println(employee.getEmpName());
	System.out.println(employee.getEmpAge());
	System.out.println(employee.getEmpDesignation());
	System.out.println(employee.getEmpContact());
}


}
