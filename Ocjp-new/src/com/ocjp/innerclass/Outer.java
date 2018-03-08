package com.ocjp.innerclass;

public class Outer {
	
	class Inner{
		public void m1(){
			System.out.println("Inner class methods.....");
		}
	}
	public void m2(){
		System.out.println("Outer class method....");
		Inner i=new Inner();
		i.m1();
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m2();
	}
}
