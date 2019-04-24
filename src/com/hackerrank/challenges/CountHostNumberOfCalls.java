package com.hackerrank.challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountHostNumberOfCalls {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String fileName = "hosts_access_log_00.txt";
		extractHosts(fileName);
	}
	
	public static void extractHosts(String fileName){
		try {
			Scanner scan;
			scan = new Scanner (new File(fileName));
			List<String> hosts = new ArrayList<String>();
			//Another domain/host Pattern = ^((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}$
			Pattern pattern = Pattern.compile("(.*)\\.(.*?)\\.(.*)");
			String outPutFile = "records_"+fileName;
			PrintStream print = new PrintStream(outPutFile);
			
			while(scan.hasNext()){
				//extract domain and add to ArrayList
				Matcher matcher = pattern.matcher(scan.next());
				if(matcher.find()){
					hosts.add(matcher.group());
				}
			}
			Map<String, Integer> hostCount = new HashMap<String, Integer>();
			int count = 0;
			for (int i = 0; i < hosts.size(); i++) {
				//count number of calls and add to a map
				for (int j = 0; j < hosts.size(); j++) {
					if(hosts.get(i).equalsIgnoreCase(hosts.get(j))){
						count++;
					}
				}
				hostCount.put(hosts.get(i), count);
				count = 0;
			}

			Iterator<String> iterate = hostCount.keySet().iterator();
			while(iterate.hasNext()){
				//print records to file
				String key = (String)iterate.next();
				print.println(key +" "+hostCount.get(key));
			}
			print.close();
			scan.close();
			System.out.println("Host Records Written to file ..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
