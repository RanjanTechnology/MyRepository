package com.ocjp.multithreading;

public class MyLockThread extends Thread {
	
	DisplayLock d;
	String name;
	
	public MyLockThread(DisplayLock d, String name) {
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}

}
