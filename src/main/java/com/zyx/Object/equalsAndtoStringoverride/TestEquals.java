package com.zyx.Object.equalsAndtoStringoverride;

public class TestEquals {

	public static void main(String[] args) {
		
		Person p1=new Person("����",28);
		Person p2=new Person("����",28);
		Person p3=new Person("����",28);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println(p1);//�ȼ���p1.toString����Ϊ��ӡĬ�ϵ��õľ���toString����

	}

}
