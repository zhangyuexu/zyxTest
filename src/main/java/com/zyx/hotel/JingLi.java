package com.zyx.hotel;

public class JingLi extends Employee {
	private double salary;//����
	
	public JingLi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JingLi(String name, String id,double salary) {
		super(name, id);
		this.salary=salary;
	}

	@Override
	public void work(String name) {
		System.out.println("����"+name+"�ںȲ�");

	}

}
