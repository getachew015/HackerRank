package com.hackerrank.JavaEightFeatures.LambdaExpression;

public class Employee {
	private String name, address, phone;
	private int empId;
	private double salary;
	
	public Employee(String name, int empId, String address, String phone, double salary){
		this.name = name;
		this.empId = empId;
		this.address = address;
		this.phone = phone;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
