package com.ocjp.excep;

final class ClassCasteExpDemo {

	public static void main(String[] args) {
		String s="abc";
		Object o= (Object)s; 
		System.out.println(o);
		
		Object o1 = new Object();
		o1="100";
		String s1=(String)o1;
		System.out.println(s1);
	}

}
