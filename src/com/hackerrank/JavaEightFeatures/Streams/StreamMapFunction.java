package com.hackerrank.JavaEightFeatures.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.hackerrank.JavaEightFeatures.LambdaExpression.Employee;

public class StreamMapFunction {
	
	public static List<Employee> empListOperation(List<Employee> empList){
		/*
		 Used the filter method to filter Employee with salary less than 2500 and then
		 used the map method to increase by 1000 and finally used the collect method
		 to convert that to list
		 */
		List<Employee> newEmpList = empList.stream().filter(emp -> emp.getSalary() < 2500)
				.map(e -> { e.setSalary(e.getSalary() + 1000 ); return e;})
				.collect(Collectors.toList());
		
		return newEmpList;
		
	}
	
	public static List<Integer> intListOperation(List<Integer> intList){

		List<Integer> newIntList = intList.stream().map(list -> 
				{ list = (int) Math.pow(list.doubleValue(), 3); return list; })
				.collect(Collectors.toList());

		return newIntList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Dagim", 1005,"USA", "785.935.4564",2400.56);
		Employee emp2 = new Employee("Kavanauh", 1002, "Belgium", "285.935.4564",2300.56);
		Employee emp3 = new Employee("Virginia", 1001, "Texan", "385.935.4564",6800.56);
		Employee emp4 = new Employee("Anderson", 1004, "Cooper", "485.935.4564",7800.56);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		List<Employee> resultEmpList = empListOperation(empList);
		resultEmpList.forEach(emp -> System.out.println("Name " + emp.getName() + " Salary "+emp.getSalary()));
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		List<Integer> getIntList = intListOperation(intList);
		getIntList.forEach(System.out::println);
	}

}
