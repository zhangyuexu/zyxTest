package com.zyx.thread.demo2.demo5;

public class Resource {
	public String name;
	public String sex;
	boolean flag=false;
		
	public synchronized void set(String name,String sex){
		while(true){
			if(flag){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.name=name;
			this.sex=sex;
			flag=true;
			this.notify();
		}
	}
	
	public synchronized void get(){
		while(true){
			if(!flag){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("name:"+name+",sex:"+sex);
			flag=false;
			this.notify();
		}
	}

}
