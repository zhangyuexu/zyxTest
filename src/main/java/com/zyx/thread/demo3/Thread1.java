package com.zyx.thread.demo3;
/*
 * 实现runnable接口这种方式是做为线程任务存在
 */
public class Thread1 implements Runnable{

	@Override
	public void run() {
		while(true){//因为不是继承的Thread，只是做为线程任务存在，所以没有interrupted方法
			System.out.println("thread running....");
		}
		
	}
	
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			Thread t=new Thread(new Thread1());
			t.start();
		}
	}

}
