package com.hackerrank.JavaEightFeatures.DefaultMethods;

public interface Remunerator {
	
	public final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
	public final double PENSION_PERCENTAGE = 3.0;
	public abstract double deductFoodFee();
	public default double deductHealthInsurancePremium(){
		/*
		 * This method was introduced to add a feature that will be used by
		 * FulltimeEmployee hence an abstract method will break the requirment for the 
		 * PartTimeEmployee class
		 */
		System.out.println("Default Method In Deduct Health Insurance Premium Implementation .... ");
		return 0;
	}
	
	public static double deductPension(double salary){
		
		return PENSION_PERCENTAGE*salary;
	}

}
