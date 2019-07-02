package com.zyx.thread.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadTest implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}
public class ThreadPoolTest {
	public static void main(String [] args){
		ExecutorService threadPool=Executors.newFixedThreadPool(5);
		ThreadTest t1=new ThreadTest();
		/**
		 * for(int i=0;i<10;i++){
			threadPool.submit(t1);
		}
		 */
		//5个并发(线程),执行5*2=10次请求
		for(int i=0;i<6;i++){
			threadPool.submit(t1);
		}
		threadPool.shutdown();
	}
	

}
