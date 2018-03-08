package com.ocjp.innerclass;

public class OuterToOtherClass {

	int i = 20;
	static int j = 10;

	class Inner {
		int i = 50;

		public void m1() {
			System.out.println("Inner i= "+this.i);
			System.out.println("Outer static var j= "+j);
			System.out.println("Outer i= "+OuterToOtherClass.this.i);
		}
	}
}
