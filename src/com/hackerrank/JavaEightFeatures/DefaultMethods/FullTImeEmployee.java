package com.hackerrank.JavaEightFeatures.DefaultMethods;

import com.hackerrank.JavaEightFeatures.RepeatingAnnotation.Author;
import com.hackerrank.JavaEightFeatures.RepeatingAnnotation.Authors;

//Java8 repeating annotation
@Authors({@Author(name="John", method="deductFoodFee"),
		  @Author(name="Doe", method="deductHealthInsurancePremium"),
		  @Author(name="Dagim", method="calculateSalary")})
public class FullTImeEmployee extends Employee {

	private double employeeSalary;

	
	@Override
	public double deductFoodFee(){
		//FullTimeEmployee duductFoodFee implementation
		return 0;
	}
	
	@Override
	public double deductHealthInsurancePremium(){
		//overriding a default method from the interface
		System.out.println("Overriden a default method in one of implementing class ... ");
		return HEALTH_INSURANCE_PERCENTAGE*employeeSalary;
	}
	
	public double calculateSalary(double salary){
		/* incase of static methods in interfaces they can only be accessed by directly calling
		 * the interface;
		 */
		
		return this.employeeSalary -= Remunerator.deductPension(salary);
	}

}
