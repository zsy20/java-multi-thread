package com.multithread.chapterone;

public class TestCurrentThreadMethod extends Thread {
	/*
	 * public static void main(String[] args) {
	 * System.out.println(Thread.currentThread().getName()); }
	 */
	public TestCurrentThreadMethod() {
		System.out.println("���췽���Ĵ�ӡ��" + Thread.currentThread().getName());
	}

	public void run() {
		System.out.println("run�����Ĵ�ӡ��" + Thread.currentThread().getName());
	}

}
