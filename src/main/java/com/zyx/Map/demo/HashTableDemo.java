package com.zyx.Map.demo;

import java.util.Hashtable;
import java.util.Map;

/*
 *  Map�ӿڵ���һ��ʵ���� Hashtable
 *  �ײ����ݽṹҲ�ǹ�ϣ��,�ص��HashMap��һ����
 *  Hashtable �̰߳�ȫ����,�����ٶ���
 *  HashMap �̲߳���ȫ�ļ���,�����ٶȿ�
 *  
 *  Hashtable���˺�Vector��һ����,��JDK1.2��ʼ,�����Ƚ���HashMapȡ��
 *  
 *  HashMap ����洢nullֵ,null��
 *  Hashtable ������洢nullֵ,null��
 *  
 *  Hashtable�ĺ���,������ Properties ��Ȼ��Ծ�ڿ�����̨
 */
public class HashTableDemo {

	public static void main(String[] args) {
		Map<String, String>map=new Hashtable<String, String>();
		map.put(null, null);
		System.out.println(map);//�ᱨ��

	}

}
