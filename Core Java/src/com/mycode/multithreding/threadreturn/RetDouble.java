package com.mycode.multithreding.threadreturn;

import java.util.concurrent.Callable;

public class RetDouble implements Callable<Double> {
	
	public RetDouble(){
		
	}
	
	@Override
	public Double call() throws Exception {
		
		return 50.70;
	}

}
