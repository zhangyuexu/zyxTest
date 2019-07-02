package com.zyx.reflect.demo2;

import java.lang.reflect.Constructor;

/*
 *  ͨ�������ȡclass�ļ��еĹ��췽��,���й��췽��
 *  ���й��췽��,��������
 *    ��ȡclass�ļ�����
 *    ��class�ļ�������,��ȡ��Ҫ�ĳ�Ա
 *    
 *  Constructor �������췽��������
 */
public class ReflectDemo1 {
	public static void main(String[] args) throws Exception {
	
		Class c = Class.forName("com.zyx.reflect.demo2.Person");
		//ʹ��class�ļ�����,��ȡ���еĹ��췽��
		//  Constructor[]  getConstructors() ��ȡclass�ļ������е����й����Ĺ��췽��
		/*Constructor[] cons = c.getConstructors();
		for(Constructor con : cons){
			System.out.println(con);
		}*/
		//��ȡָ���Ĺ��췽��,�ղ����Ĺ��췽��
		Constructor con =  c.getConstructor();
		//���пղ������췽��,Constructor�෽�� newInstance()���л�ȡ���Ĺ��췽��
		Object obj = con.newInstance();
		System.out.println(obj.toString());
	}
}
