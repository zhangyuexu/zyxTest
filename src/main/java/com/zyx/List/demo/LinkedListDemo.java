package com.zyx.List.demo;

import java.util.LinkedList;

/**
 * LinkedList����ʵ�ֵĽӿ�Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, List<E>, Queue<E> ���������߱���Щ�ӿڵ����з���
 * LinkedList�����ϣ��ص㣺��ѯ������ɾ��
 * ע�⣺���ö�̬����
 * ������
 * add(E e) ��ָ��Ԫ��e��ӵ����б�Ľ�β��
 * add(int index, E element) �ڴ��б���ָ����λ�ò���ָ����Ԫ�ء�
 * addFirst(E e) 
 * addLast(E e)
 * contains(Object o)
 * get(int index)
 * getFirst() 
 * getLast()
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();//���ﲻ��ʹ�ö�̬
		ll.add("a");
		ll.add("b");
		ll.add(1, "c");
		ll.addFirst("d");
		System.out.println(ll);

	}

}
