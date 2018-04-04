package com.mycode.oops;

public class ImplementInterface implements InterfaceOne, InterfaceTwo  {

	@Override
	public void methodOne() {
		
		System.out.println("Implemnation class");
		System.out.println(InterfaceOne.abc);
	}
	
    public int methodOne(int b) {
		
		System.out.println("Overloaded method");
		return b;
		
	}

}
