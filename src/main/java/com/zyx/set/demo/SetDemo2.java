package com.zyx.set.demo;

import java.util.HashSet;

/**
 * HashSet集合自身的特点：
 * 底层数据结构是哈希表，哈希表是数组和链表的结合体
 * 查询和增删快
 * 线程不安全，运营速度快
 *
 */
public class SetDemo2 {
//这个要去有道笔记了解下哈希表的存储过程
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new String("bbc"));
		set.add(new String("bbc"));
		System.out.println(set);
		
		/**
		 * 一个需求，将Person对象中的姓名和年龄相同数据看作同一对象
		 * 判断对象是否重复，依赖自己重写hashCode和equals方法
		 * 当然eclipse工具也自带给你生成重写的hashCode和equals方法，尽量自己写。
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
