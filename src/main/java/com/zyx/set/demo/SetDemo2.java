package com.zyx.set.demo;

import java.util.HashSet;

/**
 * HashSet����������ص㣺
 * �ײ����ݽṹ�ǹ�ϣ����ϣ�������������Ľ����
 * ��ѯ����ɾ��
 * �̲߳���ȫ����Ӫ�ٶȿ�
 *
 */
public class SetDemo2 {
//���Ҫȥ�е��ʼ��˽��¹�ϣ��Ĵ洢����
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new String("bbc"));
		set.add(new String("bbc"));
		System.out.println(set);
		
		/**
		 * һ�����󣬽�Person�����е�������������ͬ���ݿ���ͬһ����
		 * �ж϶����Ƿ��ظ��������Լ���дhashCode��equals����
		 * ��Ȼeclipse����Ҳ�Դ�����������д��hashCode��equals�����������Լ�д��
		 */
		HashSet<Person>setPerson=new HashSet<Person>();
		setPerson.add(new Person("a",11));
		setPerson.add(new Person("b",10));
		setPerson.add(new Person("b",10));
		setPerson.add(new Person("c",25));
		setPerson.add(new Person("d",19));
		System.out.println(setPerson);

	}

}
