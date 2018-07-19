package com.mycode.oops;

public class MyAbtractTest {

	public static void main(String[] args) {
		
		MyAbstractClass ac = new MyChildAbstract();
		System.out.println(ac.sum(10, 20));
		ac.print(10, 20);
	}

}
