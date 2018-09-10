package com.multithread.chapterone;

public class Run2 {
	public static void main(String[] args) {
		TestCurrentThreadMethod thread = new TestCurrentThreadMethod();
//		thread.start();
		thread.run();
	}
}
