package com.ocjp.javalangpackage;

public class StringTest {

	public static void main(String[] args) {
		
		/*String s = "abc";
		String s1 = "abc";
		String s2 = new String("abc");		
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("S hashcode: "+s.hashCode());
		System.out.println("S1 hashcode: "+s1.hashCode());
		System.out.println("S2 hashcode: "+s2.hashCode());
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));*/
		
		String s2 = new String("Software");	
		s2.concat("Engineer");
		System.out.println(s2);

	}

}
