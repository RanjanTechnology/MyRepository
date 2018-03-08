package com.ocjp.program.test;

public class MaxValueArrayTest {

	public static void main(String[] args) {
		
		int[] array = {7,23,54,9,33,97};
		
		MaxNumberInArray maxArray = new MaxNumberInArray();
		System.out.println("Maximum Value of Array: "+maxArray.maxValue(array));
		
	}

}
