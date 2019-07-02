package com.zyx.thread.demo.demo6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * ʹ�ö��̼߳���,���
 * �����߳�,1���̼߳���1+100,��һ���̼߳���1+200�ĺ�
 * ���̵߳��첽����
 */
public class ThreadPoolDemo {
	public static void main(String[] args)throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<Integer> f1 =es.submit(new GetSumCallable(100));
		Future<Integer> f2 =es.submit(new GetSumCallable(200));
		System.out.println(f1.get());
		System.out.println(f2.get());
		es.shutdown();
	}
}
