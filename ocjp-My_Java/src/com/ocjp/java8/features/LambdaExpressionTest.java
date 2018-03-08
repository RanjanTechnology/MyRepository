package com.ocjp.java8.features;

public class LambdaExpressionTest {

	public static void main(String[] args) {
		
		LambdaExpression sum = (a,b) -> a+b;
		
		System.out.println("Sum value: "+sum.sum(15, 20));
	}
	

}
