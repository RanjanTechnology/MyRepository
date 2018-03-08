package com.ocjp.program.test;

public class FactorialWithRecursion {
	
	public int fact(int num){
		
		if(num == 0 )
			return 1;
		else
			return num*fact(num-1);
	}
}
