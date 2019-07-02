package com.zyx.thread.demo;

class TestThread implements Runnable{
	private Thread t;
	private String threadName;
	public TestThread(String name){
		threadName=name;
	}
	
	public void start(){
		System.out.println(threadName+"starting");
		if(t==null){
			t=new Thread(this,threadName);
			t.start();
		}
	}
	
	public void run(){
		System.out.println(threadName+"running");
		try{
			for(int i=0;i<5;i++){
				System.out.println(threadName+"is running "+i);
				
			}
		}catch(Exception e){
			System.out.println(threadName+"is interrupted");
		}
		System.out.println(threadName+"exiting");
	}
	
}

public class ThreadDemo1{
	public static void main(String [] args){
		TestThread t1=new TestThread("任务一");
		t1.start();
		TestThread t2=new TestThread("任务二");
		t2.start();
	}
}

