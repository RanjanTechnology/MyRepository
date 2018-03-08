package com.ocjp.multithreading;

public class MyThreadBInterComnication extends Thread{
	
	int total=0;
	
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child thread Start calculation..");
			for(int i=0;i<=100;i++){
				total=total+i;
			}
			System.out.println("Child thread giving notification call");
			
			this.notify();
		}
	}
	
}
