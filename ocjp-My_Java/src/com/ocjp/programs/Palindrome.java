package com.ocjp.programs;

import java.util.Scanner;

public class Palindrome {
 
	public static void main(String[] args) {
		System.out.println("Checking Palindrome");
		System.out.println("********************************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please in any number: ");
		int num = sc.nextInt();
		
		int palindrome = 0, remainder,numcopy;
		numcopy=num;
		
		while(num != 0){
			remainder = num%10;
			palindrome = palindrome*10 + remainder;
			num = num/10;
		}
		if(palindrome == numcopy)
			System.out.println(numcopy+" is Palindrome number");
		else
			System.out.println(numcopy+" is Palindrome Not number");
	}
}
