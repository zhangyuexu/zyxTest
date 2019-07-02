package com.zyx.reflect.demo4;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 *  ����Person����,����Student����,����Worker����
 *  �಻���,����Ҳ�����
 *  ͨ�������ļ�ʵ�ִ˹���
 *    ���е������ͷ�������,�Լ�ֵ�Ե���ʽ,д���ı���
 *    �����ĸ���,��ȡ�����ļ�����
 *  ʵ�ֲ���:
 *    1. ׼�������ļ�,��ֵ��
 *    2. IO����ȡ�����ļ�  Reader
 *    3. �ļ��еļ�ֵ�Դ洢�������� Properties
 *        ���ϱ���ļ�ֵ��,���������ͷ�����
 *    4. �����ȡָ�����class�ļ�����
 *    5. class�ļ�����,��ȡָ���ķ���
 *    6. ���з���
 */
public class Test {
	public static void main(String[] args) throws Exception{
		//IO����ȡ�����ļ�
		FileReader r = new FileReader("config.properties");
		//�������϶���
		Properties pro = new Properties();
		//���ü��Ϸ���load,����������
		pro.load(r);
		r.close();
		//ͨ������ȡֵ
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		//�����ȡָ�����class�ļ�����
		Class c = Class.forName(className);
		Object obj = c.newInstance();
		//��ȡָ���ķ�����
		Method method = c.getMethod(methodName);
		method.invoke(obj);
	}
}
