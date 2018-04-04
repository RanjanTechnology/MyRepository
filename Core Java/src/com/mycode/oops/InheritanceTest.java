package com.mycode.oops;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		int a= p.num;
		
		Child c = new Child();
		int b = c.xyz;
		
		int add = p.add(a, b);
		System.out.println("Parent class Add value: "+add);
		
		int mul = c.multi(add, b);
		System.out.println("Child class multiple value: "+mul);
		
		//int per = p.multi(a,b);
		int ch = c.add(a, b);
		System.out.println("Perant methods value: "+ch);
		
		Parent pr = new Child();
		pr.add(a, b);
		
		int abc = pr.num;
		//pr.multi(a,b);
		
		//Child ch1 = new Parent();
	}

}
