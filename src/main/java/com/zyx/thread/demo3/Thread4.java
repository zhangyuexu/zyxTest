package com.zyx.thread.demo3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * ǰ��3�ִ����̵߳ķ�ʽ��û�з���ֵ�Ͷ������׳��쳣���������ַ�ʽ���з���ֵ�����׳��쳣���̡߳�
 */
public class Thread4 implements Callable<Integer>{

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		for(int i=0;i<10;i++){
			Thread4 thread4=new Thread4();
			FutureTask<Integer> futureTask=new FutureTask<>(thread4);
			Thread t=new Thread(futureTask);
			t.start();
			Integer result=futureTask.get();
			System.out.println("�߳�ִ�еĽ����:"+result);
		}

	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"���ڽ��н��ŵļ���");
		Thread.sleep(2000);
		return 1;
	}

}
