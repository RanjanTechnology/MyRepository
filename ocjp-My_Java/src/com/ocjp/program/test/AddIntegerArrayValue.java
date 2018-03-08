package com.ocjp.program.test;

public class AddIntegerArrayValue {
	
	public int sumInt(int[] value){
		
		int sum = 0;
		
		for(int num : value){
			sum = sum+num;
		}
		
		return sum;
	}
}
