package com.mycode.mutithreding;

public class JoinMyThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		JoinMyThread mt =(JoinMyThread) Thread.currentThread();
		JoinMyThread t = new JoinMyThread();
		t.start();
		
		for(int i = 0; i<5; i++){
			Thread.sleep(1000);
			System.out.println("Main Thread");
		}
	}

}
