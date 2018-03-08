package com.ocjp.abstractTest;

import com.ocjp.oops.Parent;

public class NewChild extends Parent{	
	
	/*public static void main(String[] args) {		
		NewChild child = new NewChild();
		System.out.println("Access protected method to out side package");
		child.property();
		child.test();
		
	}*/
	public void test(){
		System.out.println("Parent class variables: "+abc);
		System.out.println("Parent class variables: "+str1);
	}
}
