package com.zyx.ArrayList.demo;

import java.util.ArrayList;

/**
 * 集合和数组都是容器，数组的长度是固定的，集合的长度是可变的。
 * 数组中既可以存基本类型的数据也可以存对象
 * 集合只能存对象
 */
public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		/**
		 * 集合ArrayList存储int类型，利用的是java的自动装箱机制
		 */
		/**
		 * 存储Person对象
		 */
		ArrayList<Person> arrPer=new ArrayList<Person>();
		arrPer.add(new Person("zs",20));
		arrPer.add(new Person("ls",21));
		arrPer.add(new Person("wangwu",22));
		System.out.println(arrPer);//集合重写了toString方法，返回一个数组
		for(int i=0;i<arrPer.size();i++){
			//get(i)是取出的对象
			//打印的是一个对象，必须要调用toString方法，所以必须要重写父类Object的toString方法
			System.out.println(arrPer.get(i));
		}

	}
	

}
