package com.hackerrank.JavaEightFeatures.Streams;

public class Employee {
	private int empId;
	private String empFirstName, empLastName;
	private double salary;
	
	public Employee(){
		
	}
	public Employee(int empId, String empFirstName, String empLastName, double salary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
