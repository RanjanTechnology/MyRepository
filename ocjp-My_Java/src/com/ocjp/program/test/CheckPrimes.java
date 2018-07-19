package com.ocjp.program.test;

import java.util.Scanner;

public class CheckPrimes {

	public static void main(String[] args) {
		
		boolean isPrime = true;
		int count=0;
		int[] arr = {1,2,3,5,7};
		for(int i=0;i<arr.length;i++){
			
			for(int j=2; j<=i/2; j++){
				
				int temp = i%j;
				if(temp == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				count++;
		}
		
		System.out.println("Number of special number: "+count);
	}

}
