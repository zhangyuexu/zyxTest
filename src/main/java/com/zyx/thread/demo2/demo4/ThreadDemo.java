package com.zyx.thread.demo2.demo4;
/*
 *  ���������̺߳�����߳�,ʵ�ָ�ֵ�ʹ�ӡֵ
 */
public class ThreadDemo{
	public static void main(String[] args) {
		
		Resource r = new Resource();
		
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread tin = new Thread(in);
		Thread tout = new Thread(out);
		
		tin.start();
		tout.start();
	}
}
