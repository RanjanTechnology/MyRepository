package com.ocjp.java8.features;

public class LambdaExample {
	public static void main(String args[]) {
        // lambda expression
    	/*MyFunctionalInterface msg = () -> {
    		return "Hello";
    	};
        System.out.println(msg.sayHello());*/
        
        //lambda expression with single parameter num
    	MyFunctionalInterface f = (num) -> num+5;
        System.out.println("Incremental value: "+f.incrementByFive(22));
        
        LambdaExpression sum = (a,b) -> a+b;
		System.out.println("Sum value: "+sum.sum(15, 20));
		
		LambdaExample LambdaExample = new LambdaExample();
		LambdaExample.abc1();
    }
	public void abc(){
		System.out.println("abc");
	}
	
	protected void abc1(){
		abc();
	}
}
