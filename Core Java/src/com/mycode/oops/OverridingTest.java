package com.mycode.oops;

public class OverridingTest {

	public static void main(String[] args) throws Exception {
		
		OverridingParent p = new OverridingParent();
		OverridingChild c = new OverridingChild();
		OverridingParent pc = new OverridingChild();
		
		Number n = p.calulation(10, 20);
		long l = c.calulation(10, 20);
		Number lc  = pc.calulation(10, 10);
		pc.div(10, 2);
		
		System.out.println();
		System.out.println(n);
		System.out.println(l);
		System.out.println(lc);
	}

}
