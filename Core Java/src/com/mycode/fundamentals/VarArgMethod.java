package com.mycode.fundamentals;

public class VarArgMethod {
	
	public int sum(int... x){
		
		int total = 0;
		for(int i =0;i<x.length;i++){
			System.out.println("Value of I : "+x[i]);
			total = total+x[i];
		}
		
		return total;
	}
}
