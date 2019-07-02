package com.zyx.thread.demo.demo5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 *  ʵ���̳߳���ĵ�������ʽ,ʵ��Callable�ӿڷ�ʽ
 *  ʵ�ֲ���
 *    ������ Executors��̬����newFixedThreadPool����,�����̳߳ض���
 *    �̳߳ض���ExecutorService�ӿ�ʵ����,���÷���submit�ύ�߳�����
 *    submit(Callable c)
 */
public class ThreadPoolDemo1 {
	public static void main(String[] args)throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);
		//�ύ�߳�����ķ���submit�������� Future�ӿڵ�ʵ����
		Future<String> f = es.submit(new ThreadPoolCallable());
		String s = f.get();
		System.out.println(s);
	}
}
