package com.multithread.chapterone;

public class Run4J {
	public static void main(String[] args) {
		CountOperate4j c = new CountOperate4j();
		Thread thread = new Thread(c);
		System.out.println("main begin thread isAlive = " + thread.isAlive());
		thread.setName("A");
		thread.start();
		System.out.println("main end thread isAlive = " + thread.isAlive());
	}
}
