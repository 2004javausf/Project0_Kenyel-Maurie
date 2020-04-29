package com.project.bean;

public class Employee {

	private String employeeUsername;
	private String employeePassword;
	
	public Employee() {
		super();
	}

	public Employee(String employeeUsername, String employeePassword) {
		super();
		this.employeeUsername = employeeUsername;
		this.employeePassword = employeePassword;
	}

	public String getEmployeeUsername() {
		return employeeUsername;
	}

	public void setEmployeeUsername(String employeeUsername) {
		this.employeeUsername = employeeUsername;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	@Override
	public String toString() {
		return "Employee [employeeUsername=" + employeeUsername + ", employeePassword=" + employeePassword + "]";
	}
	

}
