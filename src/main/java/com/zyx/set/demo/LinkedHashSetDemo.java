package com.zyx.set.demo;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet��̳�HashSet��
 * LinkedHashSet���������ǣ�����˳�򣬼��洢��ȡ����˳������ͬ��
 * ��Ҳ���̲߳���ȫ��
 * @author ASUS
 *
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer>link=new LinkedHashSet<Integer>();
		link.add(11);
		link.add(22);
		link.add(33);
		link.add(33);
		link.add(44);
		
		System.out.println(link);

	}

}
