package com.zyx.hotel;

public class ChuShi extends Employee implements service{
	
	public ChuShi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChuShi(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work(String name) {
		System.out.println("��ʦ"+name+"�����ˡ�����");
		
	}
	
	public void VIP(String name) {
		System.out.println("��ʦ"+name+"Ϊvip�ͻ�����ʱҪ����");
		
	}

}
