package com.ocjp.javalangpackege;

public class ImmutableTest {

	public static void main(String[] args) {
		BookImmutable bi = new BookImmutable("Java");
		BookImmutable bi2 = bi.modify("Spring");
		BookImmutable bi3 = bi.modify("Java");
		System.out.println(bi==bi2);
		System.out.println(bi==bi3);
	}

}
