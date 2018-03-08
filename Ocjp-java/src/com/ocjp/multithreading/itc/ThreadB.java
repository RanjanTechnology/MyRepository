package com.ocjp.multithreading.itc;

public class ThreadB extends Thread{
	
	int total = 0;
	
	public void run(){
		
		synchronized(this){
			System.out.println("child thread start calcuation");
			for(int i=1;i<=100;i++){
				total = total+i;
			}
			System.out.println("child thread giving notification call");
			this.notify();
		}
	}
}
