package com.ocjp.multithreading;

public class ThreadLockTest {

	public static void main(String[] args) {
		DisplayLock d = new DisplayLock();
		MyLockThread t1 = new MyLockThread(d, "Ranjan");
		MyLockThread t2 = new MyLockThread(d, "Tanuj");
		MyLockThread t3 = new MyLockThread(d, "Aman");
		t1.start();
		t2.start();
		t3.start();
	}

}
