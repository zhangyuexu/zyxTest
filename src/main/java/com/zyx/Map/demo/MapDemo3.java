package com.zyx.Map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 在Map接口内，有一个嵌套接口：Entry。Entry将键值对的对应关系封装成了对象。即键值对对象
 * 接口Map.Entry<K,V>有两个方法getKey()和getValue()，即Entry对象可以调用这两方法来获得键或值。
 * Map接口中有个entrySet()方法，返回的就是一个set集合：Set<Map.Entry<K,V>>
 * 
 *  Map集合获取方式
 *  entrySet方法,键值对映射关系(结婚证)获取
 *  实现步骤:
 *    1. 调用map集合方法entrySet()将集合中的映射关系对象,存储到Set集合
 *        Set<Entry <K,V> >
 *    2. 迭代Set集合
 *    3. 获取出的Set集合的元素,是映射关系对象
 *    4. 通过映射关系对象方法 getKet, getValue获取键值对
 *    
 *    创建内部类对象 外部类.内部类 = new 
 */
public class MapDemo3 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "bcd");
		map.put(3, "cde");
		//1. 调用map集合方法entrySet()将集合中的映射关系对象,存储到Set集合
		Set<Map.Entry <Integer,String> >  set = map.entrySet();
		//2. 迭代Set集合
		Iterator<Map.Entry <Integer,String> > it = set.iterator();
		while(it.hasNext()){
			//  3. 获取出的Set集合的元素,是映射关系对象
			// it.next 获取的是什么对象,也是Map.Entry对象
			Map.Entry<Integer, String> entry = it.next();
			//4. 通过映射关系对象方法 getKet, getValue获取键值对
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"...."+value);
		}
		
		System.out.println("=========================");
		/**
		 * 增强for循环能不能遍历Map，千万别说能，因为文档中的Iterable接口中的子接口和实现类没有map这回事，所以不能遍历map，因为map没有父接口。
		 * 但是我们可以遍历set，通过遍历set实现了遍历Map，所以说增强for不能遍历Map，可以遍历Set
		 */
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}

	}

}
