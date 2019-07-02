package com.zyx.reflect.demo2;
/*
 *  ��ȡһ�����class�ļ���������ַ�ʽ
 *   1. �����ȡ
 *   2. ������ȡ
 *   3. Class��ľ�̬������ȡ
 */
public class ReflectDemo {
	public static void main(String[] args)throws ClassNotFoundException {
		//1. �����ȡ
		Person p = new Person();
		//����Person��ĸ���ķ��� getClass
		Class c = p.getClass();
		System.out.println(c);
		
		//2. ������ȡ
	    //ÿ������,��������������,���ḳ���������һ����̬������,��������class
		Class c1 = Person.class;
		System.out.println(c1);
		
		//3. Class��ľ�̬������ȡ forName(�ַ���������)����.����
		Class c2 = Class.forName("com.zyx.reflect.demo2.Person");
		System.out.println(c2);
	}
}
