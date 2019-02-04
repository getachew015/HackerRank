package com.hackerrank.JavaEightFeatures.DefaultMethods;

public class PartTimeEmployee extends Employee {
	
	private double employeeSalary;

	@Override
	public double deductFoodFee(){
		//PartTimeEmployee implementation
		return 0;
	}
	
	public double calculateSalary(double salary){
		/* incase of static methods in interfaces they can only be accessed by directly calling
		 * the interface;
		 */
		
		return this.employeeSalary -= Remunerator.deductPension(salary);
	}

}
