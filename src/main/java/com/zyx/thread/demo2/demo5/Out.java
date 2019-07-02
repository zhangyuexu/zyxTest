package com.zyx.thread.demo2.demo5;

public class Out implements Runnable{
	private Resource r;
	
	public Out(Resource r){
		this.r=r;
	}
	
	public void run(){
		while(true){
			r.get();
		}
	}
}
