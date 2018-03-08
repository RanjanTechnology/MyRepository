package com.ocjp.Concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> ch = new ConcurrentHashMap<>();
		ch.put(101, "Ranjan");
		ch.put(102, "Rakesh");
		System.out.println(ch);
		ch.putIfAbsent(101, "xyz");
		System.out.println(ch);
	}

}
