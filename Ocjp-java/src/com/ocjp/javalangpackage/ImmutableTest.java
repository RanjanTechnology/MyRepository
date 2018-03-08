package com.ocjp.javalangpackage;

public class ImmutableTest {

	public static void main(String[] args) {
		
		BookImmutable b1 = new BookImmutable("Ranjan");
		BookImmutable b2 = b1.modify("Rakesh");
		BookImmutable b3 = b1.modify("Ranjan");
		
		System.out.println(b1==b2);
		System.out.println(b1==b3);
		System.out.println(b2==b3);
		
	}

}
