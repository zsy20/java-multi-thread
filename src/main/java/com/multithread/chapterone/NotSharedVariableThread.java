package com.multithread.chapterone;

public class NotSharedVariableThread extends Thread {
	private int count = 5;

	public NotSharedVariableThread(String name) {
		this.setName(name);
	}

	public void run() {
		while (count > 0) {
			count--;
			System.out.println("”…" + Thread.currentThread().getName() + "º∆À„, count=" + count);
		}
	}

	public static void main(String[] args) {
		NotSharedVariableThread threadA = new NotSharedVariableThread("A");
		NotSharedVariableThread threadB = new NotSharedVariableThread("B");
		NotSharedVariableThread threadC = new NotSharedVariableThread("C");
		threadA.start();
		threadB.start();
		threadC.start();

	}
}
