package com.ocjp.javalangpackege;

public class StringTest {

	public static void main(String[] args) {
		String str= new String("abc");
		String str1= new String("abc");
		String s="Ranjan";
		String s1=s;
		 s= s.concat(" Singh");
		
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		System.out.println(s1==s);
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("xyz");
		StringBuffer sb1 = new StringBuffer("xyz");
		System.out.println(sb==sb1);
		System.out.println(sb.equals(sb1));
	}

}
