package com.zyx.thread.demo3;

import java.util.Timer;
import java.util.TimerTask;

public class Thread5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timer timer=new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("timerTask is running");
			}
		}, 0, 1000);
	}

}
