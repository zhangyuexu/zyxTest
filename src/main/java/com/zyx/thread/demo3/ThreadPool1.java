package com.zyx.thread.demo3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {

	public static void main(String[] args){
		ExecutorService es=Executors.newFixedThreadPool(10);
		for(int i=0;i<100;i++){
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+"ÕýÔÚÖ´ÐÐ");
					
				}
			});
		}
		
		es.shutdown();
	}
}
