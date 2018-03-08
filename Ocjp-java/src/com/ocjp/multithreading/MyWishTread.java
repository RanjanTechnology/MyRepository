package com.ocjp.multithreading;

public class MyWishTread extends Thread{
	
	Display d;
	String name;
	public MyWishTread(Display d, String name) {
		this.d=d;
		this.name=name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
	
}
