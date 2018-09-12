package com.multithread.chapterone;

public class TestIsAliveMethod extends Thread {
	public void run() {
		System.out.println("run=" + this.isAlive());
	}
}
