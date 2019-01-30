package com.hackerrank.challenges;

public class ThreadExtendThread extends Thread {

	public void run(){
		System.out.println("Printing from the run method ... ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExtendThread thread = new ThreadExtendThread();
		thread.start();
	}

}
