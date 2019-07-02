package com.zyx.ArrayList.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection接口中的方法是集合中所有实现类必须拥有的方法
 * ArrayList implements List
 * List extends Collection
 * 实现类方法的执行都是实现的重写
 */
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function();
	}
	/**
	 * Collection接口的方法：
	 * add(E e) 
	 * addAll(Collection<? extends E> c) 将指定 collection 中的所有元素都添加到此 collection 中
	 * void clear() 移除此 collection 中的所有元素
	 * boolean contains(Object o) 如果此 collection 包含指定的元素，则返回 true。
	 * boolean containsAll(Collection<?> c) 如果此 collection 包含指定 collection 中的所有元素，则返回 true。
	 * boolean equals(Object o) 
	 * int hashCode() 返回此 collection 的哈希码值。
	 * boolean isEmpty()如果此 collection 不包含元素，则返回 true。
	 *  Iterator<E> iterator()
	 *  remove(Object o)  从此 collection 中移除指定元素的单个实例，如果存在的话
	 *  int size()
	 *  Object[] toArray() 返回包含此 collection 中所有元素的数组。即集合转数组
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
