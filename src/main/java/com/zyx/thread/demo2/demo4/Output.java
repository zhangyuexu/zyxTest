package com.zyx.thread.demo2.demo4;
/*
 *  ����߳�,����Դ����Resource�г�Ա����,���ֵ
 */
public class Output implements Runnable {
	private Resource r ;
	
	public Output(Resource r){
		this.r = r;
	}
	public void run() {
		while(true){
		  synchronized(r){	
			  //�жϱ��,��false,�ȴ�
			if(!r.flag){
				try{r.wait();}catch(Exception ex){}
		    }
			System.out.println(r.name+".."+r.sex);
			//��Ǹĳ�false,���ѶԷ��߳�
			r.flag = false;
			r.notify();
		  }
		}
	}

}
