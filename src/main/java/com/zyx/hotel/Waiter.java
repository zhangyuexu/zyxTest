package com.zyx.hotel;

public class Waiter extends Employee implements service {
	
	public Waiter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Waiter(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work(String name) {
		System.out.println("����Ա"+name+"�ڷ��񡣡���");
	}
	
	public void VIP(String name) {
		System.out.println("����Ա"+name+"Ϊvip����ʱҪ���ͻ�����");

	}

}
