package com.multithread.chapterone;

public class CountOperate extends Thread {
	public CountOperate() {
		System.out.println("CountOperate----method---begin");
		System.out.println("Thread.currentThread().getName()----->" + Thread.currentThread().getName());
		System.out.println("this.getName()----->" + this.getName());
		System.out.println("CountOperate----method---end");
	}

	public void run() {
		System.out.println("run----method---begin");
		System.out.println("Thread.currentThread().getName()----->" + Thread.currentThread().getName());
		System.out.println("this.getName()----->" + this.getName());
		System.out.println("run----method---end");
	}
}
