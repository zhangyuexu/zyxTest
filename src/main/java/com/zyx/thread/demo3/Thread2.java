package com.zyx.thread.demo3;

public class Thread2 extends Thread {
	@Override
	public void run(){
		while(!interrupted()){//只有Thread有interrupted方法
			System.out.println(Thread.currentThread().getName()+"执行了。");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			Thread2 t=new Thread2();
			t.start();
		}
		
	}
}
