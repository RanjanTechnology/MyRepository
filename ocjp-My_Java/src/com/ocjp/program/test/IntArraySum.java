package com.ocjp.program.test;

public class IntArraySum {

	public static void main(String[] args) {
		
		int[] value = {2,3,4,5,6};
		
		System.out.println("Vaules of Array: "+value);
		
		AddIntegerArrayValue ai = new AddIntegerArrayValue();
		int sum = ai.sumInt(value);
		System.out.println("Total vaule of Array: "+sum);
	}

}
