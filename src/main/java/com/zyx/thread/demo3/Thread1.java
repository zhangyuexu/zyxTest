package com.zyx.thread.demo3;
/*
 * ʵ��runnable�ӿ����ַ�ʽ����Ϊ�߳��������
 */
public class Thread1 implements Runnable{

	@Override
	public void run() {
		while(true){//��Ϊ���Ǽ̳е�Thread��ֻ����Ϊ�߳�������ڣ�����û��interrupted����
			System.out.println("thread running....");
		}
		
	}
	
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			Thread t=new Thread(new Thread1());
			t.start();
		}
	}

}
