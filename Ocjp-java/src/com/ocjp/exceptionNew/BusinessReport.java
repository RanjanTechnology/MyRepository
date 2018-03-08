package com.ocjp.exceptionNew;

public class BusinessReport {
	
	public void report() throws BusinessException, Business{	
		Calculation cal=new Calculation();
		System.out.println("Reports...........");
		cal.div();
		cal.findFile();
	}
}
