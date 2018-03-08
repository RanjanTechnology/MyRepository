package com.ocjp.java8.features;

public class Test {
	
	static String value="testify";
	static int value1=25;
	static{
		value1=50;
		System.out.println(value);
		System.out.println(value1);
	}

	public static void main(String[] args) {
		int x=100;
		double y=100.1;
		/*int j=2,y=3,z=10;
		for(;j<6;j++){
			y=(++y +  z++);
			System.out.println(y+z);
		}*/
		/*Integer r[] ={new Integer(3),new Integer(3),new Integer(3)};
		boolean r1[]= new boolean[]{true,false};
		String cats[]={"abc","abd"};
		Test t = new Test();
		t.start();
		
		int x=8;
		System.out.println(++x*3+","+x);
		
				
	}
	public void start(){
		boolean b1 = false;
		boolean b2 = fix(b1);
		System.out.println(b1+"     "+b2);
	}
	
	boolean fix(boolean b){
		b=true;
		return b;
	}*/
	}


}
