package com.wipro.java.oops;
//POJO - Plain old java object 
public class Employee {
	private int empId; //This is Employee ID
	private int empAge; //This is Employee Age
	private String empName; //This is Employee Name
	private String empDesignation; //This is Employee Designation
	private int empContact; //This is Employee Contact number


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
