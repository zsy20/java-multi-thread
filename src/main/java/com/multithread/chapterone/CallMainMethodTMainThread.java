package com.multithread.chapterone;

public class CallMainMethodTMainThread {
	/*
	 * ע������̨�����main
	 *   ��ʵ����һ�����ƽ���main���߳���ִ��main() �����еĴ��롣
	 *   ����̨�������main��main����û���κι�ϵ��������������ͬ���ѡ�
	 */
	public static void main(String [] args) {
		System.out.println(Thread.currentThread().getName());
	}
}
