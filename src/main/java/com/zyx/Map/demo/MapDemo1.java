package com.zyx.Map.demo;

import java.util.HashMap;
import java.util.Map;
/*
 * Collection和Map没有关系，Collection只能存一个对象，单身汉，Map存的是键值对的两个对象，夫妻关系
 *  Map接口中的常用方法
 *    使用Map接口的实现类 HashMap
 */
public class MapDemo1 {

	public static void main(String[] args) {
		//function1();
		//function2();
		function3();

	}
	/*
	 *  将键值对存储到集合中
	 *  V put(K,V) K 作为键的对象, V作为值的对象
	 *  存储的是重复的键,将原有的值,覆盖
	 *  返回值一般情况下返回null,
	 *  存储重复键的时候,返回被覆盖之前的值
	 */
	public static void function1(){
		Map<String, Integer>map=new HashMap<String, Integer>();
		map.put("a", 1);
		Integer i=map.put("a", 2);
		System.out.println(i);
		map.put("b", 2);
		map.put("c", 3);
		System.out.println(map);
	}
	/*
	 * 通过键对象,获取值对象
	 * V get(K)
	 * 如果集合中没有这个键,返回null
	 */
	public static void function2(){
		Map<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		String s=map.get(4);
		System.out.println(s);
	}
	/*
	 *  移除集合中的键值对,返回被移除之前的值
	 *  V remove(K)
	 */
	public static void function3(){
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		
		String value = map.remove(3);
		System.out.println(value);
		System.out.println(map);
	}
	
}
