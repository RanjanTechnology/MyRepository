package com.mycode.langpackage;

public class StringTest2 {

	public static void main(String[] args) {
		
		String s =new String("Ranjan");
		s.concat("Singh");
		s=s.concat("Kumar");
		s="ranjanSoft";
		String str1 = s.intern();
		System.out.println(str1);
		System.out.println(s);
	}

}
