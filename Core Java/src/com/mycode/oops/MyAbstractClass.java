package com.mycode.oops;

public abstract class MyAbstractClass {
	
	public int a;
	public int b;
	
	public MyAbstractClass() {
	}

	public MyAbstractClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int sum(int a, int b);
	public void print(int a, int b){
		System.out.println("A : "+a+" and B : "+b);
	}
	
}
