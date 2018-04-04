package com.mycode.oops;

public class FormalParameter {
	public static int x;
	public int sum(final int a, int b){
		
		int sum = a+b;
		x=a;
		x+=sum;
		System.out.println("Static value of: "+x);
		return sum;
	}
}
