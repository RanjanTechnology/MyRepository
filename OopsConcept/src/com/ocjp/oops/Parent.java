package com.ocjp.oops;

public class Parent {
	protected int abc=78;
	protected String str1="375";
	
	//String str=Integer.toString(abc);
	String str= String.valueOf(abc);
	int num=Integer.parseInt(str1);
	protected void  property(){
		System.out.println("Parent Class Property");
		System.out.println(abc);
		System.out.println(str);
		System.out.println(num);
	}
}
