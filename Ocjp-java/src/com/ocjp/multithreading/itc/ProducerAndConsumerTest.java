package com.ocjp.multithreading.itc;

public class ProducerAndConsumerTest {

	public static void main(String[] args) throws InterruptedException {
		
		final ProducerAndConsumer pc = new ProducerAndConsumer();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					System.out.println("Producer");
					pc.producer();
					System.out.println(" Afetr Producer");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){
			
			@Override
			public void run() {
				try {
					System.out.println("Consumer");
					pc.consume();
					System.out.println("After Consumer");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		//t2.join();
	}

}
