package com.zyx.thread.demo2.demo1;
/*
 * ���̲߳�������ͬһ��������Դ
 * 3���߳�,��һ��Ʊ��Դ,����
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//����Runnable�ӿ�ʵ�������
		Tickets t = new Tickets();
		//����3��Thread�����,����Runnable�ӿ�ʵ����
		Thread t0 = new Thread(t);
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t0.start();t1.start();t2.start();
		
	}
}
