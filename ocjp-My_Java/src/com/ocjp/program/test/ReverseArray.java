package com.ocjp.program.test;

public class ReverseArray {
	
	public int[] reverse(int[] array){
		
		int i=0,j,temp;
		
		
		j = array.length-1;
		i=0;
		
		while(i<j){
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return array;
	}
}
