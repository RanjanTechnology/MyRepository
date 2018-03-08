package com.ocjp.multithreading;

public class MyThreadGroup extends Thread{
	public MyThreadGroup(ThreadGroup g, String name){
		super(g,name);
	}

	@Override
	public void run() {
		System.out.println("Child class Thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
