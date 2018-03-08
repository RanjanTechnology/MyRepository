package com.ocjp.javalangpackege;

public class DeepCloningTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c = new Cat(20);
		DogDeepCloning d1 = new DogDeepCloning(c, 10);
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(d1.i+"....................."+d1.c.j);
		
		DogDeepCloning d2 = (DogDeepCloning)d1.clone();
		d1.i=888;
		d1.c.j = 999;
		System.out.println(d2.i+"....................."+d2.c.j);
	}
}
