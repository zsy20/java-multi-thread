package com.multithread.chapterone;

public class RandomRunThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			int time = (int) (Math.random() * 1000);
			try {
				Thread.sleep(time);
				System.out.println("run=" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		RandomRunThread thread = new RandomRunThread();
		thread.setName("RandomRunThread");
		thread.start();
		for (int i = 0; i < 10; i++) {
			int time = (int) (Math.random() * 1000);
			try {
				Thread.sleep(time);
				System.out.println("main="+ Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
