package com.zyx.thread.demo2.demo5;

public class Input implements Runnable{
	private Resource r;
	public Input(Resource r){
		this.r=r;
	}
	public void run(){
		int count=1;
		while(true){
			if(count==0){
				r.set("����", "��");
			}else{
				r.set("����", "Ů");
			}
			count=(count+1)%2;
		}
	}
}
