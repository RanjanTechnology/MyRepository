package com.ocjp.multithreading;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				//e.printStackTrace();
				System.out.println("I got interrupted");
			}
			System.out.println("Run methods");

		}
	}
	
}
