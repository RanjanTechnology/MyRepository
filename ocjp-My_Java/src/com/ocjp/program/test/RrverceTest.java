package com.ocjp.program.test;

import java.util.Scanner;

public class RrverceTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any String value: ");
		
		String str = sc.next();
		
		ReverceString rc = new ReverceString();
		
		String result = rc.reverce(str);
		System.out.println("Orignal String value: "+str);
		System.out.println("Reverce String value: "+result);
	}

}
