package com.zyx.reflect.demo2;

import java.lang.reflect.Field;

/*
 *  �����ȡ��Ա����,���޸�ֵ
 *  Person���еĳ�ԱString name
 */
public class ReflectDemo5 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("com.zyx.reflect.demo2.Person");
		Object obj = c.newInstance();
		//��ȡ��Ա���� Class��ķ��� getFields() class�ļ��е����й����ĳ�Ա����
		//����ֵ��Field[]    Field��������Ա�����������
		/*Field[] fields = c.getFields();
		for(Field f : fields){
			System.out.println(f);
		}*/
		
		//��ȡָ���ĳ�Ա���� String name
		//Class��ķ���  Field getField(�����ַ������͵ı�����) ��ȡָ���ĳ�Ա����
		Field field = c.getField("name");
	   
		//Field��ķ��� void set(Object obj, Object value) ,�޸ĳ�Ա������ֵ
		//Object obj �����ж����֧��,  Object value �޸ĺ��ֵ
		field.set(obj,"����");
		System.out.println(obj);
		
	}
}
