package com.ocjp.program.test;

import java.util.Scanner;

public class FactorialWithRecursionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter integer number: ");
		int num = sc.nextInt();
		
		FactorialWithRecursion fatorial = new FactorialWithRecursion();
		
		System.out.println("Factorial of "+num+" is = "+fatorial.fact(num));
	}

}
