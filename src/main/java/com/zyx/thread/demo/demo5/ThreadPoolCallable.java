package com.zyx.thread.demo.demo5;
/*
 * Callable �ӿڵ�ʵ����,��Ϊ�߳��ύ�������
 * ʹ�÷�������ֵ
 */

import java.util.concurrent.Callable;

public class ThreadPoolCallable implements Callable<String>{
	public String call(){
		return "abc";
	}
}
