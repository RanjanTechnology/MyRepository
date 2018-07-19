package com.ocjp.programs;

public class MyBubbleSort {
	
	public static void bubble_sort(int[] arr){
		int len = arr.length;
		int k;
		for(int m = len; m >= 0; m--){
			for(int i = 0; i < len-1; i++){
				k = i+1;
				if(arr[i] > arr[k]){
					int temp;
					temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		printNumber(arr);
	}
	
	private static void printNumber(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" "); 
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		bubble_sort(arr);
	}

}
