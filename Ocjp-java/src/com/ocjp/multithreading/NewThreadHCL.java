package com.ocjp.multithreading;

public class NewThreadHCL implements Runnable {
	
	String name; // name of thread

	  Thread t;
	  
	  
	  public NewThreadHCL() {
		super();
	}

	public NewThreadHCL(String threadname) {
	    name = threadname;
	    t = new Thread(this, name);
	    System.out.println("New thread: " + t);
	    t.start(); // Start the thread
	  }

	  public void run() {
	    try {
	      for (int i = 5; i > 0; i--) {
	        System.out.println(name + ": " + i);
	        Thread.sleep(1000);
	      }
	    } catch (InterruptedException e) {
	      System.out.println(name + "Interrupted");
	    }
	    System.out.println(name + " exiting.");
	  }
}
