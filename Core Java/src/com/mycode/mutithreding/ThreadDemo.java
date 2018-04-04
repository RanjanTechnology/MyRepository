package com.mycode.mutithreding;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread my = new MyThread();
		Thread t = new Thread(my);
		t.start();
		t.join();
		
		for(int i=0;i<5;i++){
			System.out.println("Main thread");
		}
	}

}
