package com.ocjp.multithreading;

public class RunnableTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(8);
		MyRunnable r = new MyRunnable();
		Thread t=new Thread(r);	
		Thread t1=new Thread(r);
		t.start();
		t1.start();
		System.out.println(t.getName());
		Thread.currentThread().setName("Ranjan");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getPriority());
		for(int i=0;i<5;i++){
			System.out.println("Main method");
		}
	}

}
