package com.ocjp.program.test;

import java.util.Scanner;

public class GreatestCommonDivesionValueTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		
		GreatestCommonDivesionValue gcd = new GreatestCommonDivesionValue();
		
		int value = gcd.gcd(a, b);
		System.out.println("Greater Common division value: "+value);
	}

}
