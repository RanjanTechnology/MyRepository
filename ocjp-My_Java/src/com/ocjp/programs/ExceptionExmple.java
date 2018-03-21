package com.ocjp.programs;


public class ExceptionExmple {

	@SuppressWarnings("finally")
	public int print(){
		
		try {
			int n =0;
			return n;
		} catch (Exception e) {
			int n= 1;
			return n;
		}finally{
			return 2;
		}
	}
	public int print2(){
		int n;
		try {
			n=1;
			return n;
		} catch (Exception e) {
			n=2;
			return n;
		}finally{
			n=4;
			return n;
		}
	}
	
	public void div(int num){
		int d;
		try {
			d=num/0;
		} catch (ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		} 
	}

}
