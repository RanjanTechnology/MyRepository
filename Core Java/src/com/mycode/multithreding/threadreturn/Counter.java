package com.mycode.multithreding.threadreturn;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private AtomicInteger counter = new AtomicInteger(0);

	public int getCounter() {
		return counter.get();
	}

	public int increment() {
		return counter.getAndIncrement();
	}
	
	
}
