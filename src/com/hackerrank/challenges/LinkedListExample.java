package com.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
	//extends AbstractArrayList class and implements List & Deque interface
	//it can contain duplicate elements
	//Linked list maintains insertion order
	//Linked list is non-synchronized
	//Linked list is fast on manipulation b/c there is no shifting in memory
	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("aaa");
		linkedList.add("ggg");
		linkedList.add("eee");
		linkedList.add("ddd");
		Iterator<String> iter = linkedList.descendingIterator();
		
		//listIterator interface is used to traverse a collection in both directions
		System.out.println("Forward traversing");
		while(iter.hasNext()){//forward traversing
			System.out.println(iter.next());
		}
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("eee");
		list.add("ddd");


		ListIterator<String> iter2 = list.listIterator();
		System.out.println("Backward traversing");
		while(iter2.hasPrevious()){
			System.out.println(iter2.previous());
		}
		
	}
/*
 * ArrayList vs LinkedList
 * ArrayList internally uses a dynamic array ------- LinkedList internally uses a doubly linked list
 * If any element is removed from the array all the bits are shifted making arraylist slow in manipulation
 * because linkedlist uses a doubly linked list no bit shifting is required in memory and that makes it fast in manipulation.
 * ArrayList is better for storing and accessing data ------LinkedList is better for manipulating data.
 */
}
