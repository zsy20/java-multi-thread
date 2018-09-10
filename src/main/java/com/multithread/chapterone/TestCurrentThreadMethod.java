package com.multithread.chapterone;

public class TestCurrentThreadMethod extends Thread {
	/*
	 * public static void main(String[] args) {
	 * System.out.println(Thread.currentThread().getName()); }
	 */
	public TestCurrentThreadMethod() {
		System.out.println("构造方法的打印：" + Thread.currentThread().getName());
	}

	public void run() {
		System.out.println("run方法的打印：" + Thread.currentThread().getName());
	}

}
