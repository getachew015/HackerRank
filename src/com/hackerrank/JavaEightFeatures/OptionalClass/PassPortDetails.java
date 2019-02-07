package com.hackerrank.JavaEightFeatures.OptionalClass;

public class PassPortDetails {
	private int passPortNumber;
	private String name;
	
	public PassPortDetails(){
		
	}
	
	public PassPortDetails(int passPortNumber, String name) {
		super();
		this.passPortNumber = passPortNumber;
		this.name = name;
	}

	public int getPassPortNumber() {
		return passPortNumber;
	}
	public void setPassPortNumber(int passPortNumber) {
		this.passPortNumber = passPortNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
