package com.zyx.reflect.demo3;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 *   ���弯����,����String
 *   Ҫ���򼯺������Integer����
 *   
 *   ���䷽ʽ,��ȡ������ArrayList���class�ļ�����
 *   ͨ��class�ļ�����,����add����
 *   
 *   �Է�����÷����Ƿ����
 */
public class ReflectTest {
	public static void main(String[] args)throws Exception {
		ArrayList<String> array  = new ArrayList<String>();
		array.add("a");
		//���䷽ʽ,��ȡ������ArrayList���class�ļ�����
		Class c = array.getClass();
		//��ȡArrayList.class�ļ��еķ���add���ڶ���������add�������βε�����
		Method method = c.getMethod("add",Object.class);
		//ʹ��invoke����ArrayList����add
		method.invoke(array, 150);
		method.invoke(array, 1500);
		method.invoke(array, 15000);
		System.out.println(array);
		
		
	}
}
