package com.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIst {

	public static void listIterator(){
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("aaa");
		aList.add("bbb");
		aList.add("ccc");
		aList.add("ddd");
		Iterator iter = aList.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	
	public static void forEachIterator(){
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("aaa");
		aList.add("bbb");
		aList.add("ccc");
		aList.add("ddd");
		for (String string : aList) {
			System.out.println(string);
		}
	}
	
	public static void lamdaExpression(){
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("aaa");
		aList.add("bbb");
		aList.add("ccc");
		aList.add("ddd");
		Iterator list = aList.iterator();
		list.forEachRemaining(a->{
			System.out.println(a);
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		listIterator();
//		forEachIterator();
		lamdaExpression();
	}

}
