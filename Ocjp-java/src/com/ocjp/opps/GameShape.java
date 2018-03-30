package com.ocjp.opps;

public class GameShape {
	
	public Number add(int a, int b){
		int sum =0;
		sum =a+b;
		System.out.println("Parent class method");
		return sum;
	}
	
	public void show(){
		System.out.println("Parent static method");
	}
}
