package com.hackerrank.challenges;

public class SynchronizedBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Banking activities .... ");
		SynchronizedBank bank = new SynchronizedBank();
		
		new Thread(){
			public void run(){
				bank.withdraw(10001);
				
				
			}
		}.start();
		
		new Thread(){
			public void run(){
				bank.deposit(5000);
			}
		}.start();

	}

}
