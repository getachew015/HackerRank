package com.hackerrank.challenges;

import java.util.LinkedHashMap;
import java.util.Map;

/*It is a HashTable & LinkedList implementation of the Map interface
 * Stores based on key value pairs and contains unique elements
 * Contains one null key and multiple null values
 * It is non synchronized and maintains insertion order
 * 
 */
public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap();
		linkedHashMap.put(11, "ghewrwr");
		linkedHashMap.put(11, "werwer");
		linkedHashMap.put(11, "nbtiej");
		linkedHashMap.put(11, "poejen");
		for (Map.Entry m:linkedHashMap.entrySet()) {
			System.out.println("Key .. "+m.getKey() + "  Value ... "+m.getValue());
		}
	}

}
