package com.multithread.chapterone;

public class CPUThread extends Thread{
	public void run() {
		super.run();
		System.out.println("CPUThread run");
	}
	/* ע�������н��������CPUThread.java���е�run����ִ��ʱ��Ƚ���
	 *    ʹ�ö��̼߳���ʱ����������н��������ִ��˳����ߵ���˳���޹ء�
	 */
	public static void main(String[] args) {
		CPUThread cpuThread = new CPUThread();
		cpuThread.start();
		System.out.println("�������н���");
	}
}
