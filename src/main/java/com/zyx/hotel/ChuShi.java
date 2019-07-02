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
		System.out.println("厨师"+name+"在做菜。。。");
		
	}
	
	public void VIP(String name) {
		System.out.println("厨师"+name+"为vip客户做菜时要加量");
		
	}

}
