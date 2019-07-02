package com.zyx.thread.CountDownLatch.demo;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {
	public static void main(String[] args){
		TestCountDownLatch.testCountDownLatch();
	}
	
	public static void testCountDownLatch(){
		int threadCount=10;
		final CountDownLatch latch=new CountDownLatch(threadCount);
		for(int i=0;i<threadCount;i++){
			new Thread(new Runnable() {
				
				public void run() {
					System.out.println("�߳�"+Thread.currentThread().getId()+"��ʼ����");
					try{
						Thread.sleep(1000);
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println("�߳�"+Thread.currentThread().getId()+"�ѵ����յ�");
					latch.countDown();
				}
			}).start();
		}
		
		try{
			latch.await();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("10���߳��Ѿ�ִ����ϣ���ʼ��������");
	}

}
