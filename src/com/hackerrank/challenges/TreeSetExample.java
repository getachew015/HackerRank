package com.hackerrank.challenges;

import java.util.Iterator;
import java.util.TreeSet;

/*Treeset
 * 	Implements the tree-set interface and uses tree data structure to store data
 *  Objects of the tree-set class are stored in ascending order
 *  Contains unique elements like hashset, access and retrival times are fast
 *  It is non synchronized and allows null elements
 *  
 */
public class TreeSetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Hello-01");
		treeSet.add("Hello-02");
		treeSet.add("Hello-03");
		treeSet.add("Hello-04");
		treeSet.add("Hello-05");
		Iterator<String> iter = treeSet.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("Descending order ....");
		Iterator<String> iter2 = treeSet.descendingIterator();
		while(iter2.hasNext()){
			System.out.println(iter2.next());
		}
	}

}
