package com.ocjp.program.test;

public class ConstructorValue {	
	/*int i = 10;
	int j = 20;
	public ConstructorValue(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public static void main(String[] args) {
		
		ConstructorValue c = new ConstructorValue(30,40);
		System.out.println(c.i+"     "+c.j);
		
	}*/
	int x = 10; 
	 public void assign(int x)
	 {
	   x = x;  
	   System.out.println(this.x);
	 }
	 public static void main(String[] args)
	 {
		 String str2 = new String(new char[]{'a','b','c'});
	   new ConstructorValue().assign(100);	
	   
	   System.out.println(str2);String str = "Java";
	   String str1 = new String("Java");
	   
	   System.out.println(str.equals(str1));
	   System.out.println(str == str1);
	   System.out.println( str.compareTo(str1) );
	   
	   
	 }
}
