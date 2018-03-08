package com.ocjp.program.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int temp;
		boolean isPrime = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		
		for(int i=2; i<=num/2; i++){
			
			temp = num%i;
			if(temp == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
		
	}

}
