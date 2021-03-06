package com.ocjp.multithreading.itc;

import java.util.LinkedList;

public class ProducerAndConsumer {

	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;

	public void producer() throws InterruptedException {

		int value = 0;

			synchronized (this) {

				while (list.size() == capacity) {
					//wait();
					
					System.out.println("Producer produced-" + value);

					// to insert the jobs in the list
					list.add(value++);

					// notifies the consumer thread that
					// now it can start consuming
					notify();

					// makes the working of program easier
					// to understand
					
					Thread.sleep(1000);
				}
		}
	}
	
	public void consume() throws InterruptedException{
		

			synchronized (this)
			{
				// consumer thread waits while list
				// is empty
				while (list.size()==0)
					this.wait();

				//to retrive the ifrst job in the list
				int val = list.removeFirst();

				System.out.println("Consumer consumed-"
												+ val);

				// Wake up producer thread
				notify();
				
				Thread.sleep(1000);

			}
	}
}
