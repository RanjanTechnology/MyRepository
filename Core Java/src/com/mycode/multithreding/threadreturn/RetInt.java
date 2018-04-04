package com.mycode.multithreding.threadreturn;

import java.util.concurrent.Callable;

public class RetInt implements Callable<Integer>{
	
	public RetInt(){
		
	}
	
	@Override
	public Integer call() throws Exception {
		
		return 60;
	}

}
