package com.ocjp.multithreading;

public class MyThreadLocal extends Thread{
	static Integer cusID=0;
	private static ThreadLocal tl = new ThreadLocal(){
		protected Integer initialValue(){
			return cusID++;
		}
	};
	public MyThreadLocal(String name) {
		super(name);
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" Execute with customer id: "+tl.get());
		}
	}
	
}
