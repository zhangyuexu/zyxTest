package com.zyx.ArrayList.demo;

import java.util.ArrayList;

/**
 * ���Ϻ����鶼������������ĳ����ǹ̶��ģ����ϵĳ����ǿɱ�ġ�
 * �����мȿ��Դ�������͵�����Ҳ���Դ����
 * ����ֻ�ܴ����
 */
public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		/**
		 * ����ArrayList�洢int���ͣ����õ���java���Զ�װ�����
		 */
		/**
		 * �洢Person����
		 */
		ArrayList<Person> arrPer=new ArrayList<Person>();
		arrPer.add(new Person("zs",20));
		arrPer.add(new Person("ls",21));
		arrPer.add(new Person("wangwu",22));
		System.out.println(arrPer);//������д��toString����������һ������
		for(int i=0;i<arrPer.size();i++){
			//get(i)��ȡ���Ķ���
			//��ӡ����һ�����󣬱���Ҫ����toString���������Ա���Ҫ��д����Object��toString����
			System.out.println(arrPer.get(i));
		}

	}
	

}
