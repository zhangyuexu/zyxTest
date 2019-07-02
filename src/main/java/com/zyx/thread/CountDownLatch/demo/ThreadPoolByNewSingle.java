package com.zyx.thread.CountDownLatch.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolByNewSingle {
	public static void main(String[] args){
		//单线程化的线程池
		ExecutorService es=Executors.newSingleThreadExecutor();
		for(int i=0;i<10;i++){
			final int index=i;
			es.execute(new Runnable() {
				
				public void run() {
					Thread.currentThread().setName("Thread i="+index);
					System.out.println(Thread.currentThread().getName()+"index="+index);
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
				}
			});
		}
		es.shutdown();
		System.out.println("on the main thread...");
	}

}
