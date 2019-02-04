package com.hackerrank.JavaEightFeatures.DefaultMethods;

/* Default and Static Methods in interfaces
 * In-case of two classes implementing an interface and if we want to add a feature 
 * that only affects one of the classes then adding a default method to the interface is the only solution.
 * E.g Interface(Remunerator) --> EmployeeClass --->(FullTImeEmployee & PartTimeEmployee extending Employee and implement Remunerator)
 */
public class DefaultAndStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTImeEmployee fte=new FullTImeEmployee();
		fte.deductHealthInsurancePremium();
	}

}
