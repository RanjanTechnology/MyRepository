package com.ocjp.multithreading;

public class ThreadLocalTest {

	public static void main(String[] args) {
		
		MyThreadLocal t1 = new MyThreadLocal("Rnajan - 1");
		MyThreadLocal t2 = new MyThreadLocal("Rnajan - 2");
		MyThreadLocal t3 = new MyThreadLocal("Rnajan - 3");
		MyThreadLocal t4 = new MyThreadLocal("Rnajan - 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
