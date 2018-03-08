package com.ocjp.multithreading;

public class ThreadGroupTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup pg = new ThreadGroup("Parent group");
		ThreadGroup cg = new ThreadGroup(pg, "Child group");
		MyThreadGroup t1 = new MyThreadGroup(pg, "child thread1");
		MyThreadGroup t2 = new MyThreadGroup(pg, "child thread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		pg.list();
	}

}
