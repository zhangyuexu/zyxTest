package com.zyx.thread.demo.demo0;
/*
 *  ��������,�̳�Thread 
 *  ��д����run 
 */
public class SubThread  extends Thread{
	public void run(){
		for(int i = 0; i < 50;i++){
			System.out.println("run..."+i);
		}
	}
}
