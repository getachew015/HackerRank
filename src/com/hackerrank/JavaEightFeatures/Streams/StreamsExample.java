package com.hackerrank.JavaEightFeatures.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 *Building Streams
Collections being one of the most heavily used API in Java, 
Stream support has been added to it by introducing a default stream() method in the Collection interface. 
So we can get a stream from a list in the following manner:
Stream<Employee> empStream = lstEmp.stream();
 
From arrays, streams can be built as follows:
String[] emps = {"Jose Jacob", "Robert King", "John Mathew"};
Stream<String> stream = Arrays.stream(emps);
 
To build streams from files, the java.nio.file.Files class needs to be used:
String fileName = "C://Employees.txt";
// Reading file into stream inside try-with-resources
try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
    stream.forEach(System.out::println);
} catch (IOException e) {
    e.printStackTrace();
}
 
Streams can also be built simply from values as below:
Stream<String> stream = Stream.of("Jose Jacob", "Robert King", "John Mathew");

 */
public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To build streams from files, the java.nio.file.Files class needs to be used:
			String fileName2 = System.getProperty("user.dir")+"\\src\\names.txt";
			// Reading file into stream inside try-with-resources
			try (Stream<String> stream = Files.lines(Paths.get(fileName2))) {
//			    stream.forEach(System.out::println);//traversing and printing each stream values read from file
//				stream.sorted((st1,st2) -> st1.compareTo(st2));
				Stream<String> newStream = //filtering the stream elements
			    stream.filter(st -> st.contains("a")).sorted((str1,str2) -> str1.compareTo(str2));
			    newStream.forEach(System.out::println);
			} catch (IOException e) {
			    e.printStackTrace();
			}

	}
	
	public void getCurrentDirectory(){

	}

}
