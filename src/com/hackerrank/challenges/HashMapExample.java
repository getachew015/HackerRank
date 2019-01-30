package com.hackerrank.challenges;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * The map interface stores elements in a key & value pair which is called entry
 * HashMap and LinkedHashMap class implement it and 
 * a Map can't be traversed so needs to be converted into keySet() or entrySet()
 * contains values based on key and allowed only unique key
 * might have one null key and multiple null values
 * it is non-synchronized and maintains no insertion order
 * 
 */
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Dagim-01");
		map.put("2", "Dagim-02");
		map.put("3", "Dagim-03");
		map.put("4", "Dagim-04");
		Iterator<?> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.println(entry.getValue());
		}
		
		//Comparing and sorting by key
		System.out.println("Comparing and sorting by key .... ");
		Map<Integer,String> map2 = new HashMap<Integer, String>();
		map2.put(100, "Something-199");
		map2.put(700, "Something-299");
		map2.put(300, "Otherthing");
		map2.put(900, "Nothing");
		map2.put(500, "Disgusthing");
		map2.put(600, "Intersthing");
		
		//Returns the map entry set
		map2.entrySet()
		//Returns a sequential stream with this collection
		.stream()
		//Sorted according to the provided comparator
		.sorted(Map.Entry.comparingByKey())
		//Performs an action for each element of the stream
		.forEach(System.out::println);
		
		System.out.println("\nComparing by value .... ");
		//Returns the map entry set
		map2.entrySet()
		//Returns a sequential stream with this collection
		.stream()
		//Sorted according to the provided comparator
		.sorted(Map.Entry.comparingByValue())
		//Performs an action for each element of the stream
		.forEach(System.out::println);

		//Reverse order sorting
		System.out.println("Reverse order sorting .... ");
		map2.entrySet()
		//Returns a sequential stream with this collection
		.stream()
		//Sorted according to the provided comparator
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		//Performs an action for each element of the stream
		.forEach(System.out::println);

	}

}
