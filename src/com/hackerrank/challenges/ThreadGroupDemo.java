package com.hackerrank.challenges;

public class ThreadGroupDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String args[]){
		ThreadGroup tg1 = new ThreadGroup("Parent thread");
		ThreadGroupDemo tDemo = new ThreadGroupDemo();
		Thread t1 = new Thread(tg1,tDemo,"one");
		Thread t2 = new Thread(tg1,tDemo,"two");
		Thread t3 = new Thread(tg1,tDemo,"three");
		System.out.println("Thread Group Name .. "+tg1.getName());
		tg1.list();
	}

}
