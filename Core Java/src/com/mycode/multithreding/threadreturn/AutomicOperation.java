package com.mycode.multithreding.threadreturn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AutomicOperation {

	public static void main(String[] args) {
		
		ExecutorService service = null;
		Counter counter = new Counter();
		
		try {
			
			service = Executors.newFixedThreadPool(2);
			
			Runnable task1 = () ->{
				for(int i = 0; i < 20000; i++){
					counter.increment();
				}
			};
			
			Runnable task2 = () ->{
				for(int i = 0; i< 80000; i++){
					counter.increment();
				}
			};
			
			service.submit(task1);
			service.submit(task2);
			service.awaitTermination(1, TimeUnit.SECONDS);
			
			System.out.println("Final counter value : "+counter.getCounter());
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			if(service != null){
				service.shutdown();
			}
	}   
		
	}

}
