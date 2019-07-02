package com.zyx.ArrayList.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection�ӿ��еķ����Ǽ���������ʵ�������ӵ�еķ���
 * ArrayList implements List
 * List extends Collection
 * ʵ���෽����ִ�ж���ʵ�ֵ���д
 */
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function();
	}
	/**
	 * Collection�ӿڵķ�����
	 * add(E e) 
	 * addAll(Collection<? extends E> c) ��ָ�� collection �е�����Ԫ�ض���ӵ��� collection ��
	 * void clear() �Ƴ��� collection �е�����Ԫ��
	 * boolean contains(Object o) ����� collection ����ָ����Ԫ�أ��򷵻� true��
	 * boolean containsAll(Collection<?> c) ����� collection ����ָ�� collection �е�����Ԫ�أ��򷵻� true��
	 * boolean equals(Object o) 
	 * int hashCode() ���ش� collection �Ĺ�ϣ��ֵ��
	 * boolean isEmpty()����� collection ������Ԫ�أ��򷵻� true��
	 *  Iterator<E> iterator()
	 *  remove(Object o)  �Ӵ� collection ���Ƴ�ָ��Ԫ�صĵ���ʵ����������ڵĻ�
	 *  int size()
	 *  Object[] toArray() ���ذ����� collection ������Ԫ�ص����顣������ת����
	 */
	public static void function(){
		Collection<String> cc=new ArrayList<String>();
		cc.add("abc");
		cc.add("money");
		cc.add("def");
		Object[] obj=cc.toArray();
		String s=Arrays.toString(obj);
		System.out.println(s);
	}
}
