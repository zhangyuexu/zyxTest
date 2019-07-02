package com.zyx.List.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口派系，继承了Collection接口
 * 下面有很多实现类，如ArrayList,LinkedList
 * List接口特点：有序、索引、可以重复
 * List接口中的抽象方法，有一部分方法和它的父类Collection是一样的
 * List接口也有自己特有的方法，带有索引的功能
 *
 *void add(int index, E element)  在列表的指定位置插入指定元素
 *E get(int index) 返回列表中指定位置的元素。
 *E remove(int index) 移除列表中指定位置的元素
 *void removeRange(int fromIndex, int toIndex) 从此列表中移除索引在 fromIndex（包括）和 toIndex（不包括）之间的所有元素。
 *E set(int index, E element) 用指定元素替换列表中指定位置的元素
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
