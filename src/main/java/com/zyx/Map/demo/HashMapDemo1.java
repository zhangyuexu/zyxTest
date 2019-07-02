package com.zyx.Map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 *  使用HashMap集合,存储自定义的对象
 *  自定义对象,分别作为键,作为值出现
 */
public class HashMapDemo1 {

	public static void main(String[] args) {
		//function1();
		function2();

	}
	
	/*
	 * HashMap 存储自定义的对象Person,作为值出现
	 * 键的对象,是字符串,字符串本身有hashcode，可以保证唯一性
	 */
	public static void function1(){
		Map<String, Person> map=new HashMap<String, Person>();
		map.put("beijing", new Person("a",20));
		map.put("tianjin", new Person("b",18));
		map.put("shanghai", new Person("c",19));
		for(String key:map.keySet()){
			Person value=map.get(key);
			System.out.println(key+"=>"+value);
		}
		System.out.println("================================");
		for(Entry<String, Person>entry:map.entrySet()){
			String key=entry.getKey();
			Person value=entry.getValue();
			System.out.println(key+"=="+value);
		}
	}
	/*
	 * HashMap 存储自定义对象Person,作为键出现
	 * 键的对象,是Person类型,值是字符串
	 * 如果要保证键的唯一性,存储到键的对象就需要重写hashCode和equals方法
	 */
	public static void function2(){
		Map<Person, String> map=new HashMap<Person, String>();
		map.put(new Person("a",20), "里约热内卢");
		map.put(new Person("b",18), "索马里");
		map.put(new Person("b",18), "索马里");
		map.put(new Person("c",19), "百慕大");
		for(Person key:map.keySet()){
			String value=map.get(key);
			System.out.println(key+"=>"+value);
		}
		System.out.println("====================================");
		for(Entry<Person, String>entry:map.entrySet()){
			Person key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"=="+value);
		}
	}
}
