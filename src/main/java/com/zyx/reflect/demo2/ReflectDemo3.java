package com.zyx.reflect.demo2;
/*
 * �����ȡ���췽��������,�п�ݵ�ķ�ʽ
 * ��ǰ��:
 *   ���������,������пղ������췽��
 *   ���췽��Ȩ�ޱ���public
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast.demo1.Person");
		// Class���ж��巽��, T newInstance() ֱ�Ӵ�����������Ķ���ʵ��
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
