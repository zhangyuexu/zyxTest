package com.zyx.Map.demo;

import java.util.LinkedHashMap;

/*
 *  LinkedHashMap�̳�HashMap
 *  ��֤������˳��
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> link=new LinkedHashMap<String, String>();
		link.put("1", "a");
		link.put("13", "a");
		link.put("15", "a");
		link.put("17", "a");
		System.out.println(link);
	}

}
