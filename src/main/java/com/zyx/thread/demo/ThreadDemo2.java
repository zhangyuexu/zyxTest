package com.zyx.thread.demo;

class TestThread2 extends Thread{
	private Thread t;
	private String threadName;
	public TestThread2(String name){
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
		try{
			for(int i=0;i<5;i++){
				System.out.println(threadName+"is running "+i);
			}
		}catch(Exception e){
			System.out.println(threadName+"is interrupted");
		}
		System.out.println(threadName+"is exiting");
	}
}
public class ThreadDemo2 {
	public static void main(String [] args){
		TestThread2 t1=new TestThread2("任务一");
		t1.start();
		TestThread2 t2=new TestThread2("任务二");
		t2.start();
	}
}
