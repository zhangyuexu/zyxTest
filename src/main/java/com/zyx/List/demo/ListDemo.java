package com.zyx.List.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ӿ���ϵ���̳���Collection�ӿ�
 * �����кܶ�ʵ���࣬��ArrayList,LinkedList
 * List�ӿ��ص㣺���������������ظ�
 * List�ӿ��еĳ��󷽷�����һ���ַ��������ĸ���Collection��һ����
 * List�ӿ�Ҳ���Լ����еķ��������������Ĺ���
 *
 *void add(int index, E element)  ���б��ָ��λ�ò���ָ��Ԫ��
 *E get(int index) �����б���ָ��λ�õ�Ԫ�ء�
 *E remove(int index) �Ƴ��б���ָ��λ�õ�Ԫ��
 *void removeRange(int fromIndex, int toIndex) �Ӵ��б����Ƴ������� fromIndex���������� toIndex����������֮�������Ԫ�ء�
 *E set(int index, E element) ��ָ��Ԫ���滻�б���ָ��λ�õ�Ԫ��
 */
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add(0, "c");
		
		System.out.println(list.get(0));
		
		System.out.println(list);
	}

}
