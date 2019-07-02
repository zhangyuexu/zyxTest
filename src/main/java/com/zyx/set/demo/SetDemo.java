package com.zyx.set.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util 
 * 接口 Set<E>
 * 所有父类接口： Collection<E>, Iterable<E> 
 * 所有已知实现类：AbstractSet,HashSet,LinkedHashSet, TreeSet 
 * Set<E>接口不允许存放重复数据，但无序；
 * Set集合取出元素方式只有两种：迭代器和增强for循环
 * Set底层实现不是数组，所以不像List一样按索引取值
 * Set的底层本质是HashMap,它依赖HashMap
 * 
 *类 HashSet<E>
 *java.lang.Object
     继承者 java.util.AbstractCollection<E>
       继承者 java.util.AbstractSet<E>
          继承者 java.util.HashSet<E>
所有已实现的接口： 
Serializable, Cloneable, Iterable<E>, Collection<E>, Set<E> 

直接已知子类： 
LinkedHashSet 
HashSet<E>此类实现 Set 接口，由哈希表（实际上是一个 HashMap 实例）支持。它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。此类允许使用 null 元素。
 */
public class SetDemo {

	public static void main(String[] args) {
		Set<String>set=new HashSet<String>();
		set.add("qwe");
		set.add("asd");
		set.add("zxc");
		
		Iterator<String>it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("=========================");
		for(String s:set){
			System.out.println(s);
		}

	}

}
