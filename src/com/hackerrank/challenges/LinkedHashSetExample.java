package com.hackerrank.challenges;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* LinkedHashSet
 * It is a Linkedlist and Hashset implementation of the set interface
 * Contains unique elements only, allows null elements, maintains insertion order and it is non synchronized
 * 
 */
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("String val01");
		linkedHashSet.add("String val01");//Ignoring duplicate values
		linkedHashSet.add("String val02");
		linkedHashSet.add("String val03");
		linkedHashSet.add("String val04");
		Iterator<String> iter = linkedHashSet.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
