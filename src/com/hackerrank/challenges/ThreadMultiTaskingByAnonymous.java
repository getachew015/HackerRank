package com.hackerrank.challenges;

public class ThreadMultiTaskingByAnonymous {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable(){
			
			public void run(){
				System.out.println("This is from R1");
			}
			
		};
		
		Runnable r2 = new Runnable(){
			public void run(){
				System.out.println("This is from R2");
			}
		};

		Thread t1 = new Thread(r1,"Runnable1");
		Thread t2 = new Thread(r2,"Runnable2");
		t1.start();
		t2.start();
	}

}
