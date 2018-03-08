package com.ocjp.exceptionNew;

final class ClassCasteExpDemo {

	public static void main(String[] args) {
		String s="abc";
		Object o= (Object)s; 
		System.out.println(o);
		Object obj = new Object();
		obj="abc";
		System.out.println(obj);
	}

}
