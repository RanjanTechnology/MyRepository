package com.ocjp.multithreading.itc;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("main thread calling wait method");
			b.wait();
			System.out.println("main thread got notification call");
			System.out.println(" Total :  "+b.total);
		}
	}

}
