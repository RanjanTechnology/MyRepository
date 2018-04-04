package com.mycode.oops;

public class InterfaceTest {

	public static void main(String[] args) {
		
		InterfaceOne o = new ImplementInterface();
		o.methodOne();
		System.out.println(o.getClass().getName());
	}

}
