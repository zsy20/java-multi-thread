package com.multithread.chapterone;

public class CountOperate4j extends Thread {
	public CountOperate4j() {
		System.out.println("CountOperate4j------begin");
		System.out.println("Thread.currentThread().getName() ----> " + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() ----> " + Thread.currentThread().isAlive());
		System.out.println("this.getName()-----> " + this.getName());
		System.out.println("this.Alive()----->" + this.isAlive());
		 System.out.println("Thread.currentThread()==this :"+ (Thread.currentThread() == this));
		System.out.println("CountOperate4j------end");
	}

	public void run() {
		System.out.println("run------begin");
		System.out.println("Thread.currentThread().getName() ----> " + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() ----> " + Thread.currentThread().isAlive());
		System.out.println("this.getName()-----> " + this.getName());
		System.out.println("this.Alive()----->" + this.isAlive());
		System.out.println("run------end");
	}
}
