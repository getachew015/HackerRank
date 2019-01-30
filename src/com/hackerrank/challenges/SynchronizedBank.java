package com.hackerrank.challenges;

public class SynchronizedBank {
	int amount=10000;
	
	synchronized void withdraw(int amount){
		if(this.amount < amount){
			System.out.println("Balance is less than withdraw amount, waiting on deposit");
			try {
				wait();
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		this.amount-=amount;
		System.out.println("Amount withdrawn current balance is "+this.amount);		
	}
	synchronized void deposit(int amount){
		System.out.println("Depositing amount ... "+amount);
		this.amount+=amount;
		notify();
		System.out.println("amount deposited ...");
	}
}
