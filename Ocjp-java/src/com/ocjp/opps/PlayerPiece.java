package com.ocjp.opps;

public class PlayerPiece extends GameShape{
	
	public Long add(int a, int b){
		long sum =0;
		sum =a+b;
		System.out.println("Child class method");
		return sum;
	}
	
	public void show(){
		System.out.println("Child static method");
	}
}
