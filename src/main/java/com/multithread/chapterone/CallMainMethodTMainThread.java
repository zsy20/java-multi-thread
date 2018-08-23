package com.multithread.chapterone;

public class CallMainMethodTMainThread {
	/*
	 * 注：控制台中输出main
	 *   其实就是一个名称叫做main的线程在执行main() 方法中的代码。
	 *   控制台中输出的main和main方法没有任何关系，仅仅是名字相同而已。
	 */
	public static void main(String [] args) {
		System.out.println(Thread.currentThread().getName());
	}
}
