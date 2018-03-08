package com.ocjp.program.test;

public class ReverseArrayTest {

	public static void main(String[] args) {
		
		int[] array = {2,3,4,5,6,7,8};
		
		ReverseArray ra = new ReverseArray();
		
		int[] arr = ra.reverse(array);
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
