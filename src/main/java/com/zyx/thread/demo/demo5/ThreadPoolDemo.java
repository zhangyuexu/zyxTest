package com.zyx.thread.demo.demo5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *  JDK1.5������,ʵ���̳߳س���
 *  ʹ�ù����� Executors�еľ�̬���������̳߳ض���,ָ���̵߳ĸ���
 *   static ExecutorService newFixedThreadPool(int ����) �����̳߳ض���
 *   ���ص���ExecutorService�ӿڵ�ʵ���� (�̳߳ض���)
 *   
 *   �ӿ�ʵ�������,���÷���submit (Ruunable r) �ύ�߳�ִ������
 *          
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		//���ù�����ľ�̬����,�����̳߳ض���
		//�����̳߳ض���,�Ƿ��صĽӿ�
		ExecutorService es = Executors.newFixedThreadPool(2);
	    //���ýӿ�ʵ�������es�еķ���submit�ύ�߳�����
		//��Runnable�ӿ�ʵ�������,����
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
		es.submit(new ThreadPoolRunnable());
	
	}
}
