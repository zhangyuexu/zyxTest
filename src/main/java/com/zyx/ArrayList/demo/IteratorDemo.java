package com.zyx.ArrayList.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator�ӿ���ʵ���ࣺ
 * Collection�ӿ��ж���ķ�����Iterator<E> iterator()
 * ArrayList��Collection��ʵ���࣬��д�����iterator()������������Iterator�ӿڵ�ʵ����Ķ���
 * Iteratro it=ArrayList.iterator();//���ö�̬�����ԣ�������ص���ʵ����ĵĶ���
 * it�ǽӿڵ�ʵ����Ķ��󣬵��÷���hasNext()��next()���м��ϵ���
 * @author ASUS
 *
 */
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c=new ArrayList<String>();
		c.add("abc");
		c.add("abc");
		c.add("efg");
		Iterator<String> it=c.iterator();//���ü����е�Iterator������������ص���ʵ����ĵĶ���
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
	}

}
