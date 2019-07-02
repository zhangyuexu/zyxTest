package com.zyx.set.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util 
 * �ӿ� Set<E>
 * ���и���ӿڣ� Collection<E>, Iterable<E> 
 * ������֪ʵ���ࣺAbstractSet,HashSet,LinkedHashSet, TreeSet 
 * Set<E>�ӿڲ��������ظ����ݣ�������
 * Set����ȡ��Ԫ�ط�ʽֻ�����֣�����������ǿforѭ��
 * Set�ײ�ʵ�ֲ������飬���Բ���Listһ��������ȡֵ
 * Set�ĵײ㱾����HashMap,������HashMap
 * 
 *�� HashSet<E>
 *java.lang.Object
     �̳��� java.util.AbstractCollection<E>
       �̳��� java.util.AbstractSet<E>
          �̳��� java.util.HashSet<E>
������ʵ�ֵĽӿڣ� 
Serializable, Cloneable, Iterable<E>, Collection<E>, Set<E> 

ֱ����֪���ࣺ 
LinkedHashSet 
HashSet<E>����ʵ�� Set �ӿڣ��ɹ�ϣ��ʵ������һ�� HashMap ʵ����֧�֡�������֤ set �ĵ���˳���ر���������֤��˳���ò��䡣��������ʹ�� null Ԫ�ء�
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
