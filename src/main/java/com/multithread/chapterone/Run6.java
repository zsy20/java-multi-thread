package com.multithread.chapterone;

public class Run6 {
	public static void main(String[] args) throws InterruptedException {
		TestIsAliveMethod thread = new TestIsAliveMethod();
		System.out.println("begin=" + thread.isAlive());
		thread.start();
		Thread.sleep(1000);
		System.out.println("end=" + thread.isAlive());
	}
}
