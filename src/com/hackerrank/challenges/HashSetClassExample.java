package com.hackerrank.challenges;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetClassExample {
	//uses a hash table to store collections using a hashing mechanism
	//Inherits Abstract set class & implements set interface
	//Contains unique elements only and allows storing null values
	//It is non synchronized and doesn't maintain insertion order and stores on the basis of hashcode
	//best for search operations
	// Main difference between list and set is set only contains unique elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		initializeAndAdd();

	}
	public static void initializeAndAdd(){
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("aaaa");
		hashSet.add("baaa");
		hashSet.add("caaa");
		hashSet.add("daaa");
		hashSet.add("eaaa");
		Iterator<String> iter2 =  hashSet.iterator();
		while(iter2.hasNext()){
			System.out.println(iter2.next());
		}
	}
}
