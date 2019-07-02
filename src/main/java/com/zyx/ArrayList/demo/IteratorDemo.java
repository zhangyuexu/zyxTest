package com.zyx.ArrayList.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator接口找实现类：
 * Collection接口中定义的方法有Iterator<E> iterator()
 * ArrayList是Collection的实现类，重写里面的iterator()方法，返回了Iterator接口的实现类的对象
 * Iteratro it=ArrayList.iterator();//利用多态的特性，结果返回的是实现类的的对象
 * it是接口的实现类的对象，调用方法hasNext()和next()进行集合迭代
 * @author ASUS
 *
 */
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c=new ArrayList<String>();
		c.add("abc");
		c.add("abc");
		c.add("efg");
		Iterator<String> it=c.iterator();//调用集合中的Iterator方法，结果返回的是实现类的的对象
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
	}

}
