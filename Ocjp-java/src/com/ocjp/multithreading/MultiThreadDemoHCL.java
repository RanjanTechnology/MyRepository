package com.ocjp.multithreading;

public class MultiThreadDemoHCL {
	public static void main(String args[]) {
	    new NewThreadHCL("One"); // start threads
	    new NewThreadHCL("Two");
	    new NewThreadHCL("Three");

	    try {
	      Thread.sleep(10000);
	    } catch (InterruptedException e) {
	      System.out.println("Main thread Interrupted");
	    }

	    System.out.println("Main thread exiting.");
	  }
}
