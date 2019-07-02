package com.zyx.List.demo;

import java.util.LinkedList;

/**
 * LinkedList类已实现的接口Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, List<E>, Queue<E> ，所以它具备这些接口的所有方法
 * LinkedList链表集合，特点：查询慢，增删快
 * 注意：不用多态调用
 * 方法：
 * add(E e) 将指定元素e添加到此列表的结尾。
 * add(int index, E element) 在此列表中指定的位置插入指定的元素。
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
		LinkedList<String> ll=new LinkedList<String>();//这里不能使用多态
		ll.add("a");
		ll.add("b");
		ll.add(1, "c");
		ll.addFirst("d");
		System.out.println(ll);

	}

}
