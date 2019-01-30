package com.hackerrank.challenges;

public class ThreadImplementRunnable implements Runnable {

	@Override
	public void run() {
		// one way to create a thread class is by implementing a runnable interface
		System.out.println("Printing from the run method .... ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadImplementRunnable tRunnable = new ThreadImplementRunnable();
		Thread t = new Thread(tRunnable); 
		t.start();
	}


}
