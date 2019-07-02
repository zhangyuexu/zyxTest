package com.zyx.thread.demo2.demo5;

public class ThreadDemo {
	public static void main(String [] args){
		Resource r=new Resource();
		Input inPut=new Input(r);
		Out out=new Out(r);
		
		Thread t1=new Thread(inPut);
		Thread t2=new Thread(out);
		t1.start();
		t2.start();
	}
}
