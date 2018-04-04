package com.mycode.fundamentals;

public class IntegerTest {
	
	public void print(int i){
		System.out.println("I : "+i);
	}
	
	public void print2(int j){
		System.out.println("j : "+j);
	}

	public static void main(String[] args) {
		float f = 32.6f;
		short s = 230;
		double i = 0xFACE;
		System.out.println(i);
		IntegerTest it = new IntegerTest();
		it.print((int) f);
		it.print2(s);
		
		int num = 1_0000;
		System.out.println(num);
	}

}
