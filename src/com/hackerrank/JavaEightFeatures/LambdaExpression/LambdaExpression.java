package com.hackerrank.JavaEightFeatures.LambdaExpression;

import java.util.ArrayList;

public class LambdaExpression {
	
	public static void arrayList(ArrayList<String> list){
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.forEach(string -> System.out.println(string));
	}
	public static void printEvenNumbers(ArrayList<Integer> intList){
		intList.add(4576);
		intList.add(42);
		intList.add(78);
		intList.add(23);
		intList.add(15);
		intList.forEach(ints -> {
			if(ints%2 == 0)
				System.out.println(ints);
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		arrayList(list);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		printEvenNumbers(intList);
		//Lambda Expression with two parameters
		FunctionInter1 add = (int x, int y) -> x+y;
		FunctionInter1 multiply = (int x, int y) -> x*y;
		FunctionInter2 funcObj = message  -> System.out.println("Hello ---> "+ message);
		LambdaExpression lExpress = new LambdaExpression();
		
		System.out.println("Addition ... "+lExpress.operation(5, 6, add));
		System.out.println("Multiply ... "+lExpress.operation(5, 6, multiply));
		funcObj.sayMessage("MR ");
	}
	
	interface FunctionInter1{
		int operation(int a, int b);
	}
	interface FunctionInter2{
		void sayMessage(String message);
	}
	private int operation(int a, int b, FunctionInter1 func){
		return func.operation(a, b);
	}

}
