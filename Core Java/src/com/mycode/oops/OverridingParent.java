package com.mycode.oops;

public class OverridingParent {
	
	public Number calulation(int a, int b) throws Exception{
		
		int sum  = a+b;
		System.out.println("Parent class method perform addition");
		
		return sum;
	}
	
	public void div(int a, int b)throws ArithmeticException{
		
		int c = a/b;
		System.out.println("Exception check in parent class: "+c );
	}
}
