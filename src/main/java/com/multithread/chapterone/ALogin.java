package com.multithread.chapterone;

public class ALogin extends Thread {
	public void run() {
		LoginServlet.doPost("a", "aa");
	}
}
