package com.zyx.reflect.demo2;

import java.lang.reflect.Constructor;

/*
 *  �����ȡ˽�еĹ��췽������
 *  ���Ƽ�,�ƻ��˳���ķ�װ��,��ȫ��
 *  ��������
 */
public class ReflectDemo4 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("cn.itcast.demo1.Person");
		//Constructor[] getDeclaredConstructors()��ȡ���еĹ��췽��,����˽�е�
		/*Constructor[] cons = c.getDeclaredConstructors();
		for(Constructor con : cons){
			System.out.println(con);
		}*/
		//Constructor getDeclaredConstructor(Class...c)��ȡ��ָ�������б�Ĺ��췽��
		Constructor con = c.getDeclaredConstructor(int.class,String.class);
		
		//Constructor��,����AccessibleObject,���巽��setAccessible(boolean b)
		con.setAccessible(true);
		
		Object obj = con.newInstance(18,"lisi");
		System.out.println(obj);
	}
}
