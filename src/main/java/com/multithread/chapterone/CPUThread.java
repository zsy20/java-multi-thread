package com.multithread.chapterone;

public class CPUThread extends Thread{
	public void run() {
		super.run();
		System.out.println("CPUThread run");
	}
	/* 注：从运行结果来看，CPUThread.java类中的run方法执行时间比较晚
	 *    使用多线程技术时，代码的运行结果与代码的执行顺序或者调用顺序无关。
	 */
	public static void main(String[] args) {
		CPUThread cpuThread = new CPUThread();
		cpuThread.start();
		System.out.println("程序运行结束");
	}
}
