package com.zyx.reflect.demo2;

import java.lang.reflect.Method;

/*
 *  �����ȡ�в����ĳ�Ա������ִ��
 *  public void sleep(String,int,double){}
 */
public class ReflectDemo7 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("com.zyx.reflect.demo2.Person");
		Object obj = c.newInstance();
		//����Class��ķ���getMethod��ȡָ���ķ���sleep
		Method method = c.getMethod("sleep", String.class,int.class,double.class);
		//����Method��ķ���invoke����sleep����
		method.invoke(obj, "����",100,888.99);
	}
}
