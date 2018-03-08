package com.ocjp.multithreading;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		MyThread t =new MyThread();
		t.start();
		t.interrupt();
		for(int i=0;i<5;i++){
			System.out.println("Main methods..");

		}
	}

}
