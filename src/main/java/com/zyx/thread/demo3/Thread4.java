package com.zyx.thread.demo3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * 前面3种创建线程的方式都没有返回值和都不能抛出异常，现在这种方式既有返回值又能抛出异常的线程。
 */
public class Thread4 implements Callable<Integer>{

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		for(int i=0;i<10;i++){
			Thread4 thread4=new Thread4();
			FutureTask<Integer> futureTask=new FutureTask<>(thread4);
			Thread t=new Thread(futureTask);
			t.start();
			Integer result=futureTask.get();
			System.out.println("线程执行的结果是:"+result);
		}

	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"正在进行紧张的计算");
		Thread.sleep(2000);
		return 1;
	}

}
