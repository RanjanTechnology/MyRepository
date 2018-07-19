package com.mycode.multithreding.threadreturn;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RetValue {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		Future<Double> retDouble = service.submit(new RetDouble());
		Future<Integer> retInt = service.submit(new RetInt());
		
		System.out.println(retDouble.get());
		System.out.println(retInt.get());
		int val = retInt.get();
		service.shutdown();
	}

}
