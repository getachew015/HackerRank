package com.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayLIst {

	public static void listIterator(){
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("aaa");
		aList.add("bbb");
		aList.add("ccc");
		aList.add("ddd");
		Iterator<String> iter = aList.iterator();
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
	public static void countChars(String stringVal){
		String word;
		word = stringVal.replaceAll("\\s", "");
		char[] charList = word.toCharArray();
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		Arrays.sort(charList);
		int count=0;
		for(int i=0; i < charList.length; i++){
			if(!charCount.containsKey(charList[i])){
				for(int j=0;j<charList.length;j++){
					if(charList[i]==charList[j])
						count++;
				}				
			}
			charCount.put(charList[i], count);
			count=0;
		}
		for(Map.Entry<Character, Integer> m: charCount.entrySet()){
			System.out.println(m.getKey() + " count is " +m.getValue());
		}
	}
	public static void lamdaExpression(){
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("aaa");
		aList.add("bbb");
		aList.add("ccc");
		aList.add("ddd");
		Iterator<String> list = aList.iterator();
		list.forEachRemaining(a->{
			System.out.println(a);
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		listIterator();
//		forEachIterator();
//		lamdaExpression();
		countChars("Hello World");
	}

}
