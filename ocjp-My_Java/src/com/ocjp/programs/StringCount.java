package com.ocjp.programs;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		final int MAX_CHAR = 256;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any String : ");
		String str = sc.nextLine();
		
		int len = str.length();
		int[] count = new int[MAX_CHAR];
		
		// Initialize count array index
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		// Create an array of given String size
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				// If any matches found
				if (str.charAt(i) == ch[j]) 
					find++;			 
			}
			
			if (find == 1) 
				System.out.println("Number of Occurrence of " +
				str.charAt(i) + " is:" + count[str.charAt(i)]);		 
		}
	}

}
