package com.zyx.thread.demo2.demo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *  ʹ��JDK1.5 �Ľӿ�Lock,�滻ͬ�������,ʵ���̵߳İ�ȫ��
 *  Lock�ӿڷ���:
 *     lock() ��ȡ��
 *     unlock()�ͷ���
 *  ʵ����ReentrantLock
 */
public class Tickets implements Runnable{
	
	//������۵�ƱԴ
	private int ticket = 100;
	//����ĳ�Աλ��,����Lock�ӿڵ�ʵ�������
	private Lock lock = new ReentrantLock();
	
	public void run(){
		while(true){
			//����Lock�ӿڷ���lock��ȡ��
		    lock.lock();
			//��Ʊ���ж�,����0,���Գ���,����--����
				if( ticket > 0){
					try{
					   Thread.sleep(10);
					   System.out.println(Thread.currentThread().getName()+" ���۵� "+ticket--);
					}catch(Exception ex){
						
					}finally{
						//�ͷ���,����Lock�ӿڷ���unlock
						lock.unlock();
					}
				}
	
			
		}
	}
}
