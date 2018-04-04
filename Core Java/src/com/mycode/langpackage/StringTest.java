package com.mycode.langpackage;

public class StringTest {

	public static void main(String[] args) {
		
		/*String s1 = new String("Ranjan");
		
		String s2 = new String("Ranjan");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "xyz";
		String str4 = str1;
		
		str1 = "ranjan";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
	}

}
