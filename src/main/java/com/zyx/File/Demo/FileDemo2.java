package com.zyx.File.Demo;

import java.io.File;

/*
 *  File��Ĺ��췽��
 *  ����������ʽ
 */
public class FileDemo2 {
	public static void main(String[] args) {
		function_2();
	}
	/*
	 *  File(File parent,String child)
	 *  ����·��,����File���͸�·��,�ַ�����·��
	 *  �ô�: ��·����File����,��·������ֱ�ӵ���File�෽��
	 */
	public static void function_2(){
		File parent = new File("d:");
		File file = new File(parent,"eclipse");
		System.out.println(file);
	}
	
	/*
	 *  File(String parent,String child)
	 *  ����·��,�����ַ�����·��,�ַ�����·��
	 *  �ô�: ����������·������·��
	 */
	public static void function_1(){
		File file = new File("d:","eclipse");
		System.out.println(file);
	}
	
	/*
	 *  File(String pathname)
	 *  ����·����: ����д���ļ���,����д��һ���ļ�
	 *  c:\\abc   c:\\abc\\Demo.java
	 *  ��·����װFile���Ͷ���
	 */
	public static void function(){
		File file = new File("d:\\eclipse");
		System.out.println(file);
	}
}
