package com.ocjp.java8.features;

public class LambdaWithoutUserFuntionalInterface {
	
	Runnable r1 = () -> System.out.println(this);
	Runnable r2 = () -> System.out.println(toString());
	
	public String toString() { return "Hello, world!"; }

	public static void main(String[] args) {
		
		new LambdaWithoutUserFuntionalInterface().r1.run();
		new LambdaWithoutUserFuntionalInterface().r2.run();
	}

}
