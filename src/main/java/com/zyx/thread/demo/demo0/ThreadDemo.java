package com.zyx.thread.demo.demo0;
/*
 * ����������һ���߳�
 *   ����Thread�������
 *   ���������÷���start()
 *      ���̳߳���ִ��,JVM�����߳��е�run
 */
public class ThreadDemo {
	public static void main(String[] args) {
		SubThread st = new SubThread();
		SubThread st1 = new SubThread();
		st.start();
		st1.start();
		for(int i = 0; i < 50;i++){
			System.out.println("main..."+i);
		}
	}
}
