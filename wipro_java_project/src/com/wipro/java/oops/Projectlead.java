package com.wipro.java.oops;
/**
 * Parent class is Employee
 * Child class is ProjectLead
 * extends is a Keyword
 */
public class Projectlead extends Employee {

	public Projectlead() {
		// TODO Auto-generated constructor stub
	}
public static void main(String a[]) {
	//Child object is instantiated from child constructor
	//Parent class consumes the prop and behaviors of child class
	
	//ProjectLead projectlead = new ProjectLead();
	//ProjectLead teamlead1=(ProjectLead) new Employee();
	Employee employee = new Projectlead();
	employee.setEmpId(1234);
	employee.setEmpName("Ram");
	employee.setEmpAge(25);
	employee.setEmpDesignation("ProjectLead");
	employee.setEmpContact(925139920);
	
	System.out.println(employee.getEmpId());
	System.out.println(employee.getEmpName());
	System.out.println(employee.getEmpAge());
	System.out.println(employee.getEmpDesignation());
	System.out.println(employee.getEmpContact());
}
	

}
