package com.ocjp.multithreading;

public class MultiThreadDemoHCL {
	public static void main(String args[]) {
	    new NewThreadHCL("One"); // start threads
	    new NewThreadHCL("Two");
	    new NewThreadHCL("Three");
	    
	    NewThreadHCL my = new NewThreadHCL("ranjan");
	    
	    Thread t = new Thread(my);
	    Thread t2 = new Thread(my);
	    System.out.println("Main Thread Starting");
	    t.start();
	    t2.start();
	    System.out.println("Main Thread");
	    
	    try {
	      Thread.sleep(2000);
	    } catch (InterruptedException e) {
	      System.out.println("Main thread Interrupted");
	    }

	    System.out.println("Main thread exiting.");
	  }
}
