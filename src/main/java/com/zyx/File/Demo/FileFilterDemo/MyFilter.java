package com.zyx.File.Demo.FileFilterDemo;

import java.io.File;
import java.io.FileFilter;

/*
 *  �Զ��������
 *  ʵ��FileFilter�ӿ�,��д���󷽷�
 */
public class MyFilter implements FileFilter{
	public boolean accept(File pathname)  {
		/*
		 * pathname ���ܵ���Ҳ���ļ���ȫ·��
		 * c:\\demo\\1.txt
		 * ��·�������ж�,�����java�ļ�,����true,����java�ļ�,����false
		 * �ļ��ĺ�׺��β��.java
		 */
		//String name = pathname.getName();
		return pathname.getName().endsWith(".java");
		
	}
}
