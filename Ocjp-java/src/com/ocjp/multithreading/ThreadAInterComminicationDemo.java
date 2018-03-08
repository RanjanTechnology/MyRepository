package com.ocjp.multithreading;

public class ThreadAInterComminicationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThreadBInterComnication b = new MyThreadBInterComnication();
		b.start();
		synchronized (b) {
		 System.out.println("Main thread calling wait() method");
		 b.wait();
		 System.out.println("main thread got notification call");
		 System.out.println(b.total);
		}
	}

}
