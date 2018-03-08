package com.ocjp.javalangpackege;

public class DogDeepCloning {
	Cat c;
	int i;
	
	public DogDeepCloning(Cat c, int i) {
		this.c = c;
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Cat c1 =new Cat(c.j);
		DogDeepCloning d1 = new DogDeepCloning(c1, i);
		return d1;
	}
	
}
