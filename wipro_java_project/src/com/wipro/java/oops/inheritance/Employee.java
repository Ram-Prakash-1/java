package com.wipro.java.oops.inheritance;
//POJO - Plain old java object 
//No constructor
//getter have return value
//setter have no return value
//prop are determine through setters
//tostring will convert entireEmployee class with prop and behaviors
public class Employee {

	private int empId; //This is Employee ID
	private int empAge; //This is Employee Age
	private String empName; //This is Employee Name
	private String empDesignation; //This is Employee Designation
	private int empContact; //This is Employee Contact number
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empAge=" + empAge + ", empName=" + empName + ", empDesignation="
				+ empDesignation + ", empContact=" + empContact + "]";
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}


	public int getEmpContact() {
		return empContact;
	}

	public void setEmpContact(int empContact) {
		this.empContact = empContact;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
