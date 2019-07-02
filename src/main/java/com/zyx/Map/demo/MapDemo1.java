package com.zyx.Map.demo;

import java.util.HashMap;
import java.util.Map;
/*
 * Collection��Mapû�й�ϵ��Collectionֻ�ܴ�һ�����󣬵�������Map����Ǽ�ֵ�Ե��������󣬷��޹�ϵ
 *  Map�ӿ��еĳ��÷���
 *    ʹ��Map�ӿڵ�ʵ���� HashMap
 */
public class MapDemo1 {

	public static void main(String[] args) {
		//function1();
		//function2();
		function3();

	}
	/*
	 *  ����ֵ�Դ洢��������
	 *  V put(K,V) K ��Ϊ���Ķ���, V��Ϊֵ�Ķ���
	 *  �洢�����ظ��ļ�,��ԭ�е�ֵ,����
	 *  ����ֵһ������·���null,
	 *  �洢�ظ�����ʱ��,���ر�����֮ǰ��ֵ
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
	 * ͨ��������,��ȡֵ����
	 * V get(K)
	 * ���������û�������,����null
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
	 *  �Ƴ������еļ�ֵ��,���ر��Ƴ�֮ǰ��ֵ
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