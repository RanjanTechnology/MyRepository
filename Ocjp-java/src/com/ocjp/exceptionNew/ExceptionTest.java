package com.ocjp.exceptionNew;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) throws Business, IOException{
		/*BusinessReport ba=new BusinessReport();
		try {
			ba.report();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		TryWithResource tr=new TryWithResource();
		tr.readFile();
	}

}
