package com.ocjp.program.test;

public class MaxNumberInArray {
	
	public int maxValue(int[] array){
		
		int max = array[0];
		for(int i=0;i<array.length; i++){
			if(array[i]>max){
				max=array[i];
			}
				
		}
		
		return max;
	}
}
