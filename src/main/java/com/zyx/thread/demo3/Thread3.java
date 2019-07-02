package com.zyx.thread.demo3;

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"Ö´ÐÐ");
				
			}
			
		}).start();

	}

}
