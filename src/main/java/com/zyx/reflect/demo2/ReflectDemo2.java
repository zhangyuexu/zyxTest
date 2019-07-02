package com.zyx.reflect.demo2;

import java.lang.reflect.Constructor;

/*
 *  ͨ������,��ȡ�в����Ĺ��췽��������
 *  ����getConstructor,���ݿ��Թ��췽�����Ӧ�Ĳ����б���
 */
public class ReflectDemo2 {
	public static void main(String[] args)throws Exception {
		Class c = Class.forName("cn.itcast.demo1.Person");
		//��ȡ����,String��int�����Ĺ��췽��
		//Constructor<T> getConstructor(Class<?>... parameterTypes)  
		//Class<?>... parameterTypes ����Ҫ��ȡ�Ĺ��췽���Ĳ����б�
		Constructor con = c.getConstructor(String.class,int.class);
		//���й��췽��
		// T newInstance(Object... initargs)  
		//Object... initargs ���й��췽����,���ݵ�ʵ�ʲ���
		Object obj = con.newInstance("����",20);
		System.out.println(obj);
	}
}
