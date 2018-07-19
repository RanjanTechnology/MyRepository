package com.mycode.oops;
import static java.lang.System.out;
public class OverridingTypeCastTest {

	public static void main(String[] args) {
		
		Parent p = new Child();
		
		ChildB b = (ChildB)p;
		
		out.println(b.add(10, 20));
		
	}

}
