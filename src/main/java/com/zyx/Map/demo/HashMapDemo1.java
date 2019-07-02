package com.zyx.Map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 *  ʹ��HashMap����,�洢�Զ���Ķ���
 *  �Զ������,�ֱ���Ϊ��,��Ϊֵ����
 */
public class HashMapDemo1 {

	public static void main(String[] args) {
		//function1();
		function2();

	}
	
	/*
	 * HashMap �洢�Զ���Ķ���Person,��Ϊֵ����
	 * ���Ķ���,���ַ���,�ַ���������hashcode�����Ա�֤Ψһ��
	 */
	public static void function1(){
		Map<String, Person> map=new HashMap<String, Person>();
		map.put("beijing", new Person("a",20));
		map.put("tianjin", new Person("b",18));
		map.put("shanghai", new Person("c",19));
		for(String key:map.keySet()){
			Person value=map.get(key);
			System.out.println(key+"=>"+value);
		}
		System.out.println("================================");
		for(Entry<String, Person>entry:map.entrySet()){
			String key=entry.getKey();
			Person value=entry.getValue();
			System.out.println(key+"=="+value);
		}
	}
	/*
	 * HashMap �洢�Զ������Person,��Ϊ������
	 * ���Ķ���,��Person����,ֵ���ַ���
	 * ���Ҫ��֤����Ψһ��,�洢�����Ķ������Ҫ��дhashCode��equals����
	 */
	public static void function2(){
		Map<Person, String> map=new HashMap<Person, String>();
		map.put(new Person("a",20), "��Լ����¬");
		map.put(new Person("b",18), "������");
		map.put(new Person("b",18), "������");
		map.put(new Person("c",19), "��Ľ��");
		for(Person key:map.keySet()){
			String value=map.get(key);
			System.out.println(key+"=>"+value);
		}
		System.out.println("====================================");
		for(Entry<Person, String>entry:map.entrySet()){
			Person key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"=="+value);
		}
	}
}
