package com.ocjp.exceptionNew;

final class ClassCasteExpDemo {

	public static void main(String[] args) {
		String s="abc";
		Object o= (Object)s; 
		System.out.println(o);
		Object obj = new Object();
		obj="abc";
		System.out.println(obj);
		Object o1 ="xyz";
		String s1 = (String)o1;
		System.out.println(s1);
	}

}
