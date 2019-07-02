package com.zyx.set.demo;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet类继承HashSet类
 * LinkedHashSet自身特性是：具有顺序，即存储和取出的顺序是相同的
 * 它也是线程不安全的
 * @author ASUS
 *
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer>link=new LinkedHashSet<Integer>();
		link.add(11);
		link.add(22);
		link.add(33);
		link.add(33);
		link.add(44);
		
		System.out.println(link);

	}

}
