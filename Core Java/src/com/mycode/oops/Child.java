package com.mycode.oops;

public class Child extends Parent{
	
	public int xyz = 20;
	
	public int multi(int a, int b){
		
		int c = a*b;
		System.out.println("Child class methods");
		
		return c;
	}

	@Override
	public int add(int a, int b) {
		
		int sum = a+b;
		return sum;
	}
}
