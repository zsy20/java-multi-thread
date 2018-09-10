package com.multithread.chapterone;

public class BLogin extends Thread{
	public void run() {
		LoginServlet.doPost("b", "bb");
	}
}
