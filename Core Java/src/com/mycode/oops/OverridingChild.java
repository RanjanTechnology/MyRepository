package com.mycode.oops;

import java.io.IOException;

public class OverridingChild extends OverridingParent{

	@Override
	public Long calulation(int a, int b) throws IOException {
		
		long mul = a*b;
		System.out.println("Child class method perform multiplication");
		
		return mul;
	}

	@Override
	public void div(int a, int b) throws ArithmeticException {
		int c = a/b;
		System.out.println("Exception check in child class: "+c);
	}
	
	
}
