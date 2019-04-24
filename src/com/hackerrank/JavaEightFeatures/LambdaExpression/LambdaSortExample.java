package com.hackerrank.JavaEightFeatures.LambdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LambdaSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Dagim", 1005,"USA", "785.935.4564",458752.56);
		Employee emp2 = new Employee("Kavanauh", 1002, "Belgium", "285.935.4564",458752.56);
		Employee emp3 = new Employee("Virginia", 1001, "Texan", "385.935.4564",458752.56);
		Employee emp4 = new Employee("Anderson", 1004, "Cooper", "485.935.4564",458752.56);
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		empList.sort((em1,em2) -> em1.getEmpId() - em2.getEmpId());
		empList.forEach(emp -> System.out.println("Name -- " + emp.getName()));
		LambdaSortExample lambda = new LambdaSortExample();
/*		System.out.println("Sort By Address");
		lambda.sortEmployeeByAddress(empList);
*/		System.out.println("Sort By Country");
		lambda.sortEmployeeByCountry(empList);
		empList.forEach(emp -> System.out.println("Address -- " + emp.getAddress()));
		
/*		Iterator<Employee> iter = empList.iterator();		
		while(iter.hasNext()){
			System.out.println(iter.next().getAddress());
		}
*/		
	}
	
	public void sortEmployeeByAddress(List<Employee> empList){
		/*
		 * Sorting list of employee using anonymous class and comparator
		 */
		empList.sort(new Comparator<Employee> (){
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getAddress().compareTo(e2.getAddress());
			}
		});
		empList.sort(new Comparator<Employee> (){
			@Override
			public int compare(Employee e1, Employee e2){
				return e1.getAddress().compareTo(e2.getAddress());
			}
		});
	}
	
	public void sortEmployeeByCountry(List<Employee> empList){
		
		/* Java8 Lambda Expression
		 * Provide implementation logic for functional interfaces(interfaces with only one methods)
		 * Syntax of lambda expression has three parts (argument) -> (body)
		 */
/*		empList.sort((Employee e1, Employee e2) -> 
			e1.getAddress().compareTo(e2.getAddress()));
*/		//Another way to write the above code block will be
		Comparator<Employee> comparator = (Employee e1, Employee e2) -> 
				e1.getAddress().compareTo(e2.getAddress());
		empList.sort(comparator);
	
	
	}
	
}

