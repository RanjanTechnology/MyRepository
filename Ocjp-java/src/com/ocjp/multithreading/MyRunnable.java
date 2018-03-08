package com.ocjp.multithreading;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("MyRunnable run() method");
		}
	}
	
}
