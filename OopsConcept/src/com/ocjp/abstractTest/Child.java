package com.ocjp.abstractTest;

import com.ocjp.oops.Parent;

public class Child extends Parent {
	public static void main(String[] args) {		
		Child child = new Child();
		System.out.println("Access protected method to out side package");
		child.property();
	
		
	}

}
