package com.multithread.chapterone;

public class MockUserLogin {
	 public static void main(String[] args) {
		ALogin a = new ALogin();
		a.start();
		BLogin b = new BLogin();
		b.start();
	}
}
