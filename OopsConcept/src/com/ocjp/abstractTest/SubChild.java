package com.ocjp.abstractTest;

public class SubChild extends NewChild{
	
	public void test1(){
		System.out.println("Parent class variables: "+abc);
		System.out.println("Parent class variables: "+str1);
	}
	public static void main(String[] args) {
		SubChild child = new SubChild();
		System.out.println("Access protected method to out side package");
		child.property();
		child.test();
	}

}
