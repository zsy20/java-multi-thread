package com.multithread.chapterone;

public class SharedVariableThread extends Thread {

	private int count = 5;

	synchronized public void run() {
		count--;
		System.out.println("ÓÉ" + Thread.currentThread().getName() + "¼ÆËã, count=" + count);
	}

	public static void main(String[] args) {
		SharedVariableThread thread = new SharedVariableThread();
		Thread a = new Thread(thread, "A");
		Thread b = new Thread(thread, "B");
		Thread c = new Thread(thread, "C");
		Thread d = new Thread(thread, "D");
		Thread e = new Thread(thread, "E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
