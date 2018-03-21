package com.ocjp.programs;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		System.out.println("Checking Palindrome");
		System.out.println("********************************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please in any String: ");
		String str = sc.next();
		int flag = 0;
		
		String reverse1 = new StringBuffer(str).reverse().toString();
		
		String reverse = "";
		for(int i =str.length()-1;i>=0;i--){
			reverse = reverse + str.charAt(i);
		}
		
		if(str.equals(reverse1))
			flag = 1;
		
		 if(flag==1)  
             System.out.print("palindrome");  
         else   
             System.out.print("not a palindrome2");
	}
}
