package com.zyx.Map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * ��Map�ӿ��ڣ���һ��Ƕ�׽ӿڣ�Entry��Entry����ֵ�ԵĶ�Ӧ��ϵ��װ���˶��󡣼���ֵ�Զ���
 * �ӿ�Map.Entry<K,V>����������getKey()��getValue()����Entry������Ե���������������ü���ֵ��
 * Map�ӿ����и�entrySet()���������صľ���һ��set���ϣ�Set<Map.Entry<K,V>>
 * 
 *  Map���ϻ�ȡ��ʽ
 *  entrySet����,��ֵ��ӳ���ϵ(���֤)��ȡ
 *  ʵ�ֲ���:
 *    1. ����map���Ϸ���entrySet()�������е�ӳ���ϵ����,�洢��Set����
 *        Set<Entry <K,V> >
 *    2. ����Set����
 *    3. ��ȡ����Set���ϵ�Ԫ��,��ӳ���ϵ����
 *    4. ͨ��ӳ���ϵ���󷽷� getKet, getValue��ȡ��ֵ��
 *    
 *    �����ڲ������ �ⲿ��.�ڲ��� = new 
 */
public class MapDemo3 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "bcd");
		map.put(3, "cde");
		//1. ����map���Ϸ���entrySet()�������е�ӳ���ϵ����,�洢��Set����
		Set<Map.Entry <Integer,String> >  set = map.entrySet();
		//2. ����Set����
		Iterator<Map.Entry <Integer,String> > it = set.iterator();
		while(it.hasNext()){
			//  3. ��ȡ����Set���ϵ�Ԫ��,��ӳ���ϵ����
			// it.next ��ȡ����ʲô����,Ҳ��Map.Entry����
			Map.Entry<Integer, String> entry = it.next();
			//4. ͨ��ӳ���ϵ���󷽷� getKet, getValue��ȡ��ֵ��
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"...."+value);
		}
		
		System.out.println("=========================");
		/**
		 * ��ǿforѭ���ܲ��ܱ���Map��ǧ���˵�ܣ���Ϊ�ĵ��е�Iterable�ӿ��е��ӽӿں�ʵ����û��map����£����Բ��ܱ���map����Ϊmapû�и��ӿڡ�
		 * �������ǿ��Ա���set��ͨ������setʵ���˱���Map������˵��ǿfor���ܱ���Map�����Ա���Set
		 */
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+"..."+entry.getValue());
		}

	}

}
