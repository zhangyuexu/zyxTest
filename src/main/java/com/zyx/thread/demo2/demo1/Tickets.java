package com.zyx.thread.demo2.demo1;
/*
 *  ����ͬ��������ʽ,����̵߳İ�ȫ����
 *  �ô�: ������
 *  ���̹߳�������,��ͬ��,��ȡ��һ��������
 *  �ڷ�����������,����ͬ���ؼ���
 *  
 *  ����:
 *    ͬ������������,�϶���,ͬ�������еĶ�����,�Ǳ���������� this
 *    ��������Ǿ�̬����,ͬ��������,���Բ���this
 *    ���Ǳ����Լ�.class ����
 *    ��̬����,ͬ����,�Ǳ�������.class����
 */
public class Tickets implements Runnable{

	//������۵�ƱԴ
	private  int ticket = 100;
	
	public void run(){
		while(true){
			payTicket();
		}
	}
	
	public  synchronized void payTicket(){	
			if( ticket > 0){
				try{
				   Thread.sleep(10);
				   System.out.println(Thread.currentThread().getName()+" ���۵� "+ticket--);
				}catch(Exception ex){}
				
			}
		
	}
}
