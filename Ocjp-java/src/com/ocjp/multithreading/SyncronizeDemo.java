package com.ocjp.multithreading;

public class SyncronizeDemo {

	public static void main(String[] args) {
		Display d1 = new Display();
		MyWishTread t1 = new MyWishTread(d1, "Ranjan");
		MyWishTread t2 = new MyWishTread(d1, "Nitesh");
		t1.start();
		t2.start();
	}

}
